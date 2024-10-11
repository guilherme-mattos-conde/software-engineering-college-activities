def eh_primo(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def eh_primo_recursiva(n, i=2):
    if n <= 1:
        return False
    if i > int(n**0.5):
        return True
    if n % i == 0:
        return False
    return eh_primo_recursiva(n, i + 1)

print(eh_primo(5))
print(eh_primo_recursiva(5))