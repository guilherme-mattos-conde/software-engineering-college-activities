package br.com.unifil.models;

public class Quadrado {
    private final double area;

    public Quadrado(double l1) {
        this.area = Math.pow(l1, 2);
    }

    public double getArea() {
        return area;
    }
}
