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
    }
}
