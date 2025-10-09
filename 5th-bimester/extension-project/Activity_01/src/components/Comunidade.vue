<template>
    <section>
        <h2>Comunidade</h2>
        <div>
            <img class="img" src="/images/comunidade.jpg" alt="">
            <p class="pgf"><strong>Público-alvo:</strong> estudantes com mais de 10 anos, especialmente os interessados em
                jogos de RPG
                e desafios de perguntas.
                <br><br>
                <strong>Benefícios:</strong> o projeto estimula o raciocínio lógico, promove o aprendizado de forma
                divertida
                e pode ser utilizado como ferramenta educacional em salas de aula.
            </p>
        </div>
    </section>
</template>

<style scoped>
section {
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 50px 0;
    background-color: black;
    color: white;

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
}
</style>