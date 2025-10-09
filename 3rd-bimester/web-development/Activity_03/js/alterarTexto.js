const form = document.getElementById('form-alterar-texto')
const inputTexto = document.getElementById('alterar-texto')
const texto = document.getElementById('texto')

form.addEventListener('submit', (e) => {
    e.preventDefault()
    if (inputTexto.value === '') {
        alert('Preencha o campo corretamente!')
    } else {
        texto.textContent = inputTexto.value
        inputTexto.value = ''
    }
})
