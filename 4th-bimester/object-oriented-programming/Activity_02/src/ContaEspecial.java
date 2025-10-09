public class ContaEspecial extends Conta {
    private float limite;

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void saque(float valor) {
        if (super.getSaldo() + limite < valor) {
            System.out.println("O saldo é insuficiente!");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque efetuado com sucesso!");
        }
    }
}
