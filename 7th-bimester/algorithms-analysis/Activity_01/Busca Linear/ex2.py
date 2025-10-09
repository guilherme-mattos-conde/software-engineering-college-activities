vetor1 = [12, 45, 67, 89, 23, 56, 78, 90, 11, 34, 55, 72, 88, 99, 1, 25, 47, 63, 81, 100]
vetor2 = [44, 66, 23, 77, 15, 92, 33, 50, 61, 80, 21, 34, 45, 67, 89, 90, 100, 7, 18, 29]
vetor3 = [5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100]

vetores = [vetor1, vetor2, vetor3]

valor = int(input("Digite o valor que deseja buscar: "))

def busca_linear(vetor, valor):
    posicoes = []
    comparacoes = 0
    for i, elemento in enumerate(vetor):
        comparacoes += 1
        if elemento == valor:
            posicoes.append(i)
    return posicoes, comparacoes

for i, vetor in enumerate(vetores, start=1):
    posicoes, comp = busca_linear(vetor, valor)
    if posicoes:
        print(f"\nVetor {i}: Valor {valor} encontrado nas posições {posicoes}.")
    else:
        print(f"\nVetor {i}: Valor {valor} NÃO encontrado.")
    print(f"Comparações realizadas: {comp}")
