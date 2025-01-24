package introducaoPOO.test;

import introducaoPOO.domain.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConvertedTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double dollarPrice;
        double dollarBought;

        System.out.printf("What is the dollar? ");
        dollarPrice = sc.nextDouble();
        System.out.printf("How many dollars will be bought? ");
        dollarBought = sc.nextDouble();
        double dollarInReais = CurrencyConverter.convertToReal(dollarPrice, dollarBought);
        System.out.println("Amount to be paid in reais = " + String.format("%.2f", dollarInReais));

        sc.close();
    }
}
