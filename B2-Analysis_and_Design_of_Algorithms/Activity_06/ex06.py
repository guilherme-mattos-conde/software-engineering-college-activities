def imprimir_lista(lista):
    for elemento in lista:
        print(elemento)

def imprimir_lista_recursiva(lista):
    if  len(lista) == 0:
        return
    print(lista[0])
    imprimir_lista_recursiva(lista[1:])

lista = [1, 2, 3, 4, 5]

print(imprimir_lista(lista))
print(imprimir_lista_recursiva(lista))