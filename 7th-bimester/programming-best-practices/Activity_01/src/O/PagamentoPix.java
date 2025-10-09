package O;

public class PagamentoPix extends Pagamento {
    @Override
    public void pagar() {
        System.out.println("Pagamento efetuado no pix!");
    }
}
