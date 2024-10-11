public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        System.out.print(p1);
        Pessoa p2 = new Pessoa("Jorge");
        System.out.print(p2);
        Pessoa p3 = new Pessoa("Felipe", 20);
        System.out.print(p3);
        Pessoa p4 = new Pessoa("Roberto", 30, 4999.99);
        System.out.print(p4);
    }
}
