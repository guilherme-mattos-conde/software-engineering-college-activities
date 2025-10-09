package br.com.unifil.models;

public class Losangulo {
    private final double area;

    public Losangulo(double d1, double d2) {
        this.area = (d1 * d2)/2;
    }

    public double getArea() {
        return area;
    }
}
