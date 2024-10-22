public class Gerente extends Funcionario {
    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 2500 * 1.5;
    }

    @Override
    public String descreverResponsabilidade() {
        return "Papelada!";
    }
}
