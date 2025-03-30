<template>
    <section>
        <h2>Tema do Projeto</h2>
        <div>
            <p class="pgf">O projeto é um jogo de perguntas e respostas com temática RPG. Os jogadores escolhem personagens e se
            enfrentam em batalhas baseadas em turnos, respondendo perguntas de múltipla escolha.</p>
            <img class="img" src="/images/tela-inicial.png" alt="">
        </div>
        <div>
            <img class="img" src="/images/selecao-personagem.png" alt="">
            <p class="pgf">Foi escolhido esse tema por sua capacidade de unir diversão e aprendizado, tornando o processo educacional
            mais atrativo para estudantes.</p>
        </div>
        <div>
            <p class="pgf">A extensão curricular é uma ponte entre o conhecimento acadêmico e sua aplicação prática na sociedade. Este
            projeto integra conceitos aprendidos em aula, como lógica, programação e design, aplicando-os em um produto
            real.</p>
            <img class="img" src="/images/selecao-habilidade.png" alt="">
        </div>
    </section>
</template>

<style scoped>
section {
    display: flex;
    flex-direction: column;
    align-items: center;
    color: white;
    padding: 50px 0;
    background-image: url("/public/images/fundo-tema.png");
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;

    h2 {
        font-size: 25pt;
    }

    div {
        display: flex;
        flex-direction: row;
        justify-content: space-between;
        align-items: center;
        width: 80vw;
        max-width: 1100px;
        margin: 50px 0;
    }
}

.pgf {
    width: 30vw;
    max-width: 500px;
    text-align: justify;
    line-height: 1.6rem;
    font-size: 15pt;
}

.img {
    width: 30vw;
    max-width: 500px;
    border-radius: 20px;
    box-shadow: 0 0 15px 10px black;
}
</style>