def mdc(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def mdc_recursiva(a, b):
    if b == 0:
        return a
    else:
        return mdc_recursiva(b, a % b)

print(mdc(12, 50))
print(mdc_recursiva(12, 50))