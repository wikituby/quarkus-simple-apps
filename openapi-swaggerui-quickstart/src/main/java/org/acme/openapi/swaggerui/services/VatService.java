package org.acme.openapi.swaggerui.services;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.openapi.swaggerui.models.Vat;

@ApplicationScoped
public class VatService {
    Vat vatObj = new Vat();

    public String calculateNetAmount(double grossAmountFromClient) {
        vatObj.setGrossAmount(grossAmountFromClient);
        vatObj.setRate(0.18);
        double calNetAmount = vatObj.getGrossAmount() - (vatObj.getGrossAmount() * vatObj.getRate());
        vatObj.setNetAmount(calNetAmount);
        double calVat = vatObj.getGrossAmount() - vatObj.getNetAmount();
        vatObj.setVat(calVat);
        String output1 = String.format("NetAmount: %.2f, Vat: %.2f", vatObj.getNetAmount(), vatObj.getVat());
        vatObj.setOutPut(output1);
        return vatObj.getOutPut();
    }

    /*public String calculateNetAmount(double grossAmount) {
        double rate = 0.18;
        double netAmount = grossAmount - (grossAmount * rate);
        double vat = grossAmount - netAmount;
        String output = String.format("NetAmount = %.2f, Vat = %.2f", netAmount, vat);

        return output;
    }*/

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
