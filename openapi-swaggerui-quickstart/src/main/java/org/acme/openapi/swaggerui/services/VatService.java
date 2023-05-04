package org.acme.openapi.swaggerui.services;
import jakarta.inject.Singleton;

import org.acme.openapi.swaggerui.models.Vat;

@Singleton
public class VatService {

    public String calculateNetAmount(double grossAmount) {
        double rate = 0.18;
        double netAmount = grossAmount - (grossAmount * rate);
        double vat = grossAmount - netAmount;
        String output = String.format("NetAmount = %.2f, Vat = %.2f", netAmount, vat);

        return output;
    }

    public String calculateGrossAmount(double vat) {
        double rate = 0.18;
        double grossAmount = vat / rate;
        double netAmount = grossAmount - vat;
        String output = String.format("GrossAmount = %.2f, NetAmount = %.2f", grossAmount, netAmount);

        return output;

    }

    public String calculateRate(double grossAmount, double netAmount) {
        double rate = (netAmount / grossAmount);
        double vat = grossAmount - netAmount;
        String output = String.format("Rate = %.2f, Vat = %.2f,", rate, vat);

        return output;
    }


    public String calculateVat(double grossAmount, double netAmount) {
        double vat = grossAmount - netAmount;
        double rate = (netAmount / grossAmount);

        String output = String.format("Vat = %.2f,Rate = %.2f,", vat, rate);

        return output;
    }
}
