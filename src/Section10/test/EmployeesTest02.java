package Section10.test;

import Section10.domain.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeesTest02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Employees> employees = new ArrayList<>();

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

            employees.add(new Employees(id, name, salary));
            System.out.println();
        }

        int idIdentify;
        System.out.printf("Enter employee id that will be have salary increase: ");
        idIdentify = sc.nextInt();

        for (int i = 0; i < employees.size(); i++){
            if(employees.get(i).getId() == idIdentify){
                double value;
                System.out.printf("Enter the percentage: ");
                value = sc.nextDouble();
                employees.get(i).increaseSalary(value);
                break;
            }
            else {
                System.out.println("This id does not exist!");
            }
        }

        System.out.println("List of employees:");
        for (Employees employee: employees) {
            System.out.println(employee);
        }

        sc.close();
    }
}
