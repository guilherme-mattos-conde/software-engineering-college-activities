def eh_palindromo(palavra):
    return palavra == palavra[::-1]

def eh_palindromo_recursiva(palavra):
    if len(palavra) <= 1:
        return True
    else:
        return palavra[0] == palavra[-1] and eh_palindromo_recursiva(palavra[1:-1])

print(eh_palindromo("radar"))
print(eh_palindromo_recursiva("radar"))