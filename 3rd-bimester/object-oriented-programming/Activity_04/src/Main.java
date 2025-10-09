import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Insira os dados do produto:");
        System.out.print("Nome: ");
        String nome = s.nextLine();
        System.out.print("Preço: ");
        double preco = s.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = s.nextInt();

        Produto produto = new Produto(nome, preco, quantidade);
        System.out.println(produto);

        int opcao = 0;

        while (opcao != 3) {
            mostrarMenu();
            opcao = s.nextInt();
            processarOpcao(opcao, s, produto);
        }
    }

    private static void mostrarMenu() {
        System.out.println("[1] Adicionar quantidade ao estoque");
        System.out.println("[2] Remover quantidade do estoque");
        System.out.println("[3] Sair");
        System.out.print("Opção: ");
    }

    private static void processarOpcao(int opcao, Scanner s, Produto produto) {
        switch (opcao) {
            case 1: adicionarQuantidadeEstoque(s, produto); break;
            case 2: removerQuantidadeEstoque(s, produto); break;
            case 3: System.out.println("Saindo..."); break;
            case 4: System.out.println("Valor inválido!");
        }
    }

    private static void adicionarQuantidadeEstoque(Scanner s, Produto produto) {
        System.out.print("\nInforme a quantidade a ser adicionada: ");
        int quantidade = s.nextInt();
        produto.adicionar(quantidade);
        System.out.println(produto);
    }

    private static void removerQuantidadeEstoque(Scanner s, Produto produto) {
        System.out.print("\nInforme a quantidade a ser removida: ");
        int quantidade = s.nextInt();
        produto.remover(quantidade);
        System.out.println(produto);
    }
}
