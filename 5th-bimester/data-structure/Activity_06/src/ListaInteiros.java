public class ListaInteiros {
    final private int[] elementos;
    private int tamanho;

    // construtor
    public ListaInteiros(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    // adicionar na lista
    public boolean add(int num) {
        if(tamanho >= elementos.length) {
            return false;
        } else {
            elementos[tamanho] = num;
            tamanho++;
            return true;
        }
    }

    // encontrar na lista
    public boolean find(int num) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == num) return true;
        }
        return false;
    }

    // remover da lista
    public boolean remove(int num) {
        for(int i = 0; i < tamanho; i++) {
            if (elementos[i] == num) {
                elementos[i] = 0;
                for(int x = i; x < tamanho; x++) {
                    if(x == tamanho - 1) {
                        elementos[x] = 0;
                    } else {
                        elementos[x] = elementos[x + 1];
                    }
                }
                tamanho--;
                return true;
            }
        }
        return false;
    }

    // limpar a lista
    public void clear() { //
        for(int e : elementos) {
            e = 0;
        }
        tamanho = 0;
    }

    // verificar se está vazio
    public boolean isEmpty() { //
        return tamanho == 0;
    }

    // retornar tamanho
    public int getTamanho() { //
        return tamanho;
    }

    // mostrar a lista
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
