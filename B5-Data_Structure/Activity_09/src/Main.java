import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Fila fila = new Fila();
        int opcao;

        do {
            mostrarMenu();
            opcao = s.nextInt();
            s.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = s.nextLine();
                    fila.enfileirar(nome);
                    break;
                case 2:
                    String atendido = fila.desenfileirar();
                    if (atendido != null) {
                        System.out.println(atendido + " foi atendido.");
                    } else {
                        System.out.println("Fila vazia!");
                    }
                    break;
                case 3:
                    String proximo = fila.primeiro();
                    if (proximo != null) {
                        System.out.println("Próximo da fila: " + proximo);
                    } else {
                        System.out.println("Fila vazia!");
                    }
                    break;
                case 4:
                    System.out.println(fila.estaVazia() ? "Fila vazia!" : "Fila não vazia!");
                    break;
                case 5:
                    fila.exibir();
                    break;
                case 6:
                    System.out.println("Encerrando atendimento...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);

        s.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Menu de Atendimento ---");
        System.out.println("[1] Adicionar pessoa à fila");
        System.out.println("[2] Atender próxima pessoa");
        System.out.println("[3] Ver quem é o próximo da fila");
        System.out.println("[4] Verificar se a fila está vazia");
        System.out.println("[5] Exibir toda a fila");
        System.out.println("[6] Sair");
        System.out.print("Escolha uma opção: ");
    }
}
