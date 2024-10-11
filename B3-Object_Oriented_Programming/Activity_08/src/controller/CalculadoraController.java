package controller;

import model.CalculadoraModel;
import view.CalculadoraView;

public class CalculadoraController {
    private final CalculadoraModel model;
    private final CalculadoraView view;

    public CalculadoraController(CalculadoraModel model, CalculadoraView view) {
        this.model = model;
        this.view = view;
    }

    public void calcular() {
        double num1 = view.getNumero();
        double num2 = view.getNumero();
        String operacao = view.getOperacao();

        double resultado = 0;

        try {
            switch (operacao) {
                case "+":
                    resultado = model.soma(num1, num2);
                    break;
                case "-":
                    resultado = model.subtracao(num1, num2);
                    break;
                case "*":
                    resultado = model.multiplicacao(num1, num2);
                    break;
                case "/":
                    resultado = model.divisao(num1, num2);
                    break;
                default:
                    throw new Exception("Operação inválida.");
            }
            view.exibirResultado(resultado);
        } catch (Exception e) {
            view.exibirErro(e.getMessage());
        }
    }
}
