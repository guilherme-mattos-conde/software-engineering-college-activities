import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();

        // Adiciona nome no array
        listaNomes.add("Guilherme");
        listaNomes.add("Jorge");
        listaNomes.add("João");

        System.out.println("Lista: " + listaNomes);

        // Adiciona nome na posição 2 do array e  empurra o que estava na 2 para a 3
        listaNomes.add(2 , "Lebron");
        System.out.println("Lista: " + listaNomes);

        // Altera o nome que esta na posição 2 por Curry
        listaNomes.set(2, "Curry");
        System.out.println("Lista: " + listaNomes);


        // Remove o João
        listaNomes.remove("João");
        System.out.println("Lista: " + listaNomes);

        // Remove o nome que esta na posição 2
        listaNomes.remove(2);
        System.out.println("Lista: " + listaNomes);

        // Verifica se contem o nome Roberto no array
        boolean contem = listaNomes.contains("Roberto");
        System.out.println("Roberto está na lista? " + contem);

        // Verifica o tamanho do array
        int tamanho = listaNomes.size();
        System.out.println("Tamanho da lista: " + tamanho);

        // Verifica se o array está vazio
        boolean estaVazia = listaNomes.isEmpty();
        System.out.println("Lista está vazia? " + estaVazia);

        // Limpa o array deixando-o sem elementos
        listaNomes.clear();
        System.out.println("Lista: " + listaNomes);
    }
}
