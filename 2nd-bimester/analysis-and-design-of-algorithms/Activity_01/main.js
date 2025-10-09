var produto = document.getElementById('produto')
var quantidade = document.getElementById('quantidade')
var valor = document.getElementById('valor')
var desconto = document.getElementById('desconto')
const tabela = document.getElementById('tabela')
const formulario = document.getElementById('formulario')

window.addEventListener('DOMContentLoaded', limpaForm())

let id = 0
formulario.addEventListener('submit', (e) => {
    e.preventDefault()

    tabela.style.display = "unset"
    
    id++
    var quantidadeNum = parseInt(quantidade.value)
    var valorNum = parseFloat(valor.value)
    var descontoNum = parseFloat(desconto.value)
    var subtotal = (valorNum * quantidadeNum) - descontoNum
    
    tabela.innerHTML += `
    <tr>
        <td>${id}</td>
        <td>${produto.value}</td>
        <td>${quantidadeNum}</td>
        <td>${paraMoeda(valorNum)}</td>
        <td>${paraMoeda(descontoNum)}</td>
        <td>${paraMoeda(subtotal)}</td>
    </tr>`
    
    limpaForm()
})

function limpaForm () {
    produto.value = ""
    quantidade.value = ""
    valor.value = ""
    desconto.value = ""
}

function paraMoeda (num) {
    let moeda = num.toLocaleString('pt-BR', {style: 'currency', currency: 'BRL'})
    return moeda
}
