public class Buscas {
    public static int buscaLinearNaoOrdenada(int[] vetor, int valor) {
        // Percorre o vetor do início ao fim
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                // Retorna o índice caso encontre o valor
                return i;
            }
        }
        // Retorna -1 caso não encontre
        return -1;
    }

    public static int buscaLinearOrdenada(int[] vetor, int valor) {
        // Percorre o vetor do início ao fim
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i; // encontrou
            } else if (vetor[i] > valor) {
                // Como está ordenado, não faz sentido continuar
                return -1;
            }
        }
        return -1;
    }

    public static int buscaBinaria(int[] vetor, int valor) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == valor) {
                return meio; // valor encontrado
            } else if (vetor[meio] < valor) {
                inicio = meio + 1; // busca na metade direita
            } else {
                fim = meio - 1; // busca na metade esquerda
            }
        }
        return -1; // não encontrado
    }
}
