package SimpleQuarkusApps.VATCalculator.services;

import jakarta.enterprise.context.ApplicationScoped;
import SimpleQuarkusApps.VATCalculator.models.*;

@ApplicationScoped
public class VatService {

    public String calculateNetAmount(double clientGrossAmount) {
        Vat vatObj = new Vat();
        vatObj.setGrossAmount(clientGrossAmount);
        vatObj.setRate(0.18);
        double calNetAmount = vatObj.getGrossAmount() - (vatObj.getGrossAmount() * vatObj.getRate());
        vatObj.setNetAmount(calNetAmount);
        double calVat = vatObj.getGrossAmount() - vatObj.getNetAmount();
        vatObj.setVat(calVat);
        String calOutPut = String.format("NetAmount: %.2f, Vat: %.2f", vatObj.getNetAmount(), vatObj.getVat());
        vatObj.setOutPut(calOutPut);
        return vatObj.getOutPut();
    }

    public String calculateGrossAmount(double clientVat) {
        Vat vatObj = new Vat();
        vatObj.setVat(clientVat);
        vatObj.setRate(0.18);
        double calGrossAmount = vatObj.getVat() / vatObj.getRate();
        vatObj.setGrossAmount(calGrossAmount);
        double calNetAmount = vatObj.getGrossAmount() - vatObj.getVat();
        vatObj.setNetAmount(calNetAmount);
        String calOutput = String.format("GrossAmount = %.2f, NetAmount = %.2f", vatObj.getGrossAmount(), vatObj.getNetAmount());
        vatObj.setOutPut(calOutput);
        return vatObj.getOutPut();
    }

    public String calculateRate(double clientGrossAmount, double clientNetAmount) {
        Vat vatObj = new Vat();
        vatObj.setGrossAmount(clientGrossAmount);
        vatObj.setNetAmount(clientNetAmount);
        double calRate = (vatObj.getNetAmount() / vatObj.getGrossAmount());
        double calVat = vatObj.getGrossAmount() - vatObj.getNetAmount();
        vatObj.setRate(calRate);
        vatObj.setVat(calVat);
        String calOutput = String.format("Rate = %.2f, Vat = %.2f,", vatObj.getRate(), vatObj.getVat());
        vatObj.setOutPut(calOutput);
        return vatObj.getOutPut();
    }

    public String calculateVat(double clientGrossAmount, double clientNetAmount) {
        Vat vatObj = new Vat();
        vatObj.setGrossAmount(clientGrossAmount);
        vatObj.setNetAmount(clientNetAmount);
        double calRate = (vatObj.getNetAmount() / vatObj.getGrossAmount());
        double calVat = vatObj.getGrossAmount() - vatObj.getNetAmount();
        vatObj.setRate(calRate);
        vatObj.setVat(calVat);
        String calOutput = String.format("Vat = %.2f, Rate = %.2f,", vatObj.getVat(), vatObj.getRate());
        vatObj.setOutPut(calOutput);
        return vatObj.getOutPut();
    }
}
