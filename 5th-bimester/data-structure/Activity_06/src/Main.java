public class Main {
    public static void main(String[] args) {
        ListaInteiros inteiros = new ListaInteiros(5);
        System.out.println(inteiros.add(10) ? "Número adicionado!" : "Lista sem espaço!");
        System.out.println(inteiros.add(5) ? "Número adicionado!" : "Lista sem espaço!");
        System.out.println(inteiros.add(2) ? "Número adicionado!" : "Lista sem espaço!");
        System.out.println(inteiros.add(8) ? "Número adicionado!" : "Lista sem espaço!");
        System.out.println(inteiros.add(7) ? "Número adicionado!" : "Lista sem espaço!");
        System.out.println(inteiros.add(4) ? "Número adicionado!" : "Lista sem espaço!");
        System.out.println(inteiros);
        System.out.println(inteiros.remove(2) ? "Número removido!" : "Número não encontrado!");
        System.out.println(inteiros);
        System.out.println(inteiros.find(9) ? "Número encontrado!" : "Número não encontrado!");
        System.out.println(inteiros.find(10) ? "Número encontrado!" : "Número não encontrado!");
        System.out.println(inteiros.isEmpty() ? "Lista vazia!" : "Lista com elementos!");
        System.out.println("Tamanho da lista: " + inteiros.getTamanho());
        inteiros.clear();
        System.out.println(inteiros);
    }
}
