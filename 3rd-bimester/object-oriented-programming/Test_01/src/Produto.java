public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private int quantidade;
    private int garantia;
    private int anoFabricacao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nCódigo: " + codigo +
                "\nPreco: R$" + String.format("%.2f", preco) +
                "\nQuantidade: " + quantidade +
                "\nGarantia (meses): " + garantia +
                "\nAno de Fabricação: " + anoFabricacao;
    }
}
