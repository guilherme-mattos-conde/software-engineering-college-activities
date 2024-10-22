public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 2500 * 1.2;
    }

    @Override
    public String descreverResponsabilidade() {
        return "Codar insanamente!";
    }
}
