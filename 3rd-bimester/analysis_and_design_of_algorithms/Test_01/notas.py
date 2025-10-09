#função que recebe um objeto notas e a nota mínima de aprovação para verificar quem passou ou não e qual a média da turma
def calcular_media_e_aprovacao(notas, nota_minima_aprovacao):
    total_notas = 0 #declaração de variavel
    num_alunos = len(notas) #declaração de variável, que recebe o valor do tamanho do objeto notas
    aprovados = [] #declaração de array vazio
    reprovados = [] #declaração de array vazio

    #funciona como o forEach() do js, verificando cada conjunto aluno e nota, do objeto notas
    for aluno, nota in notas.items():
        total_notas += nota #a variável 'total_notas' soma o valor da nota atual em seu valor

        #condicional para verificar se a nota do aluno é maior ou igual a nota mínima de aprovação
        if nota >= nota_minima_aprovacao:
            aprovados.append(aluno) #adiciona o nome do aluno para o array 'aprovados'
        else:
            reprovados.append(aluno) #adiciona o nome do aluno para o array 'reprovados'

    media_turma = total_notas / num_alunos #declaração de variável, que recebe o valor da média da turma

    return media_turma, aprovados, reprovados #retorna as variáveis 'media_turma', 'aprovados', 'reprovados'

#declaração de objeto
notas = {
    "Alice": 85,
    "Bruno": 72,
    "Carlos": 60,
    "Diana": 95,
    "Eduardo": 55
}

nota_minima_aprovacao = 70 #declaração de variavel

media_turma, aprovados, reprovados = calcular_media_e_aprovacao(notas, nota_minima_aprovacao) #declaração de três variáveis, que vão receber o retorno da função 'calcular_media_e_aprovacao'

#print da media da turma, alunos aprovados e reprovados
print(f"Média da turma: {media_turma:.2f}")
print(f"Alunos aprovados: {', '.join(aprovados)}")
print(f"Alunos reprovados: {', '.join(reprovados)}")