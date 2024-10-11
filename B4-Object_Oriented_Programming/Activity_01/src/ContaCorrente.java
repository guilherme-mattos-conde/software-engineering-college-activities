public class ContaCorrente extends ContaBancaria {
    private double limiteDeCredito;
    private double taxaManutencao;
    private int quantidadeTransacoes;

    public ContaCorrente(String titular, double saldo, String numeroConta, double limiteDeCredito, double taxaManutencao, int quantidadeTransacoes) {
        super(titular, saldo, numeroConta);
        this.limiteDeCredito = limiteDeCredito;
        this.taxaManutencao = taxaManutencao;
        this.quantidadeTransacoes = quantidadeTransacoes;
    }

    public double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        this.limiteDeCredito = limiteDeCredito;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public void setQuantidadeTransacoes(int quantidadeTransacoes) {
        this.quantidadeTransacoes = quantidadeTransacoes;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de Conta: Corrente" +
                "\nLimite de Crédito: " + limiteDeCredito;
    }
}
