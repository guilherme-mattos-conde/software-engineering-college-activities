import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public void preOrdemNaoRecursiva() {
        if(raiz == null) return;

        Queue<No> filaEsquerda = new LinkedList<>();
        Stack<No> pilhaDireita = new Stack<>();
        filaEsquerda.add(raiz);

        while(!filaEsquerda.isEmpty() || !pilhaDireita.isEmpty()) {
            No atual;

            if (!filaEsquerda.isEmpty()) {
                atual = filaEsquerda.poll();
            } else {
                atual = pilhaDireita.pop();
            }

            System.out.print(atual.getValor() + " ");
            if(atual.getNoEsquerda() != null) filaEsquerda.add(atual.getNoEsquerda());
            if(atual.getNoDireita() != null) pilhaDireita.add(atual.getNoDireita());
        }
    }

    public void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.getNoEsquerda());
            System.out.print(no.getValor() + " ");
            emOrdem(no.getNoDireita());
        }
    }

    public void emOrdemNaoRecursiva() {
        if(raiz == null) return;

        Stack<No> pilha = new Stack<>();
        Stack<No> espera = new Stack<>();
        pilha.add(raiz);

        while(!pilha.isEmpty() || !espera.isEmpty()) {
            No atual;

            if (!pilha.isEmpty()) {
                atual = pilha.pop();
                if (atual.getNoEsquerda() != null) {
                    pilha.add(atual.getNoEsquerda());
                    espera.add(atual);
                } else if (atual.getNoDireita() != null) {
                    System.out.print(atual.getValor() + " ");
                    pilha.add(atual.getNoDireita());
                } else {
                    System.out.print(atual.getValor() + " ");
                }
            } else {
                atual = espera.pop();
                System.out.print(atual.getValor() + " ");
                if (atual.getNoDireita() != null) pilha.add(atual.getNoDireita());
            }
        }
    }

    public void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.getNoEsquerda());
            posOrdem(no.getNoDireita());
            System.out.print(no.getValor() + " ");
        }
    }

    public void emNivel() {
        if(raiz == null) return;

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while(!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.getValor() + " ");
            if(atual.getNoEsquerda() != null) fila.add(atual.getNoEsquerda());
            if(atual.getNoDireita() != null) fila.add(atual.getNoDireita());
        }
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }
}
