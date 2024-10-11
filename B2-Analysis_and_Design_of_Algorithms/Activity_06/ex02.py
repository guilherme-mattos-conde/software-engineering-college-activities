def contar_elementos(lista):
    contador = 0
    for _ in lista:
        contador += 1
    return contador

def contar_elementos_recursiva(lista):
    if len(lista) == 0:
        return 0
    return 1 + contar_elementos_recursiva(lista[1:])

lista = [1, 2, 3, 4, 5]

print(contar_elementos(lista))
print(contar_elementos_recursiva(lista))