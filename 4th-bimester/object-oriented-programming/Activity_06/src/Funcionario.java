abstract class Funcionario implements IFuncionario{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }
}
