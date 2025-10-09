public class Compra {
    private double valor;
    private String nomeCliente;
    private int quantidadeItens;

    public Compra(double valor, String nomeCliente, int quantidadeItens) {
        this.valor = valor;
        this.nomeCliente = nomeCliente;
        this.quantidadeItens = quantidadeItens;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }
}
