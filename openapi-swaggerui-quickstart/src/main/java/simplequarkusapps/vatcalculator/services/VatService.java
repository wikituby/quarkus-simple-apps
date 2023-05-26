package simplequarkusapps.vatcalculator.services;

import jakarta.enterprise.context.ApplicationScoped;
import simplequarkusapps.vatcalculator.models.Vat;

@ApplicationScoped
public class VatService {

    public String calculateVat(double grossAmount) {
        Vat vatObj = new Vat();
        vatObj.setGrossAmount(grossAmount);
        vatObj.calculateVat();
        return String.format("Vat = %.2f", vatObj.getVat());
    }

    public String calculateRate(double grossAmount, double vat) {
        Vat vatObj = new Vat();
        vatObj.setGrossAmount(grossAmount);
        vatObj.setVat(vat);
        vatObj.calculateRate();
        return String.format("Rate = %.2f", vatObj.getRate());
    }

    public String calculateNetAmount(double grossAmount) {
        Vat vatObj = new Vat();
        vatObj.setGrossAmount(grossAmount);
        vatObj.calculateNetAmount();
        return String.format("NetAmount: %.2f, Vat: %.2f", vatObj.getNetAmount(), vatObj.getVat());
    }

    public String calculateGrossAmount(double vat) {
        Vat vatObj = new Vat();
        vatObj.setVat(vat);
        vatObj.calculateGrossAmount();
        return String.format("GrossAmount = %.2f, NetAmount = %.2f", vatObj.getGrossAmount(), vatObj.getNetAmount());
    }

}
