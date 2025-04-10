class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void empilhar(String titulo) {
        No novoLivro = new No(titulo);
        novoLivro.proximo = topo;
        topo = novoLivro;
        System.out.println("Livro \"" + titulo + "\" adicionado à pilha.");
    }

    public String desempilhar() {
        if (estaVazia()) return null;
        String tituloRemovido = topo.titulo;
        topo = topo.proximo;
        return tituloRemovido;
    }

    public String verTopo() {
        return estaVazia() ? null : topo.titulo;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        System.out.println("Livros na pilha:");
        No atual = topo;
        while (atual != null) {
            System.out.println("- " + atual.titulo);
            atual = atual.proximo;
        }
    }
}
