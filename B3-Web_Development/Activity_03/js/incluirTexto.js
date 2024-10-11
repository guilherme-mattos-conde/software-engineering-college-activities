const form = document.getElementById('form-incluir-texto')
const inputTexto = document.getElementById('incluir-texto')
const textos = document.getElementById('textos')


form.addEventListener('submit', (e) => {
    e.preventDefault()
    if (inputTexto.value === '') {
        alert('Preencha o campo corretamente!')
    } else {
        textos.innerHTML += `<div class="resultados"><p>${inputTexto.value}</p></div>`
        inputTexto.value = ''
    }
})
