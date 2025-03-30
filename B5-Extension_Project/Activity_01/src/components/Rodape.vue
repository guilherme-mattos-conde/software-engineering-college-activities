<template>
    <footer>
        <p>© {{ ano }} Duelo de Perguntas RPG. Projeto acadêmico UniFil.</p>
    </footer>
</template>

<script setup lang="ts">
import { ref } from "vue";

const ano = ref(new Date().getFullYear());
</script>

<style scoped>
footer {
    background-color: rgb(17, 10, 46);
    color: white;
    text-align: center;
    padding: 20px;
}
</style>