public class No {
    private No noDireita = null;
    private No noEsquerda = null;
    private String valor;

    public No (String valor, No noEsquerda, No noDireita) {
        this.noDireita = noDireita;
        this.noEsquerda = noEsquerda;
        this.valor = valor;
    }

    public No (String valor) {
        this.valor = valor;
    }

    public No getNoDireita() {
        return noDireita;
    }

    public void setNoDireita(No noDireita) {
        this.noDireita = noDireita;
    }

    public No getNoEsquerda() {
        return noEsquerda;
    }

    public void setNoEsquerda(No noEsquerda) {
        this.noEsquerda = noEsquerda;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
