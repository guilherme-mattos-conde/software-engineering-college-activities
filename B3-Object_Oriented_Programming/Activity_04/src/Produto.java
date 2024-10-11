public class Produto {
    private final String nome;
    private final double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionar(int quantidade) {
        this.quantidade += quantidade;
    }

    public void remover(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nPreco: R$" + String.format("%.2f", preco) +
                "\nQuantidade: " + quantidade;
    }
}
