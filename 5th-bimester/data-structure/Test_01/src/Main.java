import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a capacidade inicial da lista: ");
        int capacidade = scanner.nextInt();
        MinhaLista lista = new MinhaLista(capacidade);

        int opcao;
        do {
            mostrarMenu(); // Exibe o menu de opções
            opcao = scanner.nextInt();
            scanner.nextLine();

            processarOpcao(opcao, scanner, lista); // Processa a opção escolhida pelo usuário
        } while (opcao != 0); // Repete até que o usuário escolha sair

        scanner.close();
    }

    // Exibe o menu de opções para o usuário
    private static void mostrarMenu() {
        System.out.println("1 - Adicionar elemento");
        System.out.println("2 - Adicionar elemento em posição específica");
        System.out.println("3 - Buscar elemento por posição");
        System.out.println("4 - Buscar posição de um elemento");
        System.out.println("5 - Substituir elemento");
        System.out.println("6 - Remover elemento");
        System.out.println("7 - Exibir tamanho da lista");
        System.out.println("8 - Limpar lista");
        System.out.println("9 - Exibir lista");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    // Processa a opção escolhida pelo usuário
    private static void processarOpcao(int opcao, Scanner scanner, MinhaLista lista) {
        switch (opcao) {
            case 1: adicionarElemento(scanner, lista); break;
            case 2: adicionarElementoEmPosicao(scanner, lista); break;
            case 3: buscarElementoPorPosicao(scanner, lista); break;
            case 4: buscarPosicaoDeElemento(scanner, lista); break;
            case 5: substituirElemento(scanner, lista); break;
            case 6: removerElemento(scanner, lista); break;
            case 7: System.out.println("Tamanho da lista: " + lista.tamanho()); break;
            case 8:
                lista.limpar();
                System.out.println("Lista limpa!");
                break;
            case 9: System.out.println("Lista: " + lista); break;
            case 0: System.out.println("Saindo..."); break;
            default: System.out.println("Opção inválida!"); // Trata entrada inválida
        }
    }

    // Adiciona um elemento ao final da lista
    private static void adicionarElemento(Scanner scanner, MinhaLista lista) {
        System.out.print("Elemento: ");
        String e = scanner.nextLine();
        lista.adiciona(e);
    }

    // Adiciona um elemento em uma posição específica da lista
    private static void adicionarElementoEmPosicao(Scanner scanner, MinhaLista lista) {
        System.out.print("Posição: ");
        int posicao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Elemento: ");
        String e = scanner.nextLine();
        lista.adiciona(posicao, e);
    }

    // Busca um elemento por sua posição na lista
    private static void buscarElementoPorPosicao(Scanner scanner, MinhaLista lista) {
        System.out.print("Posição: ");
        int posicao = scanner.nextInt();
        System.out.println("Elemento encontrado: " + lista.busca(posicao));
    }

    // Busca a posição de um determinado elemento na lista
    private static void buscarPosicaoDeElemento(Scanner scanner, MinhaLista lista) {
        System.out.print("Elemento: ");
        String e = scanner.nextLine();
        int posicao = lista.busca(e);
        if (posicao == -1) {
            System.out.println("Elemento não encontrado!");
        } else {
            System.out.println("Posição: " + posicao);
        }
    }

    // Substitui um elemento em uma posição específica da lista
    private static void substituirElemento(Scanner scanner, MinhaLista lista) {
        System.out.print("Posição: ");
        int posicao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Novo Elemento: ");
        String e = scanner.nextLine();
        lista.substitui(posicao, e);
    }

    // Remove um elemento da lista com base em sua posição
    private static void removerElemento(Scanner scanner, MinhaLista lista) {
        System.out.print("Posição: ");
        int posicao = scanner.nextInt();
        lista.remove(posicao);
    }
}
