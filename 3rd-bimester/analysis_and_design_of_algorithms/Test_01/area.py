def calcular_area_comodos(): #funcao sem parametros, para calcular a area de quantos comodos o usuário quiser
    total_area = 0 #declaração de variável

    while True: #laço que só vai ser quebrado quando a variável 'mais_comodos' receber algo diferente de s
        largura = float(input("Digite a largura do cômodo (em metros): ")) #declaracao de variável, que vai receber o valor que o usuário digitar
        comprimento = float(input("Digite o comprimento do cômodo (em metros): ")) #declaracao de variável, que  vai receber o valor que o usuário digitar

        area_comodo = largura * comprimento #declaracao de variável, que vai receber a área do comodo atual
        print(f"A área deste cômodo é: {area_comodo:.2f} metros quadrados.") #print da área do comodo atual

        total_area += area_comodo #a variável 'total_area' soma o valor do comodo atual em seu valor

        mais_comodos = input("Deseja adicionar mais cômodos? (s/n): ").strip().lower() #declaracao de variavel, que recebe a resposta do usuário se ele vai ou não adicionar mais comodos

        #verifica se a resposta do usuário foi diferente de 's', se foi ele finaliza o código
        if mais_comodos != 's':
            break

    return total_area #retorna a variável total_area

area_total = calcular_area_comodos() #declaração de variável, que recebe o valor retornado pela funcao 'calcular_area_comodos'
print(f"A área total da casa é: {area_total:.2f} metros quadrados.") #print ddo valor da area total