def contagem_regressiva(n):
    while n > 0:
        print(n)
        n -= 1

def contagem_regressiva_recursiva(n):
    if n == 0:
        return 0
    print(n)
    return contagem_regressiva_recursiva(n - 1)

print(contagem_regressiva(5))
print(contagem_regressiva_recursiva(5))