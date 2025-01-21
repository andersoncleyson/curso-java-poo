package introducaoPOO.test;

import introducaoPOO.domain.AreaTriangulo;

import java.util.Scanner;

public class ProgramTest {
    public static void main(String[] args) {
        double aX, bX, cX, aY, bY, cY;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os valores de x");
        aX = sc.nextDouble();
        bX = sc.nextDouble();
        cX = sc.nextDouble();
        System.out.println("Digite os valores de y");
        aY = sc.nextDouble();
        bY = sc.nextDouble();
        cY = sc.nextDouble();

        AreaTriangulo calculoAreaX = new AreaTriangulo(aX, bX, cX);
        AreaTriangulo calculoAreaY = new AreaTriangulo(aY, bY, cY);

        double areaX = calculoAreaX.calculoArea();
        double areaY = calculoAreaY.calculoArea();

        System.out.println(areaX);
        System.out.println(areaY);

    }
}
