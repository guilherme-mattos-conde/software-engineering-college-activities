import random

MAX_COL = 8
MAX_LIN = 3

campo = [[' ' for _ in range(MAX_COL)] for _ in range(MAX_LIN)]
bombas = [[' ' for _ in range(MAX_COL)] for _ in range(MAX_LIN)]
resultado = 'Jogando'

def inicializa_campo_recursivo(l=0, c=0):
    global campo, bombas
    if l >= MAX_LIN:
        return
    if c >= MAX_COL:
        inicializa_campo_recursivo(l + 1, 0)
        return

    campo[l][c] = ' '
    bombas[l][c] = ' '
    v = random.randint(1, 3)
    if v > 2:
        bombas[l][c] = 'X'

    inicializa_campo_recursivo(l, c + 1)

def imprimir_borda(ultimo):
    print('+', end='')
    for _ in range(MAX_COL):
        print('---+', end='')
    print()
    if not ultimo:
        print('|', end='')

def imprimir_campo_recursivo(l=0):
    if l >= MAX_LIN:
        imprimir_borda(True)
        return

    imprimir_borda(False)
    for c in range(MAX_COL):
        print(f' {campo[l][c]} |', end='')
    print(l + 1)

    imprimir_campo_recursivo(l + 1)

def valida_resultado():
    for l in range(MAX_LIN):
        for c in range(MAX_COL):
            if campo[l][c] == ' ' and bombas[l][c] == ' ':
                return 'Jogando'
    return 'Ganhou'

def main():
    global resultado
    inicializa_campo_recursivo()
    while resultado == 'Jogando':
        imprimir_campo_recursivo()
        print('Onde, vai jogar?')
        linha = 0
        while linha < 1 or linha > MAX_LIN:
            linha = int(input('Informe a linha: '))
            if linha < 1 or linha > MAX_LIN:
                print('Linha inválida')
        
        coluna = 0
        while coluna < 1 or coluna > MAX_COL:
            coluna = int(input('Informe a coluna: '))
            if coluna < 1 or coluna > MAX_COL:
                print('Coluna inválida')
        
        linha -= 1
        coluna -= 1
        
        if bombas[linha][coluna] == 'X':
            campo[linha][coluna] = 'B'
            resultado = 'Perdeu, acertou uma mina'
        else:
            campo[linha][coluna] = 'X'
            resultado = valida_resultado()
    
    imprimir_campo_recursivo()
    print(resultado)

if __name__ == "__main__":
    main()
