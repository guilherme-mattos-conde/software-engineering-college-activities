def soma_digitos(numero):
    soma = 0
    while numero > 0:
        soma += numero % 10
        numero //= 10
    return soma

def soma_digitos_recursiva(n):
    if n == 0:
        return 0
    return (n % 10) + soma_digitos_recursiva(n // 10)

print(soma_digitos(12))
print(soma_digitos_recursiva(12))