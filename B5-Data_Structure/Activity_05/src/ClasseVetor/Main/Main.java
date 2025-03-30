package ClasseVetor.Main;

import ClasseVetor.Vetor;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);
        vetor.add("elemento 1");
        vetor.add("elemento 2");
        vetor.add("elemento 3");
        System.out.println(vetor.length());
        System.out.println(vetor);
        System.out.println(vetor.get(2));
        System.out.println(vetor.find("elemento 1") ? "Elemento encontrado!" : "Elemento não encontrado!");
        System.out.println(vetor.addInIndex("elemento 5", 9) ? "Elemento adicionado!" : "Posição inválida!");
        System.out.println(vetor.length());
        System.out.println(vetor.remove("elemento 2") ? "Elemento removido!" : "Elemento não encontrado!");
        System.out.println(vetor);
    }
}
