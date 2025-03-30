<template>
    <section>
        <h2>Quem Somos</h2>
        <div class="membros">
            <div class="membro" v-for="membro in membros" :key="membro.nome">
                <div class="imagens">
                    <img class="foto" :src="'/images/' + membro.nome.toLowerCase().replace(/\s+/g, '-') + '.png'"
                        alt="Guilherme Mattos" />
                    <a :href="membro.github" target="blank"><img class="github" src="/images/github.png"></img></a>
                </div>
                <div class="informacoes">
                    <p class="nome">{{ membro.nome }}</p>
                    <p class="curso">{{ membro.curso }}</p>
                </div>
            </div>
        </div>
    </section>
</template>

<script setup>
import { ref } from "vue";

const membros = ref([
    {
        nome: "Guilherme Marobo Martins",
        curso: "Eng. de Software",
        github: "https://github.com/GuiMarobo",
    },
    {
        nome: "Guilherme Mattos Conde",
        curso: "Eng. de Software",
        github: "https://github.com/guilherme-mattos-conde",
    },
    {
        nome: "João Gabriel de Oliveira",
        curso: "Eng. de Software",
        github: "https://github.com/Doxzin",
    },
    {
        nome: "João Gabriel Macedo",
        curso: "Eng. de Software",
        github: "https://github.com/Macedo72",
    },
    {
        nome: "Felipe Pastorello Rocha",
        curso: "Eng. de Software",
        github: "https://github.com/Felipe-Pastorello ",
    }
]);

</script>

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
}

.membros {
    display: flex;
    justify-content: center;
    align-items: center;
    flex-wrap: wrap;
    max-width: 1000px;
}

.membro {
    display: flex;
    flex-direction: column;
    gap: 1rem;
    align-items: center;
    margin: 2rem 2rem;
    width: 250px;

    .nome {
        text-align: center;
        font-size: 13pt;
        margin: 0 10px 0 0;
        font-weight: bold;
    }

    .curso {
        text-align: center;
        font-size: 12pt;
        margin: 0;
    }

    .imagens {
        position: relative;

        .foto {
            width: 150px;
            border-radius: 50%;
        }

        .github {
            position: absolute;
            width: 40px;
            bottom: 0;
            right: 0;
            border-radius: 50%;
            border: 1px solid white;
        }
    }
}
</style>