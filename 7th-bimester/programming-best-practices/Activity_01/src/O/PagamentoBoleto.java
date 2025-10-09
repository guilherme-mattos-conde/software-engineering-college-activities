package O;

public class PagamentoBoleto extends Pagamento {
    @Override
    public void pagar() {
        System.out.println("Pagamento efetuado no boleto!");
    }
}
