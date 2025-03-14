package Section12_Enum.tests;

import Section12_Enum.entities.Departament;
import Section12_Enum.entities.HourContract;
import Section12_Enum.entities.Worker;
import Section12_Enum.entities.enums.OrderStatus;
import Section12_Enum.entities.enums.WorkerLevel;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Worker worker;
        Departament departament;

        System.out.printf("Enter departament's name: ");
        String departamentName = sc.next();
        departament = new Departament(departamentName);
        System.out.println("Enter worker data:");
        System.out.printf("Name: ");
        String name = sc.next();
        System.out.printf("Level:");
        String level = sc.next();
        WorkerLevel workerLevel = WorkerLevel.valueOf(level);
        System.out.printf("Base salary: ");
        double baseSalary = sc.nextDouble();
        sc.nextLine();

        worker = new Worker(name, workerLevel, baseSalary, departament);
        System.out.printf("How many contracts to this worker? ");
        int contracts = sc.nextInt();
        sc.nextLine();

        HourContract hourContract;
        Calendar c = Calendar.getInstance();
        DateFormat f = DateFormat.getDateInstance();
        for(int i = 0; i < contracts; i++) {
            System.out.println("Enter contract #" + (i + 1) + "data:");
            System.out.printf("Date (DD/MM/YYYY): ");
            String dataRecebimento = sc.next();
            Date date = f.parse(dataRecebimento);

            System.out.printf("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Duration (hours): ");
            int hours = sc.nextInt();
            sc.nextLine();
            hourContract = new HourContract(date, valuePerHour, hours);
            worker.addContract(hourContract);
        }

    }
}
