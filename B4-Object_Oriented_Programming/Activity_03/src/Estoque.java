import java.util.ArrayList;

public class Estoque {
    private final ArrayList<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void exibirPrecos(double porcentagem) {
        for (Produto produto : produtos) {
            double valorFinal = produto.calcularDesconto(porcentagem);

            System.out.println("\nNome: " + produto.getNome());
            System.out.println("Valor inicial: R$" + String.format("%.2f", produto.getPreco()));
            System.out.println("Valor final: R$" + String.format("%.2f", valorFinal));

            if (valorFinal == produto.getPreco()) {
                System.out.println("Aviso: Desconto não aplicado (porcentagem fora do range [0-100])");
            }
        }
    }
}
