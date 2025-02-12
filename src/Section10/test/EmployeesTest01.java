package Section10.test;

import Section10.domain.Employees;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class EmployeesTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        Employees []employees = new Employees[n];

        int id;
        String name;
        double salary;

        for (int i = 0; i < n; i++){
            System.out.println("Emplyoee #" + (i + 1));
            System.out.printf("Id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.printf("Name: ");
            name = sc.nextLine();
            System.out.printf("Salary: ");
            salary = sc.nextDouble();

            employees[i] = new Employees(id, name, salary);
            System.out.println();
        }

        int idIdentify;
        System.out.printf("Enter employee id that will be have salary increase: ");
        idIdentify = sc.nextInt();

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getId() == idIdentify) {
                double increase;
                System.out.printf("Enter the percentage: ");
                increase = sc.nextDouble();
                employees[i].increaseSalary(increase);
                break;
            } else {
                System.out.println("This id does not exist!");
            }
        }

        System.out.println("List of employees:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

        sc.close();
    }
}
