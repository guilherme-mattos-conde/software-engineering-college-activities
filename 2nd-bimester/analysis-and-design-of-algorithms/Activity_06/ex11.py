def produto_lista(lista):
    produto = 1
    for num in lista:
        produto *= num
    return produto

def produto_lista_recursiva(lista):
    if not lista:
        return 1
    return lista[0] * produto_lista_recursiva(lista[1:])

lista = [1, 2, 3, 4, 5]

print(produto_lista(lista))
print(produto_lista_recursiva(lista))