package Section10.test;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Digite um número: ");
            numeros[i] = sc.nextDouble();
        }

        double sum = 0;
        System.out.printf("VALORES: ");
        for (int i = 0; i < numeros.length; i ++) {
            System.out.printf("%.1f ", numeros[i]);
            sum += numeros[i];
        }

        System.out.printf("\nSOMA: %.2f\n", sum);
        double media = sum / numeros.length;
        System.out.printf("MEDIA: %.2f\n", media);

        sc.close();
    }
}
