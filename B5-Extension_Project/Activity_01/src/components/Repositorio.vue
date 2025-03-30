<template>
    <section>
        <h2>Repositório</h2>
        <div>
            <p class="pgf">Clique no botão abaixo para acessar o repositório do nosso projeto no GitHub!</p>
            <a href="https://github.com/guilherme-mattos-conde/Rpg-Quiz-Game" target="blank"><button class="btn">Clique
                    aqui</button></a>
        </div>
    </section>
</template>

<style scoped>
section {
    display: flex;
    flex-direction: column;
    align-items: center;
    padding: 50px 0;
    background: linear-gradient(black, rgb(17, 10, 46));
    color: white;

    h2 {
        font-size: 25pt;
    }

    div {
        display: flex;
        flex-direction: column;
        align-items: center;
        gap: 2rem;
        margin: 20px;

        .btn {
            background-color: white;
            padding: 5px 10px;
            border: 2px solid black;
            border-radius: 8px;
            font-size: 13pt;
            transition: .5s;
        }

        .btn:hover {
            background-color: rgb(240, 130, 35);
            cursor: pointer;
        }
    }
}

.pgf {
    max-width: 700px;
    text-align: justify;
    line-height: 1.6rem;
    font-size: 15pt;
}
</style>