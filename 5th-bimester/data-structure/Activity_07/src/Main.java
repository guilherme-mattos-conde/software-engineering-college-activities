import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        int opcao;

        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome para adicionar: ");
                    String nome = scanner.nextLine();
                    nomes.add(nome);
                    System.out.println("Nome adicionado!");
                    break;
                case 2:
                    System.out.print("Digite o nome para remover: ");
                    String nomeRemover = scanner.nextLine();
                    if (nomes.remove(nomeRemover)) {
                        System.out.println("Nome removido!");
                    } else {
                        System.out.println("Nome não encontrado!");
                    }
                    break;
                case 3:
                    System.out.println("\nLista de Nomes:");
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum nome cadastrado.");
                    } else {
                        for (String n : nomes) {
                            System.out.println(n);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Adicionar nome");
        System.out.println("2. Remover nome");
        System.out.println("3. Listar nomes");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }
}
