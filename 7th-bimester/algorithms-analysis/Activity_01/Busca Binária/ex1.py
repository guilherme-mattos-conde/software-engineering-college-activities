import random

vetor10 = [random.randint(1, 50) for _ in range(10)]
vetor100 = [random.randint(1, 200) for _ in range(100)]
vetor1000 = [random.randint(1, 1000) for _ in range(1000)]


# BUSCA LINEAR
def buscaLinearContando(vetor, alvo):
    for i, valor in enumerate(vetor):
        if valor == alvo:
            return i
    return -1


# BUSCA BINARIA
def buscaBinariaContando(vetor, alvo):
    vetor_ordenado = sorted(vetor)
    inicio, fim = 0, len(vetor_ordenado) - 1

    while inicio <= fim:
        meio = (inicio + fim) // 2
        if vetor_ordenado[meio] == alvo:
            return meio
        elif vetor_ordenado[meio] < alvo:
            inicio = meio + 1
        else:
            fim = meio - 1

    return -1


# testes
def testar(vetor, nome):
    print(f"\n Teste {nome}")
    print("Vetor gerado:", vetor[:20], "..." if len(vetor) > 20 else "")

    # Testes: primeiro, meio, último e fora
    testes = [vetor[0], vetor[len(vetor) // 2], vetor[-1], max(vetor) + 1]

    for teste in testes:
        pos_linear = buscaLinearContando(vetor, teste)
        pos_binaria = buscaBinariaContando(vetor, teste)

        print(f"Procurando {teste}:")
        if pos_linear != -1:
            print(f"  Linear → encontrado na posição {pos_linear}")
        else:
            print(f"  Linear → não encontrado (-1)")

        if pos_binaria != -1:
            print(
                f"  Binária → encontrado na posição {pos_binaria} (no vetor ordenado)"
            )
        else:
            print(f"  Binária → não encontrado (-1)")


testar(vetor10, "VETOR 10")
testar(vetor100, "VETOR 100")
testar(vetor1000, "VETOR 1000")
