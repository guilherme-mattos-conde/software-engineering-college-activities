def calcular_cedulas(valor):
    cedulas = [100, 50, 20, 10, 5]
    quantidade_cedulas = {}

    for cedula in cedulas:
        quantidade_cedulas[cedula] = valor // cedula
        valor %= cedula

    return quantidade_cedulas

valor = int(input("Digite um valor: "))
resto = valor % 5
    
quantidade_cedulas = calcular_cedulas(valor)

for cedula, quantidade in quantidade_cedulas.items():
    print(f"Cédulas de {cedula}: {quantidade}")

if resto != 0:
    print(f'Resto: {resto}')
