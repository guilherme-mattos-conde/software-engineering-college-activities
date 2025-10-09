class Veiculo {
    protected String placa;
    protected int anoFabricacao;
    private final String tipo;

    public Veiculo(String placa, int anoFabricacao, String tipo) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "-------------------------" +
                "\nTipo: " + tipo +
                "\nPlaca: " + placa +
                "\nAno de Fabricação: " + anoFabricacao;
    }
}
