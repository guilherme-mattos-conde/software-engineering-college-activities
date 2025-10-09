public class Gerente extends Funcionario {
    private final double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.getSalario() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Gerente" +
                "\nBônus: R$" + String.format("%.2f", bonus);
    }
}
