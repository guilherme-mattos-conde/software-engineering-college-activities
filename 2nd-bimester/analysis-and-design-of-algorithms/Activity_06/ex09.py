def menor_elemento(lista):
    menor = lista[0]
    for num in lista[1:]:
        if num < menor:
            menor = num
    return menor

def menor_elemento_recursiva(lista):
    if len(lista) == 1:
        return lista[0]
    menor = menor_elemento_recursiva(lista[1:])
    return lista[0] if lista[0] < menor else menor

lista = [1, 2, 3, 4, 5]

print(menor_elemento(lista))
print(menor_elemento_recursiva(lista))