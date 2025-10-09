public class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }

    public void empinar() {
        System.out.println("A moto está dando grau.");
    }
}
