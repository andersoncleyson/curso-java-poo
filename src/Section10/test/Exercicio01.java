package Section10.test;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        sc.nextLine();

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS");
        for (int i = 0; i < numeros.length; i ++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }

        sc.close();
    }
}
