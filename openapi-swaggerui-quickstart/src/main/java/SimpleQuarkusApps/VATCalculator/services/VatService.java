package SimpleQuarkusApps.VATCalculator.services;

import jakarta.enterprise.context.ApplicationScoped;
import SimpleQuarkusApps.VATCalculator.models.*;

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
        String outPut = String.format("NetAmount: %.2f, Vat: %.2f", vatObj.getNetAmount(), vatObj.getVat());
        return outPut;
    }

    public String calculateGrossAmount(double vat) {
        Vat vatObj = new Vat();
        vatObj.setVat(vat);
        vatObj.setRate(0.18);
        double calGrossAmount = vatObj.getVat() / vatObj.getRate();
        vatObj.setGrossAmount(calGrossAmount);
        double calNetAmount = vatObj.getGrossAmount() - vatObj.getVat();
        vatObj.setNetAmount(calNetAmount);
        String outPut = String.format("GrossAmount = %.2f, NetAmount = %.2f", vatObj.getGrossAmount(), vatObj.getNetAmount());
        return outPut;

    }

    public String calculateRate(double grossAmount, double netAmount) {
        Vat vatObj = new Vat();
        vatObj.setGrossAmount(grossAmount);
        vatObj.setNetAmount(netAmount);
        double calRate = (vatObj.getNetAmount() / vatObj.getGrossAmount());
        double calVat = vatObj.getGrossAmount() - vatObj.getNetAmount();
        vatObj.setRate(calRate);
        vatObj.setVat(calVat);
        String outPut = String.format("Rate = %.2f, Vat = %.2f,", vatObj.getRate(), vatObj.getVat());
        return outPut;

    }

    public String calculateVat(double grossAmount, double netAmount) {
        Vat vatObj = new Vat();
        vatObj.setGrossAmount(grossAmount);
        vatObj.setNetAmount(netAmount);
        double calRate = (vatObj.getNetAmount() / vatObj.getGrossAmount());
        double calVat = vatObj.getGrossAmount() - vatObj.getNetAmount();
        vatObj.setRate(calRate);
        vatObj.setVat(calVat);
        String outPut = String.format("Vat = %.2f, Rate = %.2f,", vatObj.getVat(), vatObj.getRate());
        return outPut;

    }
}
