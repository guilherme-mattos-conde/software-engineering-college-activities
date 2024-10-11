import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Gerente:");
            System.out.print("Nome: ");
            String nomeGerente = s.nextLine();
            System.out.print("Salário: ");
            double salarioGerente = s.nextDouble();
            System.out.print("Bônus: ");
            double bonus = s.nextDouble();
            s.nextLine();

            Gerente gerente = new Gerente(nomeGerente, salarioGerente, bonus);

            System.out.println();
            System.out.println("Desenvolvedor:");
            System.out.print("Nome: ");
            String nomeDesenvolvedor = s.nextLine();
            System.out.print("Salário: ");
            double salarioDesenvolvedor = s.nextDouble();
            s.nextLine();
            System.out.print("Liguagem Favorita: ");
            String liguagemFavorita = s.nextLine();

            Desenvolvedor dev = new Desenvolvedor(nomeDesenvolvedor, salarioDesenvolvedor, liguagemFavorita);

            System.out.println(gerente);
            System.out.println("Salário Final: R$" + String.format("%.2f", gerente.calcularSalario()));
            System.out.println(dev);
            System.out.println("Salário Final: R$" + String.format("%.2f", dev.calcularSalario()));

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }
}
