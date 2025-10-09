package br.com.unifil.main;

import br.com.unifil.models.*;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 4) {
            mostrarMenu();
            opcao = s.nextInt();
            processarOpcao(opcao);
        }
    }

    private static void mostrarMenu() {
        System.out.println("[1] Triângulo x Quadrado");
        System.out.println("[2] Triângulo x Losângulo");
        System.out.println("[3] Quadrado x Losângulo");
        System.out.println("[4] Sair");
        System.out.print("Opção: ");
    }

    private static void processarOpcao(int opcao) {
        switch (opcao) {
            case 1: trianguloQuadrado(); break;
            case 2: trianguloLosangulo(); break;
            case 3: quadradoLosangulo(); break;
            case 4: System.out.println("Saindo..."); break;
            case 5: System.out.println("Valor inválido!");
        }
    }

    private static void trianguloQuadrado() {
        Double areaTriangulo = triangulo();
        Double areaQuadrado = quadrado();

        System.out.printf("Área do Triângulo: %.2f\n", areaTriangulo);
        System.out.printf("Área do Quadrado: %.2f\n", areaQuadrado);

        compararAreas(areaTriangulo, areaQuadrado);
    }

    private static void trianguloLosangulo() {
        Double areaTriangulo = triangulo();
        Double areaLosangulo = losangulo();

        System.out.printf("Área do Triângulo: %.2f\n", areaTriangulo);
        System.out.printf("Área do Losangulo: %.2f\n", areaLosangulo);

        compararAreas(areaTriangulo, areaLosangulo);
    }

    private static void quadradoLosangulo() {
        Double areaQuadrado = quadrado();
        Double areaLosangulo = losangulo();

        System.out.printf("Área do Quadrado: %.2f\n", areaQuadrado);
        System.out.printf("Área do Losangulo: %.2f\n", areaLosangulo);

        compararAreas(areaQuadrado, areaLosangulo);
    }

    private static void compararAreas(double area1, double area2) {
        if (area1 > area2) {
            System.out.println("A maior área é " + area1 + "!");
        } else if (area1 < area2) {
            System.out.println("A maior área é " + area2 + "!");
        } else System.out.println("As áreas são iguais!");
    }

    private static Double triangulo() {
        System.out.println("Digite os três lados do triângulo: ");
        double l1 = s.nextDouble();
        double l2 = s.nextDouble();
        double l3 = s.nextDouble();

        Triangulo triangulo = new Triangulo(l1, l2, l3);

        return triangulo.getArea();
    }

    private static Double quadrado () {
        System.out.println("Digite o lado do quadrado: ");
        double l1 = s.nextDouble();

        Quadrado quadrado = new Quadrado(l1);

        return quadrado.getArea();
    }

    private static Double losangulo () {
        System.out.println("Digite os duas diagonais do losângulo: ");
        double d1 = s.nextDouble();
        double d2 = s.nextDouble();

        Losangulo losangulo = new Losangulo(d1, d2);

        return losangulo.getArea();
    }
}
