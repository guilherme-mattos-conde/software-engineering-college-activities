#função que recebe o peso e a altura para calcular o imc e retorná-lo
def calcular_imc(peso, altura):
    imc = peso / (altura ** 2)
    return imc

#função que recebe o imc e, por meio de condicionais, o classifica
def classificar_imc(imc):
    if imc < 18.5:
        return "Abaixo do peso"
    elif 18.5 <= imc < 24.9:
        return "Peso normal"
    elif 25 <= imc < 29.9:
        return "Sobrepeso"
    elif 30 <= imc < 34.9:
        return "Obesidade grau 1"
    elif 35 <= imc < 39.9:
        return "Obesidade grau 2"
    else:
        return "Obesidade grau 3"

#função que recebe a classificação do imc e, por meio de condicionais, retorna uma sugestão de atividade fisica
def sugestao_atividade_fisica(classificacao_imc):
    if classificacao_imc == "Abaixo do peso":
        return "Sugere-se atividades de fortalecimento muscular, como musculação, e uma dieta rica em proteínas e calorias."
    elif classificacao_imc == "Peso normal":
        return "Sugere-se a manutenção com atividades aeróbicas regulares, como caminhada, corrida leve e natação, junto a um treino de força moderado."
    elif classificacao_imc == "Sobrepeso":
        return "Sugere-se atividades aeróbicas moderadas, como caminhada rápida, ciclismo e natação, além de exercícios de resistência."
    elif classificacao_imc == "Obesidade grau 1":
        return "Sugere-se atividades de baixo impacto, como caminhadas, natação e hidroginástica, junto a um programa de reeducação alimentar."
    elif classificacao_imc == "Obesidade grau 2":
        return "Sugere-se exercícios de baixo impacto com supervisão, como hidroginástica e pilates, e acompanhamento nutricional."
    else:
        return "Sugere-se atividades físicas supervisionadas por profissionais de saúde, como hidroginástica, fisioterapia, e consultas regulares com um nutricionista."

peso = float(input("Digite seu peso (em kg): ")) #declaracao de variável, que vai receber o valor que o usuário digitar
altura = float(input("Digite sua altura (em metros): ")) #declaracao de variável, que vai receber o valor que o usuário digitar

imc = calcular_imc(peso, altura) #declaracao de variável
classificacao_imc = classificar_imc(imc) #declaracao de variável
sugestao = sugestao_atividade_fisica(classificacao_imc) #declaracao de variável

#print do imc, classificação do imc e sugestão de atividade física
print(f"Seu IMC é: {imc:.2f}")
print(f"Classificação: {classificacao_imc}")
print(f"Sugestão de atividade física: {sugestao}")