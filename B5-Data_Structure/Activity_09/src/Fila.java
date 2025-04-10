class Fila {
    private No inicio;
    private No fim;

    public Fila() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void enfileirar(String nome) {
        No novoNo = new No(nome);
        if (estaVazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
        System.out.println(nome + " foi adicionado à fila.");
    }

    public String desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        String nomeRemovido = inicio.dado;
        inicio = inicio.proximo;
        if (inicio == null) {
            fim = null;
        }
        return nomeRemovido;
    }

    public String primeiro() {
        return estaVazia() ? null : inicio.dado;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
            return;
        }

        System.out.println("Fila de atendimento:");
        No atual = inicio;
        while (atual != null) {
            System.out.println("- " + atual.dado);
            atual = atual.proximo;
        }
    }
}