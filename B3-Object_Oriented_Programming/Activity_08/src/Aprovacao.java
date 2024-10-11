import java.util.Scanner;

public class Aprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota final do aluno: ");
        int nota = scanner.nextInt();

        if (nota >= 70) {
            System.out.println("Aprovado");
        } else if (nota < 30) {
            System.out.println("Reprovado");
        } else {
            System.out.println("De Exame");
        }

        scanner.close();
    }
}
