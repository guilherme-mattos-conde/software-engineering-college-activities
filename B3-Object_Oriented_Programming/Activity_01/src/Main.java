import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangulo maiorTriangulo = new Triangulo(0, 0, 0);
        Scanner s = new Scanner(System.in);
        double maiorArea = 0;
        int i = 1;

        while (i < 3) {
            System.out.println("Digite os três lados do triângulo " + i + ": ");
            double l1 = s.nextDouble();
            double l2 = s.nextDouble();
            double l3 = s.nextDouble();

            Triangulo triangulo = new Triangulo(l1, l2, l3);
            double area = triangulo.getArea();

            if(area > maiorArea) {
                maiorArea = area;
                maiorTriangulo = triangulo;
            }

            i++;
        }
        System.out.println("Maior Triângulo:");
        System.out.printf("Perímetro: %.2f", maiorTriangulo.getpT());
        System.out.printf("\nÁrea: %.2f", maiorTriangulo.getArea());
    }
}
