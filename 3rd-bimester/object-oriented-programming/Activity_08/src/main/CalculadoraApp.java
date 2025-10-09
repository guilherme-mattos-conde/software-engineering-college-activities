package main;

import model.CalculadoraModel;
import view.CalculadoraView;
import controller.CalculadoraController;

public class CalculadoraApp {
    public static void main(String[] args) {
        CalculadoraModel model = new CalculadoraModel();
        CalculadoraView view = new CalculadoraView();
        CalculadoraController controller = new CalculadoraController(model, view);

        controller.calcular();
    }
}
