import API_KEY from "../apiKey.js";

export default function adicionarLivros(query) {
    const maxResults = 10;
    const imagemPadrao = './assets/imagem-padrao.png'
    const url = `https://www.googleapis.com/books/v1/volumes?q=${query}&maxResults=${maxResults}&key=${API_KEY}`;

    fetch(url)
        .then(response => response.json())
        .then(data => {
            const books = data.items;
            const carrossel = document.getElementById(`${query}`);
            books.forEach((e) => {
                const id = e.id;
                const informacoesGerais = e.volumeInfo;
                const titulo = informacoesGerais.title;
                const capa = informacoesGerais.imageLinks ? informacoesGerais.imageLinks.thumbnail : imagemPadrao;

                carrossel.innerHTML += `
                    <div class="swiper-slide">
                        <a href="detalhes-livro.html?id=${id}">
                            <img id="capa-livro" src="${capa}" alt="${titulo}">
                        </a>
                        <a href="detalhes-livro.html?id=${id}">
                            <p id="titulo-livro">${titulo}</p>
                        </a>
                    </div>`;
            });

            new Swiper(`.swiper-container-${query}`, {
                navigation: {
                    nextEl: `.swiper-button-next-${query}`,
                    prevEl: `.swiper-button-prev-${query}`,
                },
                loop: true,
                breakpoints: {
                    300: {
                        slidesPerView: 1,
                        spaceBetween: 10
                    },
                    400: {
                        slidesPerView: 2,
                        spaceBetween: 20
                    },
                    600: {
                        slidesPerView: 3,
                        spaceBetween: 30
                    },
                    800: {
                        slidesPerView: 4,
                        spaceBetween: 30
                    },
                    1000: {
                        slidesPerView: 5,
                        spaceBetween: 30
                    },
                    1200: {
                        slidesPerView: 6,
                        spaceBetween: 30
                    }
                }
            });
        })
        .catch(error => console.error('Error fetching books:', error));
}
