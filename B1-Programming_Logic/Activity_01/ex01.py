numeros = []
escolha = 0

def maior_valor(list):
    maior = max(list)
    print("O maior valor da lista é ", maior)

while escolha != 1:
    escolha = int(input("[0] Adicionar um número\n[1] Finalizar\n"))

    if escolha == 0:
        numeros.append(float(input("Insira o número o desejado: ")))
    elif escolha == 1:
        maior_valor(numeros)
    else:
        print("Valor não identificado!")
