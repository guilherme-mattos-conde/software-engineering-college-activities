public class Triangulo {
    private final double pT;
    private final double area;

    public Triangulo(double l1, double l2, double l3) {
        this.pT = l1 + l2 + l3;
        double sP = pT/2;
        this.area = Math.sqrt(sP * (sP - l1) * (sP - l2) * (sP - l3));
    }

    public double getpT() {
        return pT;
    }

    public double getArea() {
        return area;
    }
}
