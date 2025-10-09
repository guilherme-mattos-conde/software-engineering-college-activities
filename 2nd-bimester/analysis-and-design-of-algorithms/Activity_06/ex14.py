def soma_numeros(n):
    soma = 0
    for i in range(1, n + 1):
        soma += i
    return soma

def soma_numeros_recursiva(n):
    if n == 0:
        return
    return n + soma_numeros(n - 1)
    
print(soma_numeros(3))
print(soma_numeros_recursiva(3))