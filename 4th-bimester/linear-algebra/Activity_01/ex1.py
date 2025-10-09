def multiplicacao_matrizes(A, B):
    linhas_A = len(A)
    colunas_A = len(A[0])
    colunas_B = len(B[0])

    resultado = [[0 for _ in range(colunas_B)] for _ in range(linhas_A)]

    for i in range(linhas_A):
            for j in range(colunas_B):
                for k in range(colunas_A):
                    resultado[i][j] += A[i][k] * B[k][j]
        
    return resultado

A = [[1, 2, 3], [3, 4, 3]]
B = [[5, 6], [7, 8]]

if len(A[0]) == len(B):
    resultado = multiplicacao_matrizes(A, B)

    print("Multiplicação de Matrizes:")
    
    for linha in resultado:
        print(linha)
else:
    print("Erro: Número de linhas e colunas incompatíveis!")
