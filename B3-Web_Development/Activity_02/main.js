const numeros = document.querySelectorAll(".numeros")
const operadores = document.querySelectorAll(".operadores")
const funcoes = document.querySelectorAll(".funcoes")
var numeroAtual = document.getElementById("numeroAtual")
var operacaoAtual = document.getElementById("operacaoAtual")
var operacaoSalva = ""
var resultado = 0

window.addEventListener('DOMContentLoaded', () => limparCalculadora())

console.log(numeros, operadores, funcoes)
numeros.forEach((e) => e.addEventListener(('click'), (e) => {
    let valorBotao = e.target.textContent

    numeroAtual.textContent = numeroAtual.textContent.replace(/0+|/, '') + valorBotao
}))

operadores.forEach((e) => e.addEventListener(('click'), (e) => {
    let valorBotao = e.target.textContent
    operacoes(operacaoSalva)
    numeroAtual.textContent = 0
    operacaoSalva = valorBotao
    operacaoAtual.textContent = resultado + " " + operacaoSalva
}))

funcoes.forEach((e) => e.addEventListener(('click'), (e) => {
    let valorBotao = e.target.textContent

    switch (valorBotao) {
        case "AC": limparCalculadora(); break;
        case "=":
            operacoes(operacaoSalva)
            operacaoSalva = "="
            operacaoAtual.textContent += " " + numeroAtual.textContent + " ="
            numeroAtual.textContent = resultado
    }
}))

function operacoes(operacao) {
    var num = parseInt(numeroAtual.textContent)

    switch (operacao) {
        case "+": resultado += num; break;
        case "-": resultado -= num; break;
        case "x": resultado *= num; break;
        case "÷": resultado /= num; break;
        case "": resultado += num; break;
    }
}

function limparCalculadora() {
    operacaoAtual.textContent = ""
    numeroAtual.textContent = 0
    operacaoSalva = ""
    resultado = 0
}
