import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double num1 = s.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = s.nextDouble();

            exibirMenu();
            int opcao = s.nextInt();
            processarOpcao(opcao, num1, num2);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        s.close();
    }

    private static void exibirMenu() {
        System.out.println("Escolha a operação:");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        System.out.print("Opção: ");
    }

    private static void processarOpcao(int opcao, double num1, double num2) throws Exception {
        double resultado;

        switch (opcao) {
            case 1: resultado = num1 + num2; break;
            case 2: resultado = num1 - num2; break;
            case 3: resultado = num1 * num2; break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    throw new Exception("Divisão por zero não é permitida.");
                } break;
            default: System.out.println("Operação inválida."); return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
