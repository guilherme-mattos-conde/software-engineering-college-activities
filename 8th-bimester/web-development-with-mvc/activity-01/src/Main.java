public class Main {
    public static void main(String[] args) {
        ServicoCompra servicoCompra = new ServicoCompra();

        Compra compra1 = new Compra(1000, "Fulano", 5);
        Compra compra2 = new  Compra(1500,"Ciclano", 15);

        System.out.println("A compra do " + compra1.getNomeCliente() + " ficou com um total de: R$" + servicoCompra.calcularCompraParcelada(compra1));
        System.out.println("A compra do " + compra2.getNomeCliente() + " ficou com um total de: R$" + servicoCompra.calcularCompraParcelada(compra2));
    }
}
