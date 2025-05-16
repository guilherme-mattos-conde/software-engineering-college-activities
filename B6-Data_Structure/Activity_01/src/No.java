public class No {
    private No noDireita = null;
    private No noEsquerda = null;
    private String valor;

    public No (No noDireita, No noEsquerda, String valor) {
        this.noDireita = noDireita;
        this.noEsquerda = noEsquerda;
        this.valor = valor;
    }
}
