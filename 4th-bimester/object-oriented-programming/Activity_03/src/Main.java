import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Estoque produtos = new Estoque();
        Produto camiseta = new Roupa("Camiseta", 89.9);
        Produto bone = new Acessorio("Boné", 59.9);

        produtos.adicionarProduto(camiseta);
        produtos.adicionarProduto(bone);

        produtos.exibirPrecos(15);
    }
}
