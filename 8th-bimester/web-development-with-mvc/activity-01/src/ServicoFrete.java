public class ServicoFrete {
    private static double FRETE = 10.00;

    public Double calcularFrete(Compra compra) {
        double freteEfetivo = FRETE;

        if(compra.getQuantidadeItens() > 10) {
            freteEfetivo += 10;
        }

        return freteEfetivo;
    }
}
