def eh_palindromo(s):
    s = s.replace(" ", "").lower()

    return s == s[::-1]

print(eh_palindromo("radar"))

def eh_palindromo_recursiva(s):
    s = s.replace(" ", "").lower()
    
    if len(s) <= 1:
        return True
    if s[0] == s[-1]:
        return eh_palindromo_recursiva(s[1:-1])
    return False

print(eh_palindromo_recursiva("radar"))
