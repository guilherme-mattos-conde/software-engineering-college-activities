def fatorial(n):
    resultado = 1
    for i in range(2, n + 1):
        resultado *= i
    return resultado

def fatorial_recursiva(n):
    if n == 0:
        return 1
    return n * fatorial_recursiva(n - 1)

print(fatorial(5))
print(fatorial_recursiva(5))