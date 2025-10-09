# tasks.py
from pathlib import Path
from robocorp.tasks import task
from robocorp import browser

from RPA.HTTP import HTTP
from RPA.Excel.Files import Files

# PDF é opcional (wkhtmltopdf precisa estar no runtime)
try:
    from RPA.PDF import PDF
except Exception:  # se faltar a lib ou o wkhtmltopdf
    PDF = None

OUTPUT = Path("output")
OUTPUT.mkdir(exist_ok=True)

LOGIN_URL = "https://robotsparebinindustries.com/"
EXCEL_URL = "https://robotsparebinindustries.com/SalesData.xlsx"
EXCEL_FILE = "SalesData.xlsx"  # mantido na raiz para compatibilidade


@task
def robot_spare_bin_python():
    """Insere dados de vendas da semana e exporta resultados (PNG/PDF)."""
    # No Cloud, chromium é o engine mais confiável
    browser.configure(browser_engine="chromium", slowmo=100)  # headless padrão
    try:
        open_the_intranet_website()
        log_in()
        download_excel_file()
        fill_form_with_excel_data()
        collect_results()
        export_as_pdf()  # se wkhtmltopdf não estiver presente, salva .html
    finally:
        # Garante que vamos tentar sair e capturar um print final
        safe_screenshot("output/final_state.png")
        safe_logout()


def open_the_intranet_website():
    """Abre a página inicial do sistema."""
    browser.goto(LOGIN_URL)
    # Espera que o formulário de login esteja visível
    browser.page().wait_for_selector("#username", timeout=15000)


def log_in():
    """Preenche o login e clica em 'Log in'."""
    page = browser.page()
    page.fill("#username", "maria")
    page.fill("#password", "thoushallnotpass")
    page.click("button:text('Log in')")
    # Aguarda algum elemento da área logada (menu ou formulário de vendas)
    page.wait_for_selector("#firstname", timeout=15000)


def fill_and_submit_sales_form(sales_rep: dict):
    """Preenche os dados e envia o formulário de vendas."""
    page = browser.page()
    page.wait_for_selector("#firstname", timeout=15000)

    page.fill("#firstname", str(sales_rep.get("First Name", "")))
    page.fill("#lastname", str(sales_rep.get("Last Name", "")))

    # Select exige string
    target = str(sales_rep.get("Sales Target", "0"))
    page.select_option("#salestarget", target)

    page.fill("#salesresult", str(sales_rep.get("Sales", "0")))

    page.click("text=Submit")

    # Se houver mensagem/resultado, aguarde um pequeno tempo para registrar
    page.wait_for_timeout(300)  # pequeno debounce


def download_excel_file():
    """Baixa o arquivo Excel necessário."""
    http = HTTP()
    # overwrite=True garante atualização
    http.download(url=EXCEL_URL, target_file=EXCEL_FILE, overwrite=True)


def fill_form_with_excel_data():
    """Lê dados do Excel e preenche o formulário."""
    excel = Files()
    try:
        excel.open_workbook(EXCEL_FILE)
        # Planilha usada nos tutoriais do RSB é normalmente "data"
        worksheet = excel.read_worksheet_as_table("data", header=True)
    finally:
        excel.close_workbook()

    for row in worksheet:
        fill_and_submit_sales_form(row)


def collect_results():
    """Tira um screenshot geral da página após os envios."""
    page = browser.page()
    page.wait_for_timeout(300)
    page.screenshot(path=str(OUTPUT / "sales_summary.png"))


def export_as_pdf():
    """Exporta resultados da área #sales-results para PDF (se possível)."""
    page = browser.page()
    # Aguarda a área de resultados (se existir na versão atual do site)
    try:
        page.wait_for_selector("#sales-results", timeout=5000)
        sales_results_html = page.locator("#sales-results").inner_html()
    except Exception:
        # Fallback: captura o HTML do body inteiro (melhor do que falhar)
        sales_results_html = page.content()

    html_doc = f"""
    <html>
      <head>
        <meta charset="utf-8" />
        <title>Sales Results</title>
      </head>
      <body>
        {sales_results_html}
      </body>
    </html>
    """.strip()

    pdf_path = OUTPUT / "sales_results.pdf"
    html_path = OUTPUT / "sales_results.html"

    if PDF is not None:
        try:
            pdf = PDF()
            pdf.html_to_pdf(html_doc, str(pdf_path))
            return
        except Exception:
            # Se falhar por falta de wkhtmltopdf, salva como HTML
            pass

    # Fallback: salva HTML para inspeção
    html_path.write_text(html_doc, encoding="utf-8")


def safe_screenshot(filename: str):
    """Tira screenshot sem derrubar a execução se algo der errado."""
    try:
        browser.page().screenshot(path=filename)
    except Exception:
        pass


def safe_logout():
    """Tenta fazer logout; ignora erro se o botão não existir."""
    try:
        page = browser.page()
        page.click("text=Log out", timeout=1000)
    except Exception:
        pass