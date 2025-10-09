public class ServicoCompra {
    private ServicoFrete servicoFrete;

    public ServicoCompra() {
        this.servicoFrete = new ServicoFrete();
    }

    public Double calcularPrecoCompra(Compra compra) {
        return servicoFrete.calcularFrete(compra) + compra.getValor();
    }

    public double calcularCompraParcelada(Compra compra) {
        double juros = 0.0;
        juros = compra.getValor() * 0.1;

        return servicoFrete.calcularFrete(compra) + compra.getValor() + juros;
    }

    public double calcularCompraPix(Compra compra) {
            return servicoFrete.calcularFrete(compra) + compra.getValor();
    }

    public double calcularCompraBoleto(Compra compra) {
        double juros = 0.0;
        juros = compra.getValor() * 0.1;

        return servicoFrete.calcularFrete(compra) + compra.getValor() + juros;
    }
}
