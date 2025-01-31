package Section10.test;

import java.util.Locale;
import java.util.Scanner;

public class NumerosParesTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantidade de números? ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        int count = 0;

        System.out.println("Números pares:");

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0) {
                System.out.printf("%d\t", numeros[i]);
                count += 1;
            }
        }

        System.out.println();
        System.out.printf("Quantidade de pares: %d\n", count);

        sc.close();

    }
}
