public class Conta {
    private String agencia;
    private String numero;
    private float saldo;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        saldo += valor;
        System.out.println("Deposito efetuado com sucesso!");
    }

    public void transferir(float valor) {
        if (saldo < valor) {
            System.out.println("O saldo é insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Transferência efetuada com sucesso!");
        }
    }

    public void saque(float valor) {
        if (saldo < valor) {
            System.out.println("O saldo é insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
        }
    }
}
