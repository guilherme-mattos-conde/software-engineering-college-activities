<template>
    <div id="app" >
        <Cabecalho />
        <Apresentacao id="apresentacao"/>
        <QuemSomos id="quem-somos"/>
        <TemaProjeto id="tema"/>
        <Comunidade id="comunidade"/>
        <Repositorio id="repositorio"/>
        <Rodape />
        <div v-if="seta" id="botao-voltar" @click="scrollToTop">
			<img src="/images/seta-cima.png">
		</div>
    </div>
</template>

<script setup>
import { ref, onMounted, onUnmounted } from "vue";
import Cabecalho from './components/Cabecalho.vue'
import Apresentacao from './components/Apresentacao.vue'
import QuemSomos from './components/QuemSomos.vue'
import TemaProjeto from './components/TemaProjeto.vue'
import Comunidade from './components/Comunidade.vue'
import Repositorio from './components/Repositorio.vue'
import Rodape from './components/Rodape.vue'

const seta = ref(false);

function handleScroll() {
    seta.value = window.scrollY >= 200;
}

function scrollToTop() {
    window.scrollTo({ top: 0, behavior: "smooth" });
}

onMounted(() => {
    window.addEventListener("scroll", handleScroll);
});

onUnmounted(() => {
    window.removeEventListener("scroll", handleScroll);
});

</script>

<style>
body {
    margin: 0;
    font-family: Arial, sans-serif;
}
html {
  scroll-behavior: smooth;
}
#botao-voltar img{
	width: 30px;
	height: 30px;
    transform: translate(25%, 25%);
}
#botao-voltar {
	position: fixed;
	justify-content: center;
	align-items: center;
	right: 20px;
	bottom: 100px;
	background: white;
	width: 45px;
	height: 45px;
	border-radius: 100%;
	opacity: 75%;
	transition: .5s;
}
#botao-voltar:hover {
	cursor: pointer;
	opacity: 100%;
	box-shadow: 0 0 15px white;
}
</style>