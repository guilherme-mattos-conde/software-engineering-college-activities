def multiplicacao_vetores(A, B):
    elementos_A = len(A)
    elementos_B = len(B)

    resultado = 0

    for i in range(elementos_A):
        resultado += A[i] * B[i]
        
    return resultado

A = [1, 2, 3, 1, 1]
B = [1, 2, 5, 1, 4]

if len(A) == len(B):
    resultado = multiplicacao_vetores(A, B)

    print("Produto interno dos vetores:")
    print(resultado)
else:
    print("Erro: Número de elementos incompatíveis!")
