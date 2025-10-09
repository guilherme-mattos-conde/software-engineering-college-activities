<template>
    <section class="banner">
        <header>
            <a href="https://unifil.br/" target="blank"><img src="/images/logo-unifil.png" alt="Logo UniFil" height="60" /></a>
            <ul class="menu">
                <a href="#apresentacao"><li>Apresentação</li></a>
                <a href="#quem-somos"><li>Quem Somos</li></a>
                <a href="#tema"><li>Tema do Projeto</li></a>
                <a href="#comunidade"><li>Comunidade</li></a>
                <a href="#repositorio"><li>Repositório</li></a>
            </ul>
        </header>
        <div>
            <h1>Duelo de Perguntas RPG</h1>
        </div>
    </section>
</template>

<style scoped>
.menu {
    display: flex;
    list-style: none;

    a {
        text-decoration: none;
        color: rgb(176, 176, 176);
    }

    li {
        margin: 0 8px;
        transition: .5s;
    }
    li:hover {
        color: white;
    }
}

.banner {
    background-image: url("/public/images/banner.png");
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
    background-attachment: fixed;

    header {
        display: flex;
        justify-content: space-between;
        align-items: center;
        background-color: transparent;
        color: white;
        padding: 10px 80px;
        text-align: center;
        height: 80px;

        img {
            height: 45px;
        }
    }

    div {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 550px;

        h1 {
            color: white;
            font-size: 35pt;
        }
    }
}
</style>