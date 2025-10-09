import adicionarLivros from "./utils/adicionarLivros.js";

const categorias = ['Programação', 'Gestão', 'Economia', 'Filosofia', 'Sociologia', 'História'];
const sectionLivros = document.getElementById('livros');

categorias.forEach((e) => {
    sectionLivros.innerHTML += `
        <div class="livros-row">
            <h1 class="categoria">${e}</h1>
            <div class="swiper-div">
                <div class="swiper-button-next swiper-button-next-${e}"></div>
                    <div class="swiper-container swiper-container-${e}">
                        
                        <div class="swiper-wrapper" id="${e}">
                        </div>
                    </div>
                <div class="swiper-button-prev swiper-button-prev-${e}"></div>
            </div>
        </div>`;
    
    adicionarLivros(e);
});
