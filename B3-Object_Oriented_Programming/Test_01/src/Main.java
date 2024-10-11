import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Insira os dados do produto:");
        System.out.print("Nome: ");
        produto.setNome(s.next());
        System.out.print("Código: ");
        produto.setCodigo(s.next());
        System.out.print("Preço: ");
        produto.setPreco(s.nextDouble());
        System.out.print("Quantidade: ");
        produto.setQuantidade(s.nextInt());
        System.out.print("Garantia(meses): ");
        produto.setGarantia(s.nextInt());
        System.out.print("Ano de Fabricação: ");
        produto.setAnoFabricacao(s.nextInt());

        System.out.println(produto);

        int opcao = 0;

        while (opcao != 5) {
            mostrarMenu();
            opcao = s.nextInt();
            processarOpcao(opcao, s, produto);
        }
    }

    private static void mostrarMenu() {
        System.out.println();
        System.out.println("[1] Imprimir valor total do estoque");
        System.out.println("[2] Imprimir dados do produto");
        System.out.println("[3] Realizar alteração no valor do produto");
        System.out.println("[4] Aumentar tempo de garantia do produto");
        System.out.println("[5] Sair");
        System.out.print("Opção: ");
    }

    private static void processarOpcao(int opcao, Scanner s, Produto produto) {
        switch (opcao) {
            case 1: valorTotalEstoque(produto); break;
            case 2: System.out.println(produto); break;
            case 3: aumentarPreco(s, produto); break;
            case 4: aumentarGarantia(s, produto); break;
            case 5: System.out.println("\nSaindo..."); break;
            default: System.out.println("\nValor inválido!");
        }
    }

    public static void valorTotalEstoque(Produto produto) {
        System.out.println();

        String valorTotal = String.format("%.2f", produto.getPreco() * produto.getQuantidade());
        System.out.println("R$" + valorTotal);
    }

    private static void aumentarPreco(Scanner s, Produto produto) {
        System.out.println();

        if (produto.getAnoFabricacao() < 2020) {
            System.out.println("Produto anterior a 2020, " +
                    "alteração não poderá ser realizada!");
        } else {
            System.out.println("Quantos porcento deseja aumentar o valor do produto?");
            double aumento = s.nextDouble();
            double porcentagem = aumento / 100;

            double novoPreco = produto.getPreco() + (produto.getPreco() * porcentagem);
            produto.setPreco(novoPreco);
            System.out.println("Preço alterado!");
        }
    }

    public static void aumentarGarantia(Scanner s, Produto produto) {
        System.out.println();

        if (produto.getAnoFabricacao() > 2015) {
            System.out.println("Quantos aumentar a garantia do produto em quantos meses?");
            int tempo = s.nextInt();

            int novaGarantia = produto.getGarantia() + tempo;
            produto.setGarantia(novaGarantia);
            System.out.println("Garantia alterada!");
        } else {
            System.out.println("Produto anterior a 2015, " +
                    "alteração não poderá ser realizada!");
        }
    }
}
