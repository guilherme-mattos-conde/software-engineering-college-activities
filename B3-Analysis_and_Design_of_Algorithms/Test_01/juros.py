def calcular_juros_atraso(valor_principal, taxa_juros_anual, dias_atraso): #função que recebe o valor, a taxa de juros e os dias de atraso para calcular os juros
    taxa_juros_diaria = taxa_juros_anual / 365 / 100 #declaração de variável, que recebe a taxa de juros diaria

    juros = valor_principal * taxa_juros_diaria * dias_atraso #declaracao de variável, que recebe o valor do juros

    valor_total = valor_principal + juros #declaracao de variável, que recebe o valor total, ou seja, valor inicial mais os juros
    return valor_total, juros #retorna as variáveis valor_total e juros

valor_principal = 1000.00 #declaração de variável
taxa_juros_anual = 5.0 #declaração de variável
dias_atraso = 30 #declaração de variável
valor_total, juros = calcular_juros_atraso(valor_principal, taxa_juros_anual, dias_atraso) #declaração de duas variaveis, que vão receber o retorno da função 'calcular_juros_atraso'
print(f"Valor total a ser pago: R${valor_total:.2f}") #print do valor da variável 'valor_total'
print(f"Valor dos juros: R${juros:.2f}") #print do valor da variável 'juros'