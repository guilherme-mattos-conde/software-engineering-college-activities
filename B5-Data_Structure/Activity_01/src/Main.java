import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        double media = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota do " +  (i + 1) + "º Bimestre: ");
            double nota = s.nextDouble();
            notas.add(nota);
            media += nota;
        }

        media /= notas.size();
        System.out.println("Média das notas: " + media);

        boolean x = true;

        while (x) {
            System.out.println("\nDeseja consultar algum bimestre?");
            System.out.println("[1] 1º Bimestre");
            System.out.println("[2] 2º Bimestre");
            System.out.println("[3] 3º Bimestre");
            System.out.println("[4] 4º Bimestre");
            System.out.println("[0] Sair");

            int opcao = s.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Finalizando...");
                    x = false;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Nota do " + opcao + "º Bimestre: " + notas.get(opcao - 1));
                    break;
                default:
                    System.out.println("Opção inexistente");
            }
        }

        s.close();
    }
}
