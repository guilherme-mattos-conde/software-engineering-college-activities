import API_KEY from "./apiKey.js";
import formatarData from "./utils/formatarData.js";

function getQueryParam(param) {
    const urlParams = new URLSearchParams(window.location.search);
    return urlParams.get(param);
}

const query = getQueryParam('q');
const maxResults = 20
const imagemPadrao = './assets/imagem-padrao.png'
const url = `https://www.googleapis.com/books/v1/volumes?q=${query}&maxResults=${maxResults}&key=${API_KEY}`

fetch(url)
    .then(response => response.json())
    .then(data => {
        const books = data.items
        const gradeResultados = document.getElementById('grade-resultados')
        const tituloPesquisa = document.getElementById('titulo-pesquisa');

        if (books.length === 0) {
            tituloPesquisa.textContent = `Nenhum resultado encontrado para "${query.replace('+', ' ')}" :(`
        } else {
            tituloPesquisa.textContent += `
            ${books.length}
            ${(books.length === 1 ? " resultado encontrado" : " resultados encontrados")}
             para "${query.replace('+', ' ')}":`
             
            books.forEach((e) => {
                const id = e.id
                const informacoesGerais = e.volumeInfo
                const titulo = informacoesGerais.title
                const autor = informacoesGerais.authors ? informacoesGerais.authors.join(', ') : 'Sem Autor'
                const editora = informacoesGerais.publisher
                const dataLancamento = formatarData(informacoesGerais.publishedDate);
                const paginas = informacoesGerais.pageCount
                const capa = informacoesGerais.imageLinks ? informacoesGerais.imageLinks.thumbnail : imagemPadrao;

                gradeResultados.innerHTML += `
                    <li class="livros">
                        <a href="detalhes-livro.html?id=${id}">
                            <img class="capa" src="${capa}">
                        </a>
                        <div>
                            <a href="detalhes-livro.html?id=${id}">
                                <h1 class="titulo">${titulo}</h1>
                            </a>
                            <div class="informacoes">
                                <p><b>${informacoesGerais.authors.length > 1? "Autores:" : "Autor(a):"}</b> ${autor}</p>
                                <p><b>Editora:</b> ${editora}</p>
                                <p><b>Lançamento:</b> ${dataLancamento}</p>
                                <p><b>Número de páginas:</b> ${paginas}</p>
                            </div>
                        </div>
                    </li>`
            })
        }
    })
    .catch(error => console.error('Error fetching books:', error))
