def diagnosticar_diabetes(glicemia_em_jejum, glicemia_pos_prandial): #função que recebe o valor da glicemia em jejum e pós-prandial para diagnosticar diabetes

    #condicionais para verificar se o nível de glicemia corresponde a 'Diabetes', 'Pré-diabetes' ou 'Normal' e retornar esse valor
    if glicemia_em_jejum >= 126 or glicemia_pos_prandial >= 200:
        return "Diabetes"
    elif 100 <= glicemia_em_jejum < 126 or 140 <= glicemia_pos_prandial < 200:
        return "Pré-diabetes"
    else:
        return "Normal"

glicemia_em_jejum = float(input("Digite o valor da glicemia em jejum (mg/dL): ")) #declaracao de variável, que vai receber o valor que o usuário digitar
glicemia_pos_prandial = float(input("Digite o valor da glicemia pós-prandial (mg/dL): ")) #declaracao de variável, que vai receber o valor que o usuário digitar

resultado = diagnosticar_diabetes(glicemia_em_jejum, glicemia_pos_prandial) #declaração de variável, que recebe o valor retornado pela funcao 'diagnosticar_diabetes'
print(f"O diagnóstico é: {resultado}") #print do resultado