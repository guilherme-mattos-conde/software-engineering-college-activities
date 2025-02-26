import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();
        Scanner s = new Scanner(System.in);

        System.out.println("Quantas frutas deseja informar?");
        int tamanho = s.nextInt();
        s.nextLine();

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Fruta " + (i + 1) + ": ");
            frutas.add(s.nextLine());
        }

        System.out.println("Frutas: " + String.join(", ", frutas) + ".");

        s.close();
    }
}
