package org.acme.openapi.swaggerui.nssfcalculator.services;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.openapi.swaggerui.nssfcalculator.models.Nssf;

@ApplicationScoped
public class NssfService {

    public String calculateNetAmount(double clientGrossAmount) {
        Nssf nssfObj = new Nssf();
        nssfObj.setGrossAmount(clientGrossAmount);
        nssfObj.setRate(0.05);
        double calNssf = nssfObj.getGrossAmount()*nssfObj.getRate();
        nssfObj.setNssf(calNssf);
        double calNetAmount = nssfObj.getGrossAmount()-nssfObj.getNssf();
        nssfObj.setNetAmount(calNetAmount);
        String calOutput = String.format("NetAmount = %.2f, Nssf = %.2f,", nssfObj.getNetAmount(), nssfObj.getNssf());
        nssfObj.setOutPut(calOutput);
        return nssfObj.getOutPut();
    }

    public String calculateGrossAmount(double clientNssf) {
        Nssf nssfObj = new Nssf();
        nssfObj.setNssf(clientNssf);
        nssfObj.setRate(0.05);
        double calGrossAmount = nssfObj.getNssf() / nssfObj.getRate();
        nssfObj.setGrossAmount(calGrossAmount);
        double calNetAmount = nssfObj.getGrossAmount()-nssfObj.getNssf();
        nssfObj.setNetAmount(calNetAmount);
        String calOutput = String.format("GrossAmount = %.2f, NetAmount = %.2f,", nssfObj.getGrossAmount(), nssfObj.getNetAmount());
        nssfObj.setOutPut(calOutput);
        return nssfObj.getOutPut();
    }

    public String calculateRate(double clientGrossAmount, double clientNetAmount) {
        Nssf nssfObj = new Nssf();
        nssfObj.setGrossAmount(clientGrossAmount);
        nssfObj.setNetAmount(clientNetAmount);
        double calNssf = nssfObj.getGrossAmount()-nssfObj.getNetAmount();
        nssfObj.setNssf(calNssf);
        double calRate = nssfObj.getNssf()/nssfObj.getGrossAmount();
        nssfObj.setRate(calRate);
        String calOutput = String.format("Rate = %.2f, Nssf = %.2f,", nssfObj.getRate(), nssfObj.getNssf());
        nssfObj.setOutPut(calOutput);
        return nssfObj.getOutPut();

    }
    public String calculateNssf(double clientGrossAmount){
        Nssf nssfObj = new Nssf();
        nssfObj.setGrossAmount(clientGrossAmount);
        nssfObj.setRate(0.05);
        double calNssf = nssfObj.getGrossAmount()*nssfObj.getRate();
        nssfObj.setNssf(calNssf);
        double calNetAmount = nssfObj.getGrossAmount()-nssfObj.getNssf();
        nssfObj.setNetAmount(calNetAmount);
        String calOutput = String.format("Nssf = %.2f, NetAmount = %.2f,", nssfObj.getNssf(), nssfObj.getNetAmount());
        nssfObj.setOutPut(calOutput);
        return nssfObj.getOutPut();    }

}
