public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa() {
    }
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("""
                Nome: %s
                Idade: %d
                Salário: R$%.2f
                ----------------------------------------
                """, this.nome, this.idade, this.salario);
    }
}
