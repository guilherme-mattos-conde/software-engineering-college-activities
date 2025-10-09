const btnPesquisa = document.getElementById('btn-pesquisa')
const inputPesquisa = document.getElementById('pesquisa');

btnPesquisa.addEventListener('click', () => {
    if (inputPesquisa.value.length != 0) {
        pesquisarLivro()
    }
})

inputPesquisa.addEventListener('keydown', (e) => {
    if (e.key === "Enter") {
        if (inputPesquisa.value.length != 0) {
            pesquisarLivro()
        }
    }
})

function pesquisarLivro() {
    let query = inputPesquisa.value.replace(' ', '+')
    window.location = `pesquisa-livro.html?q=${query}`
}
