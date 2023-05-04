package org.acme.openapi.swaggerui;

public class VatService {

    private static double netAmount;
    private static double vat;
    private static double grossAmount;
    private static double rate;
    static String output;

    public static String calculateNetAmount(double grossAmount) {
        rate = 0.18;
        netAmount = grossAmount - (grossAmount * rate);
        vat = grossAmount - netAmount;
        output = String.format("NetAmount = %.2f, Vat = %.2f", netAmount, vat);

        return output;
    }

    public static String calculateGrossAmount(double vat) {
        rate = 0.18;
        grossAmount = vat / rate;
        netAmount = grossAmount - vat;
        output = String.format("GrossAmount = %.2f, NetAmount = %.2f", grossAmount, netAmount);

        return output;

    }

    public static String calculateRate(double grossAmount, double netAmount) {
        rate = (netAmount / grossAmount);
        vat = grossAmount - netAmount;
        output = String.format("Rate = %.2f, Vat = %.2f,", rate, vat);

        return output;
    }


}
