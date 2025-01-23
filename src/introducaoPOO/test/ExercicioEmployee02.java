package introducaoPOO.test;

import introducaoPOO.domain.Employee;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioEmployee02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.printf("Name: ");
        employee.name = sc.nextLine();

        System.out.printf("Gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.printf("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.printf("Which percentage to increase salary? ");
        double percentageIncrease = sc.nextDouble();
        employee.increaseSalary(percentageIncrease);

        System.out.println(employee);
    }
}
