package ClasseVetor;

public class Vetor {
    private final String[] elementos;
    private int tamanho;

    // 1. Definição
    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // 2. Adicionar elemento ao final do vetor
    public boolean add(String elemento) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == null) {
                elementos[i] = elemento;
                if (i >= tamanho) {
                    tamanho = i + 1;
                }
                return true;
            }
        }
        return false;
    }

    // 3. Verificar quantidade de elementos no vetor
    public int length() {
        int count = 0;
        for (String elemento : elementos) {
            if (elemento != null) {
                count++;
            }
        }
        return count;
    }

    // 4. Imprimir elementos do vetor
    public String toString() {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < tamanho; i++) {
            if(elementos[i] != null) {
                if (i > 0) s.append(", ");
                s.append(elementos[i]);
            }
        }
        s.append("]");
        return s.toString();
    }

    // 5. Obter elemento de uma posição
    public String get(int posicao) {
        return posicao >= 0 && posicao < elementos.length ? elementos[posicao] : "Posição inválida!";
    }

    // 6. Verificar se elemento existe no vetor
    public boolean find(String elemento) {
        for (String e : elementos) {
            if (e != null && e.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    // 7. Adicionar elemento em qualquer posição
    public boolean addInIndex(String elemento, int posicao) {
        if (posicao >= 0 && posicao < elementos.length) {
            elementos[posicao] = elemento;
            if (posicao >= tamanho) {
                tamanho = posicao + 1;
            }
            return true;
        }
        return false;
    }

    // 8. Remover elementos do vetor
    public boolean remove(String elemento) {
        if(!this.find(elemento)) {
            return false;
        } else {
            for (int i = 0; i < elementos.length; i++) {
                if (elementos[i] != null && elementos[i].equals(elemento)) {
                    elementos[i] = null;
                    if (i == tamanho - 1) {
                        tamanho--;
                    }
                }
            }
            return true;
        }
    }
}
