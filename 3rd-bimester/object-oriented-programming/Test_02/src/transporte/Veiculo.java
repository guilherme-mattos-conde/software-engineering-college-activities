package transporte;

class Veiculo {
    private String placa;
    private int anoFabricacao;
    private double valor;

    public Veiculo(String placa, int anoFabricacao, double valor) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularSeguro() {
        return getValor() * 0.02;
    }
    @Override
    public String toString() {
        return "-------------------------" +
                "\nPlaca: " + placa +
                "\nAno de Fabricação: " + anoFabricacao +
                "\nValor: R$" + String.format("%.2f", valor);
    }
}
