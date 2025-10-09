import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as informações do carro:");
        System.out.print("Placa: ");
        String placaCarro = scanner.next();
        System.out.print("Ano de Fabricação: ");
        int anoCarro = scanner.nextInt();
        System.out.print("Número de Portas: ");
        int numeroPortas = scanner.nextInt();
        scanner.nextLine();

        Carro carro = new Carro(placaCarro, anoCarro, numeroPortas);

        System.out.println("\nInsira as informações da moto:");
        System.out.print("Placa: ");
        String placaMoto = scanner.next();
        System.out.print("Ano de Fabricação: ");
        int anoMoto = scanner.nextInt();
        System.out.print("Tipo de Freio: ");
        String tipoFreio = scanner.next();

        Moto moto = new Moto(placaMoto, anoMoto, tipoFreio);

        System.out.println(carro);
        System.out.println(moto);
        
        scanner.close();
    }
}
