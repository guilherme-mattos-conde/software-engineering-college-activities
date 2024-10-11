public class Desenvolvedor extends Funcionario {
    private final String liguagemFavorita;

    public Desenvolvedor(String nome, double salario, String liguagemFavorita) {
        super(nome, salario);
        this.liguagemFavorita = liguagemFavorita;
    }

    @Override
    public double calcularSalario() {
        return super.getSalario();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Desenvolvedor" +
                "\nLiguagem Favorita: " + liguagemFavorita;
    }
}
