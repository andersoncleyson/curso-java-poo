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

        List<Employees> list = new ArrayList<>();


        System.out.printf("How many employees will be registered? ");
        int N = sc.nextInt();
        sc.nextLine();

        for (int i=0; i<N; i++){
            System.out.println();
            System.out.printf("Emplyoee #" + (i + 1) + ":\n");
            System.out.printf("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.printf("Name: ");
            String name = sc.nextLine();
            System.out.printf("Salary: ");
            Double salary = sc.nextDouble();
            sc.nextLine();

            Employees emp = new Employees(id, name, salary);

            list.add(emp);

        }

        System.out.print("Enter the employee id what will have salary increase: ");
        int idsalary = sc.nextInt();
        Integer pos = position(list, idsalary);
        if (pos == null) {
            System.out.println("This id does not exist");
        } else {
            System.out.print("Enter percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");
        for(Employees employee: list) {
            System.out.println(employee);
        }

        sc.close();
    }

    public static Integer position(List<Employees> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
