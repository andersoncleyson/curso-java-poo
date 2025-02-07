package Section10.test;

import Section10.domain.Rent;

import java.util.Locale;
import java.util.Scanner;

public class RentTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.printf("How many rooms will be rented? ");
        int quantRooms = sc.nextInt();
        Rent []rent = new Rent[10];
        sc.nextLine();

        String name;
        String email;
        int room;

        for (int i = 0; i < quantRooms; i++){
            System.out.printf("Rent #%d\n", i + 1);
            System.out.printf("Name: ");
            name = sc.nextLine();
            System.out.printf("Email: ");
            email = sc.nextLine();
            System.out.printf("Room: ");
            room = sc.nextInt();
            sc.nextLine();

            rent[room] = new Rent(name, email);
            System.out.printf("\n");

        }

        System.out.println("Busy rooms: ");
        for (int i = 0; i < rent.length; i++){
            if (rent[i] == null) {
                System.out.println("--------------------------------");
                System.out.println("Quarto " + i + ": Disponível");

            } else {
                System.out.println("--------------------------------");
                System.out.println("Quarto " + i + ": " +rent[i]);
            }
        }

        sc.close();

    }
}
