vetor = [0,1,2,3,4,5,6,7,8,9]

busca = int(input("Digite um valor a ser encontrado no vetor: "))

if busca in vetor:
    posicao = vetor.index(busca)
    print(f"Número encontrado na posição {posicao}")
else:
    print("Número não encontrado...")