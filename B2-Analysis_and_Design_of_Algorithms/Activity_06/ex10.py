def potencia(base, expoente):
    resultado = 1
    for _ in range(expoente):
        resultado *= base
    return resultado

def potencia_recursiva(base, expoente):
    if expoente == 0:
        return 1
    return base * potencia_recursiva(base, expoente - 1)

print(potencia(4, 2))
print(potencia_recursiva(4, 2))