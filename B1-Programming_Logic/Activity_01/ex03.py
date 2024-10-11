def potencia(base, expoente):
    if expoente == 0:
        return 1
    else:
        return base * potencia(base, expoente - 1)

base = float(input("Digite a base: "))
expoente = int(input("Digite o expoente: "))

print(f"{base} ^ {expoente} = {potencia(base, expoente)}")
