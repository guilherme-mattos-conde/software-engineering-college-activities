from robocorp.tasks import task
from robocorp import browser
from pathlib import Path
from urllib.parse import urljoin
import csv

BASE = "https://books.toscrape.com/"
START_URL = BASE + "catalogue/page-1.html"  # começa direto no catálogo
OUTDIR = Path("output"); OUTDIR.mkdir(exist_ok=True)

def _norm(txt: str | None) -> str:
    return " ".join((txt or "").split())

def _get_author_from_detail(page) -> str:
    # O site padrão não mostra "Author"; mantemos "N/A" para fins didáticos.
    try:
        author = page.locator("table tr:has(th:has-text('Author')) td").first.inner_text(timeout=400)
        return _norm(author) or "N/A"
    except:
        return "N/A"

@task
def livros_com_light(headless: bool = True):
    """
    Percorre todas as páginas do catálogo e coleta livros cujo título contém 'light'
    (case-insensitive). Salva: titulo, autor (se houver), preco em output/livros_light.csv.
    """
    browser.configure(browser_engine="chromium", headless=headless)
    page = browser.page()

    url = START_URL
    resultados = []

    while True:
        page.goto(url, wait_until="domcontentloaded")
        page.wait_for_selector("section div ol.row li article.product_pod")

        # diagnóstico da 1ª página
        if not (OUTDIR / "page.html").exists():
            (OUTDIR / "page.html").write_text(page.content(), encoding="utf-8")
            page.screenshot(path=str(OUTDIR / "snap.png"))

        cards = page.locator("article.product_pod")
        count = cards.count()

        for i in range(count):
            card = cards.nth(i)
            link = card.locator("h3 a")
            title = link.get_attribute("title") or link.inner_text()
            title = _norm(title)

            if "light" in title.lower():
                preco = _norm(card.locator(".price_color").first.inner_text())

                # Pega href e transforma em absoluto com urljoin (SOLUÇÃO DO ERRO!)
                href_rel = link.get_attribute("href") or ""
                href_abs = urljoin(page.url, href_rel)  # <-- robusto p/ ../, ./, etc.

                # Abre detalhe para tentar "autor" (ficará N/A no site padrão)
                detail = browser.context().new_page()
                try:
                    detail.goto(href_abs, wait_until="domcontentloaded")
                    author = _get_author_from_detail(detail)  # normalmente "N/A"
                finally:
                    detail.close()

                resultados.append({
                    "titulo": title,
                    "autor": author,
                    "preco": preco
                })

        # próxima página?
        next_link = page.locator("li.next a")
        if next_link.count() == 0:
            break
        # monta URL absoluta da próxima página com urljoin também
        url = urljoin(page.url, next_link.get_attribute("href"))

    out = OUTDIR / "livros_light.csv"
    with out.open("w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=["titulo", "autor", "preco"])
        w.writeheader()
        w.writerows(resultados)

    print(f"[OK] {len(resultados)} livros salvos em {out}")
