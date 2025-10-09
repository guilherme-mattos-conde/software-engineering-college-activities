import API_KEY from "./apiKey.js";
import formatarData from "./utils/formatarData.js";

function getQueryParam(param) {
    const urlParams = new URLSearchParams(window.location.search);
    return urlParams.get(param);
}

const id = getQueryParam('id');
const imagemPadrao = './assets/imagem-padrao.png'
const url = `https://www.googleapis.com/books/v1/volumes/${id}?key=${API_KEY}`;

fetch(url)
    .then(response => response.json())
    .then(data => {
        const detalhesLivro = document.getElementById('detalhes-livro');
        const informacoesGerais = data.volumeInfo;
        const linkLeitura = data.accessInfo.webReaderLink;
        const titulo = informacoesGerais.title;
        const subtitulo = informacoesGerais.subtitle;
        const autor = informacoesGerais.authors ? informacoesGerais.authors.join(', ') : 'Sem Autor';
        const editora = informacoesGerais.publisher;
        const dataLancamento = formatarData(informacoesGerais.publishedDate);
        const paginas = informacoesGerais.pageCount;
        const descricao = informacoesGerais.description ? informacoesGerais.description : 'Sem descrição';
        const capa = informacoesGerais.imageLinks ? informacoesGerais.imageLinks.thumbnail : imagemPadrao;

        detalhesLivro.innerHTML += `
            <div id=container>
                <img id="capa" src="${capa}">
                <div>
                    <h1 id="titulo">${titulo}</h1>
                    ${subtitulo ? `<h2 id="subtitulo">${subtitulo}</h2>` : ''}
                    <div id="informacoes">
                        <p><b>Autor:</b> ${autor}</p>
                        <p><b>Editora:</b> ${editora}</p>
                        <p><b>Lançamento:</b> ${dataLancamento}</p>
                        <p><b>Número de páginas:</b> ${paginas}</p>
                    </div>
                    <div id=botao>
                        <a target="blank" href="${linkLeitura}">Ler Agora</a>
                    </div>
                </div>
            </div>
            <div id="descricao">
                <p>${descricao}</p>
            </div>`;
    })
    .catch(error => console.error('Error fetching books:', error));
