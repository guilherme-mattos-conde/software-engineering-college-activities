def contar_vogais(frase):
    vogais = "aeiouAEIOU"
    contador = 0

    for i in frase:
        if i in vogais:
            contador += 1

    return contador

frase = input("Digite uma frase: ")

print("O número de vogais na frase é: ", contar_vogais(frase))
