import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Arvore {
    private No raiz = null;

    public int getQuantidadeNos(No no) {
        if(no == null) return 0;
        return 1 + getQuantidadeNos(no.getNoEsquerda()) + getQuantidadeNos(no.getNoDireita());
    }

    public int getQuantidadeNosNaoRecursiva() {
        if(raiz == null) return 0;

        Queue<No> fila = new LinkedList<>();
        int i = 0;
        fila.add(raiz);

        while(!fila.isEmpty()) {
            No atual = fila.poll();
            i += 1;
            if(atual.getNoEsquerda() != null) fila.add(atual.getNoEsquerda());
            if(atual.getNoDireita() != null) fila.add(atual.getNoDireita());
        }

        return i;
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

        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);

        while(!pilha.isEmpty()) {
            No atual = pilha.pop();
            System.out.print(atual.getValor() + " ");
            if(atual.getNoDireita() != null) pilha.add(atual.getNoDireita());
            if(atual.getNoEsquerda() != null) pilha.add(atual.getNoEsquerda());
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
        No atual = raiz;

        while(atual != null || !pilha.isEmpty()) {
            while(atual != null) {
                pilha.push(atual);
                atual = atual.getNoEsquerda();
            }

            atual = pilha.pop();
            System.out.print(atual.getValor() + " ");
            atual = atual.getNoDireita();
        }
    }

    public void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.getNoEsquerda());
            posOrdem(no.getNoDireita());
            System.out.print(no.getValor() + " ");
        }
    }

    public void posOrdemNaoRecursiva() {
        if(raiz == null) return;

        Stack<No> pilha = new Stack<>();
        Stack<No> espera = new Stack<>();
        pilha.push(raiz);

        while(!pilha.isEmpty()) {
            No atual = pilha.pop();
            espera.push(atual);

            if(atual.getNoEsquerda() != null) pilha.push(atual.getNoEsquerda());
            if(atual.getNoDireita() != null) pilha.push(atual.getNoDireita());
        }

        while(!espera.isEmpty()) {
            No atual = espera.pop();
            System.out.print(atual.getValor() + " ");
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
