import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            String nome = s.nextLine();

            System.out.print("Idade de " + nome + ": ");
            int idade = s.nextInt();

            System.out.print("Altura de " + nome + " (m): ");
            double altura = s.nextDouble();
            s.nextLine();

            pessoas.add(new Pessoa(nome, idade, altura));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.nome + " tem " + p.idade + " anos e " + p.altura + "m de altura.");
        }

        s.close();
    }
}
