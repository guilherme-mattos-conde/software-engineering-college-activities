public class Acessorio extends Produto {
    public Acessorio(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    double calcularDesconto(double porcentagem) {
        return super.calcularDesconto(porcentagem + 10);
    }
}
