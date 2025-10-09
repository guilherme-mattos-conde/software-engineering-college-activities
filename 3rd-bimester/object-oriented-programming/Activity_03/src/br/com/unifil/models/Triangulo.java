package br.com.unifil.models;

public class Triangulo {
    private final double area;

    public Triangulo(double l1, double l2, double l3) {
        double sP = (l1 + l2 + l3)/2;
        this.area = Math.sqrt(sP * (sP - l1) * (sP - l2) * (sP - l3));
    }

    public double getArea() {
        return area;
    }
}
