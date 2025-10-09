def soma_lista(lista):
    soma = 0
    for num in lista:
        soma += num
    return soma

def soma_lista_recursiva(lista):
    if not lista:
        return 0
    else:
        return lista[0] + soma_lista_recursiva(lista[1:])

lista = [1, 2, 3, 4, 5]

print(soma_lista(lista))
print(soma_lista_recursiva(lista))