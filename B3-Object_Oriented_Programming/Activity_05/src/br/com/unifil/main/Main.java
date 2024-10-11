package br.com.unifil.main;

import br.com.unifil.models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cachorro c = new Cachorro();
        Gato g = new Gato();

        System.out.print("Informe o nome do cachorro: ");
        c.setNome(s.next());
        System.out.print("Informe a idade do cachorro: ");
        c.setIdade(s.nextInt());
        c.latindo();
        System.out.println(c);

        System.out.print("Informe o nome do gato: ");
        g.setNome(s.next());
        System.out.print("Informe a idade do gato: ");
        g.setIdade(s.nextInt());
        g.miando();
        System.out.println(g);
    }
}
