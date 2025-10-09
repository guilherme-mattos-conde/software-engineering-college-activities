import random

def inicializar_campo(linhas, colunas, minas):
    campo = [[' ' for _ in range(colunas)] for _ in range(linhas)]
    minas_pos = set()
    
    while len(minas_pos) < minas:
        pos = (random.randint(0, linhas-1), random.randint(0, colunas-1))
        minas_pos.add(pos)
    
    for (x, y) in minas_pos:
        campo[x][y] = 'M'
    
    return campo, minas_pos

def imprimir_campo(campo):
    print("  " + " ".join(map(str, range(1, len(campo[0]) + 1))))
    for idx, linha in enumerate(campo):
        print(str(idx + 1) + ' ' + ' '.join(linha))

def contar_minas(campo, x, y):
    linhas = len(campo)
    colunas = len(campo[0])
    minas = 0
    for i in range(max(0, x-1), min(linhas, x+2)):
        for j in range(max(0, y-1), min(colunas, y+2)):
            if campo[i][j] == 'M':
                minas += 1
    return minas

# Função recursiva para revelar células
def revelar_celulas(campo, campo_mostrar, x, y, jogadas_reveladas):
    if (x, y) in jogadas_reveladas:
        return
    jogadas_reveladas.add((x, y))
    
    minas_ao_redor = contar_minas(campo, x, y)
    campo_mostrar[x][y] = str(minas_ao_redor)
    
    if minas_ao_redor == 0:
        campo_mostrar[x][y] = ' '
        for i in range(max(0, x-1), min(len(campo), x+2)):
            for j in range(max(0, y-1), min(len(campo[0]), y+2)):
                if (i, j) != (x, y):
                    revelar_celulas(campo, campo_mostrar, i, j, jogadas_reveladas)

def jogar_campo_minado(linhas=3, colunas=8, minas=8):
    campo, minas_pos = inicializar_campo(linhas, colunas, minas)
    campo_mostrar = [['-' for _ in range(colunas)] for _ in range(linhas)]
    jogadas_reveladas = set()
    
    while True:
        imprimir_campo(campo_mostrar)
        
        try:
            x, y = map(int, input("Digite as coordenadas (linha e coluna) separadas por espaço: ").split())
            x -= 1
            y -= 1
        except ValueError:
            print("Entrada inválida. Tente novamente.")
            continue
        
        if (x, y) in jogadas_reveladas:
            print("Esta célula já foi revelada. Tente novamente.")
            continue
        
        if campo[x][y] == 'M':
            print("Você pisou em uma mina! Fim de jogo.")
            imprimir_campo(campo)
            break
        else:
            revelar_celulas(campo, campo_mostrar, x, y, jogadas_reveladas)
            
            if len(jogadas_reveladas) == linhas * colunas - minas:
                print("Parabéns! Você venceu!")
                imprimir_campo(campo)
                break

jogar_campo_minado()
