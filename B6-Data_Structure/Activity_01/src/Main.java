public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.setRaiz(new No("A"));
        arvore.getRaiz().setNoEsquerda(new No("B"));
        arvore.getRaiz().setNoDireita(new No("C"));
        arvore.getRaiz().getNoEsquerda().setNoEsquerda(new No("D"));
        arvore.getRaiz().getNoEsquerda().setNoDireita(new No("E"));
        arvore.getRaiz().getNoDireita().setNoDireita(new No("F"));

        System.out.println("Quantidade de nós da árvore: " + arvore.getQuantidadeNos(arvore.getRaiz()));

        System.out.print("Árvore pré-ordem: ");
        arvore.preOrdem(arvore.getRaiz());

        System.out.print("\nÁrvore em-ordem: ");
        arvore.emOrdem(arvore.getRaiz());

        System.out.print("\nÁrvore pós-ordem: ");
        arvore.posOrdem(arvore.getRaiz());

        System.out.print("\nÁrvore em-nível: ");
        arvore.emNivel();

        System.out.print("\nÁrvore pré-ordem não recursiva: ");
        arvore.preOrdemNaoRecursiva();
    }
}
