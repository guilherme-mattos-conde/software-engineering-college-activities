public class MinhaLista {
    private String[] elementos;
    private int tamanho;

    // construtor
    public MinhaLista(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // Adiciona um elemento ao final da lista.
    // Equivalente ao método add(E e)
    public void adiciona(String e) {
        if (tamanho >= elementos.length - 1) {
            aumentaCapacidade();
            adiciona(e);
        } else {
            elementos[tamanho] = e;
            tamanho++;
        }
    }

    // Insere um elemento em uma posição específica.
    // Equivalente ao método add(int index, E e)
    public void adiciona(int index, String e) {
        if(index > elementos.length - 1) {
            aumentaCapacidade();
            adiciona(index, e);
        } else if (index > 0){
            for(int x = index; x < tamanho; x++) {
                elementos[x + 1] = elementos[x];
            }
            elementos[index] = e;
            tamanho = index + 1;
        }
    }

    // Retorna o elemento na posição especificada.
    // Equivalente ao método get(int index)
    public String busca(int index) {
        return index < elementos.length ? elementos[index] : "Elemento não encontrado!";
    }

    // Retorna a posição de um elemento.
    // Equivalente ao método indexOf(Object o)
    public int busca(String e) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] != null && elementos[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    // Substitui um elemento na posição especificada.
    // Equivalente ao método set(int index, E e)
    public void substitui(int index, String e) {
        if(index < elementos.length) {
            elementos[index] = e;
        }
    }

    // Remove um elemento da lista.
    // Equivalente ao método remove(int index)
    public void remove(int index) {
        if (index >= 0 && index < tamanho) {
            for (int x = index; x < tamanho - 1; x++) {
                elementos[x] = elementos[x + 1];
            }
            elementos[tamanho - 1] = null;
            tamanho--;
        }
    }

    // Retorna a quantidade de elementos armazenados.
    // Equivalente ao método size()
    public int tamanho() { //
        return tamanho;
    }

    // Remove todos os elementos da lista.
    // Equivalente ao método clear()
    public void limpar() { //
        for(String e : elementos) {
            e = null;
        }
        tamanho = 0;
    }

    // Duplica o tamanho do array sempre que a capacidade for atingida.
    // Equivalente ao aumento automático de capacidade
    private void aumentaCapacidade() {
        String[] novaLista = new String[this.elementos.length * 2];

        for (int i = 0; i < this.elementos.length; i++) {
            novaLista[i] = this.elementos[i];
        }

        this.elementos = novaLista;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            if (i > 0) s.append(", ");
            s.append(elementos[i]);
        }
        s.append("]");
        return s.toString();
    }
}
