public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.acelerar();
        carro.frear();

        moto.acelerar();
        moto.frear();
        moto.empinar();
    }
}
