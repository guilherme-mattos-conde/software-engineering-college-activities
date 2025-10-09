class Carro extends Veiculo {
    protected int numeroPortas;

    public Carro(String placa, int anoFabricacao, int numeroPortas) {
        super(placa, anoFabricacao, "Carro");
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNúmero de Portas: " + numeroPortas;
    }
}
