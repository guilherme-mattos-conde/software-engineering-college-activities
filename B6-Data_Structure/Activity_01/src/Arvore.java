import java.util.ArrayList;
import java.util.Queue;

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

    public void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.getValor() + " ");
            preOrdem(no.getNoEsquerda());
            preOrdem(no.getNoDireita());
        }
    }

    public void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.getNoEsquerda());
            System.out.print(no.getValor() + " ");
            emOrdem(no.getNoDireita());
        }
    }

    public void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.getNoEsquerda());
            posOrdem(no.getNoDireita());
            System.out.print(no.getValor() + " ");
        }
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
}
