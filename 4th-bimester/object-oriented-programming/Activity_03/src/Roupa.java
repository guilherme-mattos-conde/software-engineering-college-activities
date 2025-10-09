public class Roupa extends Produto {
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    double calcularDesconto(double porcentagem) {
        return super.calcularDesconto(porcentagem + 5);
    }
}
