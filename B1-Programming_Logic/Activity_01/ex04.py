collatz = []

def sequencia_collatz(num):
    collatz.append(int(num))

    if num == 1:
        print("Sequência de Collatz:", collatz)
    elif num % 2 == 0:
        sequencia_collatz(num / 2)
    else:
        sequencia_collatz(3 * num + 1)

num = int(input("Digite um número inteiro positivo: "))

if num > 0:
    sequencia_collatz(num)
else:
    print("Valor inválido!")
