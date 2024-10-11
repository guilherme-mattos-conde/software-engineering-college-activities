class Moto extends Veiculo {
    protected String tipoFreio;

    public Moto(String placa, int anoFabricacao, String tipoFreio) {
        super(placa, anoFabricacao, "Moto");
        this.tipoFreio = tipoFreio;
    }

    public String getTipoFreio() {
        return tipoFreio;
    }

    public void setTipoFreio(String tipoFreio) {
        this.tipoFreio = tipoFreio;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de Freio: " + tipoFreio;
    }
}
