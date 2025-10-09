def caractere(s):
    for char in s:
        if not char.isalpha():
            return False
    return True

print(caractere("HelloWorld"))

def eh_caractere_recursiva(s):
    if len(s)==0:
        return True
    if s[0].isalpha():
        return eh_caractere_recursiva(s[1:])
    else:
        return False

print(eh_caractere_recursiva("HelloWorld"))
