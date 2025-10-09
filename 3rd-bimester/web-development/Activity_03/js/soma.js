const form = document.getElementById('form-soma')
const num1 = document.getElementById('num1')
const num2 = document.getElementById('num2')
const resultado = document.getElementById('resultado')

form.addEventListener('submit', (e) => {
    e.preventDefault()
    if(num1.value === '' || num2.value === '') {
        alert('Preencha os campo corretamente!')
    } else {
        let soma = parseInt(num1.value) + parseInt(num2.value)
        resultado.textContent = `${num1.value} + ${num2.value} = ${soma}`
        num1.value = ''
        num2.value = ''
        resultado.style.display = "flex"
    }
})
