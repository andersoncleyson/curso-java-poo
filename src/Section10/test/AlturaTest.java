package Section10.test;

import Section10.domain.Altura;

import java.util.Locale;
import java.util.Scanner;

public class AlturaTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();
        Altura[] pessoaDados = new Altura[n];

        String nome;
        int idade;
        double altura;

        for (int i = 0; i < pessoaDados.length; i++){
            System.out.println("Dados da " + (i + 1) + "° pessoa");
            System.out.printf("Nome: ");
            nome = sc.nextLine();
            System.out.printf("Idade: ");
            idade = sc.nextInt();
            sc.nextLine();
            System.out.printf("Altura: ");
            altura = sc.nextDouble();
            sc.nextLine();
            pessoaDados[i] = new Altura(nome, idade, altura);
        }

        double mediaAltura = 0;
        double somaAltura = 0;
        for (int i = 0; i < pessoaDados.length; i++) {
            somaAltura += pessoaDados[i].getAltura();
            mediaAltura = somaAltura / pessoaDados.length;

        }

        System.out.printf("\nAltura média: %.2f", mediaAltura);

        double countIdade = 0;

        for (int i = 0; i < pessoaDados.length; i ++) {
            if(pessoaDados[i].getIdade() < 16) {
                countIdade += 1;
            }
        }

        double agePercentage = (countIdade / pessoaDados.length) * 100;

        System.out.printf("\nPessoa com menos de 16 anos: %.1f", agePercentage, "%\n");

        for (int i = 0; i < pessoaDados.length; i ++) {
            if(pessoaDados[i].getIdade() < 16) {
                System.out.println(pessoaDados[i].getNome());
            }
        }

        sc.close();
    }
}
