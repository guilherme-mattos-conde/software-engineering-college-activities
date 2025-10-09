public class Main {
    public static void main(String[] args) {
        int[] vetorNaoOrdenado = {42, 17, 8, 99, 23, 55, 4};
        int[] vetorOrdenado = {4, 8, 17, 23, 42, 55, 99};

        int valor = 23;

        System.out.println("Busca Linear (não ordenado): " + Buscas.buscaLinearNaoOrdenada(vetorNaoOrdenado, valor));
        System.out.println("Busca Linear (ordenado): " + Buscas.buscaLinearOrdenada(vetorOrdenado, valor));
        System.out.println("Busca Binária (ordenado): " + Buscas.buscaBinaria(vetorOrdenado, valor));
    }
}
