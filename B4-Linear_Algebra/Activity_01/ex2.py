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

def exibe_matrizes(r1, r2):
    print("A * B:")
    
    for linha in r1:
        print(linha)
    
    print("B * A:")
    
    for linha in r2:
        print(linha)

def compara_matrizes(A, B):
    if A == B:
        print("Resultados iguais!")
    else:
        print("Resultados diferentes!")
    
A = [[1, -3, 2, 3], [2, 1, -3, 0], [4, -3, -1, 0]]
B = [[1, 4, 1], [2, 1, 1], [1, -2, 1], [3, 2, 0]]

if len(A[0]) == len(B):
    r1 = multiplicacao_matrizes(A, B)
    r2 = multiplicacao_matrizes(B, A)
    
    exibe_matrizes(r1, r2)
    compara_matrizes(r1, r2)
else:
    print("Erro: Número de linhas e colunas incompatíveis!")
