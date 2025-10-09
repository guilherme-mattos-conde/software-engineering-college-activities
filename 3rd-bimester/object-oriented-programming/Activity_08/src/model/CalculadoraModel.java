package model;

public class CalculadoraModel {
    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double divisao(double num1, double num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }
}
