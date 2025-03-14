package Section12_Enum.tests;

import Section12_Enum.entities.Departament;
import Section12_Enum.entities.HourContract;
import Section12_Enum.entities.Worker;
import Section12_Enum.entities.enums.OrderStatus;
import Section12_Enum.entities.enums.WorkerLevel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/yyyy");

        System.out.printf("Enter departament's name: ");
        String departamentName = sc.next();

        System.out.println("Enter worker data:");
        System.out.printf("Name: ");
        String name = sc.next();

        System.out.printf("Level: ");
        String level = sc.next();
        WorkerLevel workerLevel = WorkerLevel.valueOf(level);

        System.out.printf("Base salary: ");
        double baseSalary = sc.nextDouble();
        sc.nextLine();

        Worker worker = new Worker(name, workerLevel, baseSalary, new Departament(departamentName));

        System.out.printf("How many contracts to this worker? ");
        int contracts = sc.nextInt();

        for(int i = 1; i <= contracts; i++) {
            System.out.println("Enter contract #" +  i + "data:");

            System.out.printf("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());

            System.out.printf("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            System.out.printf("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();

        System.out.printf("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));


        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        sc.close();

    }
}
