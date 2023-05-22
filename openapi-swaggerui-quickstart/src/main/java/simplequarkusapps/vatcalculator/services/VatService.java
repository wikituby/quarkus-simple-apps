package simplequarkusapps.vatcalculator.services;

import jakarta.enterprise.context.ApplicationScoped;
import simplequarkusapps.vatcalculator.models.*;

@ApplicationScoped
public class VatService {

    public String calculateNetAmount(double grossAmount) {
        Vat vatObj = new Vat();
        vatObj.setGrossAmount(grossAmount);
        vatObj.setRate(0.18);
        double calNetAmount = vatObj.getGrossAmount() - (vatObj.getGrossAmount() * vatObj.getRate());
        vatObj.setNetAmount(calNetAmount);
        double calVat = vatObj.getGrossAmount() - vatObj.getNetAmount();
        vatObj.setVat(calVat);
        return String.format("NetAmount: %.2f, Vat: %.2f", vatObj.getNetAmount(), vatObj.getVat());
    }

    public String calculateGrossAmount(double vat) {
        Vat vatObj = new Vat();
        vatObj.setVat(vat);
        vatObj.setRate(0.18);
        double calGrossAmount = vatObj.getVat() / vatObj.getRate();
        vatObj.setGrossAmount(calGrossAmount);
        double calNetAmount = vatObj.getGrossAmount() - vatObj.getVat();
        vatObj.setNetAmount(calNetAmount);
        return String.format("GrossAmount = %.2f, NetAmount = %.2f", vatObj.getGrossAmount(), vatObj.getNetAmount());

    }

    public String calculateRate(double grossAmount, double netAmount) {
        Vat vatObj = new Vat();
        vatObj.setGrossAmount(grossAmount);
        vatObj.setNetAmount(netAmount);
        double calRate = (vatObj.getNetAmount() / vatObj.getGrossAmount());
        double calVat = vatObj.getGrossAmount() - vatObj.getNetAmount();
        vatObj.setRate(calRate);
        vatObj.setVat(calVat);
        return String.format("Rate = %.2f, Vat = %.2f,", vatObj.getRate(), vatObj.getVat());

    }

    public String calculateVat(double grossAmount, double netAmount) {
        Vat vatObj = new Vat();
        vatObj.setGrossAmount(grossAmount);
        vatObj.setNetAmount(netAmount);
        double calRate = (vatObj.getNetAmount() / vatObj.getGrossAmount());
        double calVat = vatObj.getGrossAmount() - vatObj.getNetAmount();
        vatObj.setRate(calRate);
        vatObj.setVat(calVat);
        return String.format("Vat = %.2f, Rate = %.2f,", vatObj.getVat(), vatObj.getRate());

    }
}
