public class ContaBancaria {
    protected String titular;
    protected double saldo;
    protected final String numeroConta;

    public ContaBancaria(String titular, double saldo, String numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    @Override
    public String toString() {
        return "Titular: " + titular +
                "\nSaldo: " + saldo +
                "\nNúmero da Conta: " + numeroConta;
    }
}
