package ArvoreAVL;

public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        int[] valores = {10, 20, 30, 40, 50};

        for (int valor : valores) {
            arvore.inserir(valor);
        }

        System.out.println("*** Quantidade de nós ***");
        System.out.println("Recursiva: " + arvore.getQuantidadeNos(arvore.getRaiz()));
        System.out.println("Pilha (não recursiva): " + arvore.getQuantidadeNosPilha());
        System.out.println("Fila (não recursiva): " + arvore.getQuantidadeNosFila());

        System.out.println("\n*** Quantidade de folhas ***");
        System.out.println("Recursiva: " + arvore.getQuantidadeFolhas(arvore.getRaiz()));
        System.out.println("Não recursiva: " + arvore.getQuantidadeFolhasNaoRecursiva());

        System.out.println("\n*** Árvore pré-ordem ***");
        System.out.print("Recursiva: ");
        arvore.preOrdem(arvore.getRaiz());
        System.out.print("\nNão recursiva: ");
        arvore.preOrdemNaoRecursiva();

        System.out.println();
        System.out.println("\n*** Árvore em-ordem ***");
        System.out.print("Recursiva: ");
        arvore.emOrdem(arvore.getRaiz());
        System.out.print("\nNão recursiva: ");
        arvore.emOrdemNaoRecursiva();

        System.out.println();
        System.out.println("\n*** Árvore pós-ordem ***");
        System.out.print("Recursiva: ");
        arvore.posOrdem(arvore.getRaiz());
        System.out.print("\nNão recursiva: ");
        arvore.posOrdemNaoRecursiva();

        System.out.println();
        System.out.println("\n*** Árvore em-nível ***");
        System.out.print("Não recursiva: ");
        arvore.emNivel();
    }
}
