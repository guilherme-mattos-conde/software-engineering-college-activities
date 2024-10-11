package view;

import java.util.Scanner;

public class CalculadoraView {
    Scanner s = new Scanner(System.in);

    public double getNumero() {
        System.out.println("Digite um número:");
        return s.nextDouble();
    }

    public String getOperacao() {
        System.out.println("Escolha a operação (+, -, *, /):");
        return s.next();
    }

    public void exibirResultado(double resultado) {
        System.out.println("O resultado é: " + resultado);
    }

    public void exibirErro(String e) {
        System.out.println("Erro: " + e);
    }
}
