package transporte;

class Carro extends Veiculo {
    protected String tipoCombustivel;

    public Carro(String placa, int anoFabricacao, double valor, String tipoCombustivel) {
        super(placa, anoFabricacao, valor);
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public double calcularSeguro() {
        if (this.tipoCombustivel.equalsIgnoreCase("flex")) {
            return super.calcularSeguro() * 1.05;
        } else return super.calcularSeguro();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de Combustível: " + tipoCombustivel;
    }
}
