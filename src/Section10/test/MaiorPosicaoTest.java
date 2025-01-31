package Section10.test;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicaoTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantidade de números? ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        double max = numeros[0];
        int posicao = 0;

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] > max){
                max = numeros[i];
                posicao = i;
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Posição [%d] = %.1f\n", i, numeros[i]);
        }
        System.out.println();
        System.out.printf("MAIOR VALOR: %.1f\n", max);
        System.out.println("POSIÇÃO DO MAIOR VALOR: " + posicao);
        sc.close();
    }
}
