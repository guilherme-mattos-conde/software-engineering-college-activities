import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pilha pilha = new Pilha();
        int opcao;

        do {
            mostrarMenu();
            opcao = s.nextInt();
            s.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = s.nextLine();
                    pilha.empilhar(titulo);
                    break;
                case 2:
                    String removido = pilha.desempilhar();
                    if (removido != null) {
                        System.out.println("Livro \"" + removido + "\" removido do topo.");
                    } else {
                        System.out.println("Pilha vazia!");
                    }
                    break;
                case 3:
                    String topo = pilha.verTopo();
                    if (topo != null) {
                        System.out.println("Livro no topo: \"" + topo + "\"");
                    } else {
                        System.out.println("Pilha vazia!");
                    }
                    break;
                case 4:
                    System.out.println(pilha.estaVazia() ? "Pilha vazia!" : "Pilha não vazia!");
                    break;
                case 5:
                    pilha.exibir();
                    break;
                case 6:
                    System.out.println("Encerrando gerenciador...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);

        s.close();
    }
    private static void mostrarMenu() {
        System.out.println("\n--- Menu do Gerenciador de Livros ---");
        System.out.println("1 - Adicionar novo livro à pilha");
        System.out.println("2 - Remover o livro do topo");
        System.out.println("3 - Ver o livro no topo");
        System.out.println("4 - Verificar se a pilha está vazia");
        System.out.println("5 - Exibir todos os livros");
        System.out.println("6 - Sair");
        System.out.print("Esolha uma opção: ");
    }
}
