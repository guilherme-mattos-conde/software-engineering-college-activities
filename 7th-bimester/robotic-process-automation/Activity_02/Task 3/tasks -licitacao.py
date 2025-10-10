from robocorp.tasks import task
from robocorp import browser
from pathlib import Path
from urllib.parse import urljoin
import csv
import re
import unicodedata

URL = "https://ibipora.eloweb.net/portaltransparencia/1/licitacoes"
OUT = Path("output"); OUT.mkdir(exist_ok=True)
CSV_FILE = OUT / "licitacoes_todas.csv"

RE_MOEDA = re.compile(r"R\$\s*[\d\.\,]+", re.I)

def norm_text(s: str | None) -> str:
    """Normaliza texto: remove NBSP, quebra de linha, múltiplos espaços e 'Ver Mais' sobrando."""
    if not s:
        return ""
    s = s.replace("\xa0", " ")            # NBSP
    s = s.replace("\u200b", "")           # zero width
    s = s.replace("…", "...")             # reticências
    s = s.replace("Ver Mais", "")         # lixeira do portal
    s = " ".join(s.split())               # colapsa espaços/linhas
    # normaliza acentuação (garante composição padrão)
    return unicodedata.normalize("NFC", s)

def clean_money(s: str) -> str:
    """Mantém formato BR no CSV; se vier dentro de um texto maior, extrai a moeda."""
    s = norm_text(s)
    m = RE_MOEDA.search(s)
    return m.group(0) if m else s

def accept_cookies(page):
    for sel in [
        'button:has-text("Aceitar")',
        'button:has-text("Concordo")',
        'button:has-text("OK")',
        '[data-testid="cookie-accept-all"]',
    ]:
        try:
            btn = page.locator(sel).first
            if btn.count() and btn.is_visible():
                btn.click()
                page.wait_for_timeout(250)
                break
        except:
            pass

def inside_frame(page):
    """A tabela pode estar no documento principal; se não, tente 1º iframe."""
    ifr = page.locator("iframe")
    if ifr.count():
        return page.frame_locator("iframe").first
    return page

def find_table(scope):
    # pelo cabeçalho 'Abertura'
    t = scope.locator("table:has(th:has-text('Abertura'))")
    if t.count():
        return t.first
    t = scope.locator("table").filter(has_text="Abertura")
    return t.first if t.count() else None

def header_index(headers: list[str], *keys: str) -> int:
    for i, h in enumerate(headers):
        H = h.lower()
        if any(k in H for k in keys):
            return i
    return -1

def extract_current_page(scope, page):
    """Extrai TODAS as linhas da página atual; retorna (rows, table_html)."""
    table = find_table(scope)
    if not table:
        return [], ""

    ths = table.locator("thead tr th")
    headers = [norm_text(ths.nth(i).inner_text()) for i in range(ths.count())]

    idx = {
        "abertura":  header_index(headers, "abertura"),
        "modalidade":header_index(headers, "modalidade"),
        "numero":    header_index(headers, "número", "numero"),
        "natureza":  header_index(headers, "natureza"),
        "procadm":   header_index(headers, "processo"),
        "situacao":  header_index(headers, "situação", "situacao", "status"),
        "valor_max": header_index(headers, "valor máximo", "valor estimado", "valor total", "valor"),
        "valor_hom": header_index(headers, "valor homologado"),
        "objeto":    header_index(headers, "objeto"),
    }

    rows_out = []
    rows = table.locator("tbody tr")
    for r in range(rows.count()):
        tr = rows.nth(r)
        tds = tr.locator("td")
        if not tds.count():
            continue

        def get(i: int, money=False):
            if i == -1 or i >= tds.count(): 
                return ""
            txt = tds.nth(i).inner_text()
            return clean_money(txt) if money else norm_text(txt)

        abertura   = get(idx["abertura"])
        modalidade = get(idx["modalidade"])
        numero     = get(idx["numero"])
        natureza   = get(idx["natureza"])
        procadm    = get(idx["procadm"])
        situacao   = get(idx["situacao"])
        valor_max  = get(idx["valor_max"], money=True)
        valor_hom  = get(idx["valor_hom"], money=True)
        objeto     = get(idx["objeto"])

        # link de detalhe (último link da linha)
        url_detalhe = ""
        try:
            links = tr.locator("a[href]")
            if links.count():
                url_detalhe = urljoin(page.url, links.last.get_attribute("href") or "")
        except:
            pass

        rows_out.append({
            "abertura": abertura,
            "modalidade": modalidade,
            "numero": numero,
            "natureza": natureza,
            "processo_adm": procadm,
            "situacao": situacao,
            "valor_maximo": valor_max,
            "valor_homologado": valor_hom,
            "objeto": objeto,
            "url_detalhe": url_detalhe,
        })

    return rows_out, table.inner_html()

def go_next_page(scope, page, last_html, timeout_ms=6000) -> bool:
    """
    Paginador do portal:
      <ul class="panel-pagination-inner">
        <li class="active"><a role="button">1</a></li>
        <li><a role="button">2</a></li> ...
    """
    try:
        active_li = scope.locator("ul.panel-pagination-inner li.active")
        if not active_li.count():
            return False
        nxt = active_li.locator("xpath=following-sibling::li[1]/a[@role='button']")
        if not nxt.count():
            return False

        nxt.scroll_into_view_if_needed()
        nxt.click()
        page.wait_for_timeout(400)

        # espera a TABELA mudar de verdade
        def table_html():
            t = find_table(scope)
            return t.inner_html() if t else ""

        for _ in range(int(timeout_ms/300)):
            new_html = table_html()
            if new_html and new_html != last_html:
                page.wait_for_timeout(250)
                return True
            page.wait_for_timeout(300)
    except:
        return False
    return False

@task
def licitacoes_todas_ibipora(headless: bool = False, max_pages: int = 200):
    """
    Extrai TODAS as licitações (todas as situações) de todas as páginas.
    Gera CSV amigável ao Excel (delimitador ';' e UTF-8 com BOM).
    """
    browser.configure(browser_engine="chromium", headless=headless, slowmo=0)
    page = browser.page()
    page.goto(URL, wait_until="domcontentloaded")
    page.wait_for_timeout(800)
    accept_cookies(page)

    scope = inside_frame(page)

    # coleta com paginação
    all_rows = []
    pages_done = 0
    while True:
        rows, html_before = extract_current_page(scope, page)
        all_rows.extend(rows)
        pages_done += 1
        if pages_done >= max_pages:
            break
        if not go_next_page(scope, page, html_before):
            break

    # salva CSV com ; e BOM (Excel BR abre certo)
    with CSV_FILE.open("w", newline="", encoding="utf-8-sig") as f:
        cols = [
            "abertura", "modalidade", "numero", "natureza", "processo_adm",
            "situacao", "valor_maximo", "valor_homologado", "objeto", "url_detalhe"
        ]
        w = csv.DictWriter(f, fieldnames=cols, delimiter=";", quotechar='"', quoting=csv.QUOTE_MINIMAL)
        w.writeheader()
        w.writerows(all_rows)

    print(f"[OK] {len(all_rows)} registros (páginas: {pages_done}) -> {CSV_FILE}")
