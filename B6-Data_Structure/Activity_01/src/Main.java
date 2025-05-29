public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.setRaiz(new No("A"));
        arvore.getRaiz().setNoEsquerda(new No("B"));
        arvore.getRaiz().setNoDireita(new No("C"));
        arvore.getRaiz().getNoEsquerda().setNoEsquerda(new No("D"));
        arvore.getRaiz().getNoEsquerda().setNoDireita(new No("E"));
        arvore.getRaiz().getNoDireita().setNoDireita(new No("F"));

        System.out.println("Quantidade de nós (recursiva): " + arvore.getQuantidadeNos(arvore.getRaiz()));
        System.out.println("Quantidade de nós (não recursiva): " + arvore.getQuantidadeNosNaoRecursiva());

        System.out.println("Quantidade de folhas (recursiva): " + arvore.getQuantidadeFolhas(arvore.getRaiz()));

        System.out.print("Árvore pré-ordem (recursiva): ");
        arvore.preOrdem(arvore.getRaiz());

        System.out.print("\nÁrvore pré-ordem (não recursiva): ");
        arvore.preOrdemNaoRecursiva();

        System.out.print("\nÁrvore em-ordem (recursiva): ");
        arvore.emOrdem(arvore.getRaiz());

        System.out.print("\nÁrvore em-ordem (não recursiva): ");
        arvore.emOrdemNaoRecursiva();

        System.out.print("\nÁrvore pós-ordem (recursiva): ");
        arvore.posOrdem(arvore.getRaiz());

        System.out.print("\nÁrvore pós-ordem (não recursiva): ");
        arvore.posOrdemNaoRecursiva();

        System.out.print("\nÁrvore em-nível: ");
        arvore.emNivel();
    }
}
