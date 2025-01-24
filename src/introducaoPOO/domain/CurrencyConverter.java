package introducaoPOO.domain;

public class CurrencyConverter {

    private static final double IOF = 6.0;

    public static double convertToReal(double dollarPrice, double bought) {
        double moneyConverted = dollarPrice * bought;
        return (moneyConverted * IOF / 100) + moneyConverted;
    }


}
