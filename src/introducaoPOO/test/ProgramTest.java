package introducaoPOO.test;

import introducaoPOO.domain.AreaTriangulo;

import java.util.Locale;
import java.util.Scanner;

public class ProgramTest {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        AreaTriangulo x, y;
        x = new AreaTriangulo();
        y = new AreaTriangulo();

        System.out.println("Digite os valores de x");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite os valores de y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calculaArea();
        double areaY = y.calculaArea();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        sc.close();

    }
}
