public class Arvore {
    private No raiz = null;
    private int tamanho;

    public Arvore() {
        this.tamanho = 0;
    }

    public int getQuantidadeNos(No no) {
        if (no != null) {
            this.tamanho += 1;
            getQuantidadeNos(no.getNoEsquerda());
            getQuantidadeNos(no.getNoDireita());
        }

        return tamanho;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
}
