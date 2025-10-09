import java.util.Date;

public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;
    private Date dataAniversario;
    private double depositoMinimo;

    public ContaPoupanca(String titular, double saldo, String numeroConta, double taxaJuros, Date dataAniversario, double depositoMinimo) {
        super(titular, saldo, numeroConta);
        this.taxaJuros = taxaJuros;
        this.dataAniversario = dataAniversario;
        this.depositoMinimo = depositoMinimo;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public double getDepositoMinimo() {
        return depositoMinimo;
    }

    public void setDepositoMinimo(double depositoMinimo) {
        this.depositoMinimo = depositoMinimo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de Conta: Poupança" +
                "\nTaxa Juros: " + taxaJuros;
    }
}
