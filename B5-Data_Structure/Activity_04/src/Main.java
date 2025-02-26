import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros.add(s.nextInt());
        }

        Collections.sort(numeros);
        System.out.println("Números em ordem crescente: " + numeros);

        ArrayList<Integer> inverso = new ArrayList<>(numeros);
        Collections.reverse(inverso);
        System.out.println("Números em ordem inversa: " + inverso);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);

        s.close();
    }
}