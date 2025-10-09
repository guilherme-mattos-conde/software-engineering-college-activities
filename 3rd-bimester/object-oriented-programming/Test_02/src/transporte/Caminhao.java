package transporte;

class Caminhao extends Veiculo {
    private final double capacidadeCarga;

    public Caminhao(String placa, int anoFabricacao, double valor, double capacidadeCarga) {
        super(placa, anoFabricacao, valor);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularSeguro() {
        return super.calcularSeguro() + (capacidadeCarga * 10);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCapacidade de Carga: " + capacidadeCarga + " toneladas";
    }
}
