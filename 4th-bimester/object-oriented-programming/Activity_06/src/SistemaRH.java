public class SistemaRH {
    public static void main(String[] args) throws Exception {
        Funcionario gerente = new Gerente("Guilherme");
        Funcionario desenvolvedor = new Desenvolvedor("João");

        System.out.println(gerente.getNome());
        System.out.println(gerente.descreverResponsabilidade());
        System.out.println(gerente.calcularSalario());
        System.out.println();
        System.out.println(desenvolvedor.getNome());
        System.out.println(desenvolvedor.descreverResponsabilidade());
        System.out.println(desenvolvedor.calcularSalario());
    }
}
