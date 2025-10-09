#função que recebe a distancia, valor do combustivel, consumo do veiculo, numero de pedagios e o custo dos pedagios para calcular o custo da viagem
def calcular_custo_viagem(distancia, custo_combustivel, consumo_veiculo, numero_pedagios, custo_pedagio):

    custo_combustivel_total = (distancia / consumo_veiculo) * custo_combustivel #declaração de variável, que vai receber o custo total em combustível

    custo_pedagio_total = numero_pedagios * custo_pedagio #declaração de variável, que vai receber o custo total em pedágios

    custo_total = custo_combustivel_total + custo_pedagio_total #declaração de variável, que vai receber o custo total da viagem

    return custo_total, custo_combustivel_total, custo_pedagio_total #retorna as variáveis 'custo_total', 'custo_combustivel_total', 'custo_pedagio_total'

#declaração de variáveis, que vão receber os valores que o usuário digitar
distancia = float(input("Digite a distância da viagem (em km): "))
custo_combustivel = float(input("Digite o custo do combustível por litro (em R$): "))
consumo_veiculo = float(input("Digite o consumo do veículo (km por litro): "))
numero_pedagios = int(input("Digite o número de pedágios no percurso: "))
custo_pedagio = float(input("Digite o custo de um pedágio (em R$): "))

#declaração de três variaveis, que vão receber o retorno da função 'calcular_custo_viagem'
custo_total, custo_combustivel_total, custo_pedagio_total = calcular_custo_viagem(distancia, custo_combustivel, consumo_veiculo, numero_pedagios, custo_pedagio)

#print do custo total da viagem, do combustível e do pedagio
print(f"Custo total da viagem: R${custo_total:.2f}")
print(f"Custo total com combustível: R${custo_combustivel_total:.2f}")
print(f"Custo total com pedágios: R${custo_pedagio_total:.2f}")