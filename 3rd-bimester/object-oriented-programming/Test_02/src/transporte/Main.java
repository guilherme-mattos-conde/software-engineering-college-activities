package transporte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        String opcao = "";

        try {
            while (!opcao.equalsIgnoreCase("n")) {
                System.out.print("Tipo de Veículo (1-Caminhão, 2-Carro): ");
                int veiculo = s.nextInt();
                System.out.print("Ano de Fabricação: ");
                int anoFabricacao = s.nextInt();
                s.nextLine();
                System.out.print("Placa: ");
                String placa = s.nextLine();
                System.out.print("Valor (R$): ");
                double valor = s.nextDouble();
                System.out.print(veiculo == 1 ?
                        "Capacidade de Carga(Toneladas): " :
                        "Tipo de Combustível(Gasolina, Álcool, Flex): ");

                if(veiculo == 1) {
                    double capacidadeCarga = s.nextDouble();
                    s.nextLine();
                    Caminhao caminhao = new Caminhao(placa, anoFabricacao, valor, capacidadeCarga);
                    veiculos.add(caminhao);
                } else if (veiculo == 2) {
                    s.nextLine();
                    String tipoCombustivel = s.nextLine();
                    Carro carro = new Carro(placa, anoFabricacao, valor, tipoCombustivel);
                    veiculos.add(carro);
                } else {
                    throw new Exception("Tipo de veículo não encontrado!");
                }

                System.out.print("Adicionar outro veículo? (s/n): ");
                opcao = s.nextLine();
            }

            veiculos.forEach(veiculo -> {
                System.out.println(veiculo);
                System.out.println("Seguro: R$" + String.format("%.2f", veiculo.calcularSeguro()));
            });
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        s.close();
    }
}
