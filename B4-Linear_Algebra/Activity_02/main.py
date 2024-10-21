detA = int(input("Determinante de A: "))

if detA == 0:
    print("Solução única!")
else:
    detAx = int(input("Determinante de Ax: "))
    detAy = int(input("Determinante de Ay: "))

    if detAx == 0 and detAy == 0:
        print("Infinitas soluções!")
    else:
        print("Nenhuma solução!")
