public class Carro {
    private int codigo;
    private String modelo;
    private int ano;
    private double precoDiaria;
    private boolean disponivel;

    public Carro(int codigo, String modelo, int ano, double precoDiaria, boolean disponivel) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.ano = ano;
        this.setPrecoDiaria(precoDiaria);
        this.disponivel = disponivel;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if (precoDiaria < 0) {
            this.precoDiaria = 0.0;
        } else {
            this.precoDiaria = precoDiaria;
        }
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        if (!disponivel) {
            this.disponivel = false;
        } else {
            System.out.println("Não é possível realizar essa alteração!");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Preço da Diária: " + precoDiaria);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("--------------------------------------");
    }
}
