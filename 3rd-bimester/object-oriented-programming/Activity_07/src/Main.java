public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro(1, "Meriva", 2010, 75.0, true);
        Carro carro2 = new Carro(2, "Creta", 2023, 200.0, true);

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();

        carro1.setPrecoDiaria(100.0);
        carro1.setDisponivel(false);

        carro1.exibirInformacoes();
    }
}
