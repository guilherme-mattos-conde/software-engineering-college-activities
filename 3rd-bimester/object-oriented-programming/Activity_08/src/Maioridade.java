import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();

        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println(resultado);

        s.close();
    }
}
