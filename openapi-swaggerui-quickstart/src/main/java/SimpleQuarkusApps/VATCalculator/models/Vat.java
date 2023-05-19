package SimpleQuarkusApps.VATCalculator.models;

public class Vat {
    private double netAmount;
    private double vat;
    private double grossAmount;
    private double rate;
    private String outPut;

    public Vat(double netAmount, double vat, double grossAmount, double rate, String outPut) {
        this.netAmount = netAmount;
        this.vat = vat;
        this.grossAmount = grossAmount;
        this.rate = rate;
        this.outPut = outPut;
    }

    public Vat(){
    }

    // getters and setters for this file now
    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public double getVat() {
        return vat;
    }

    public void setVat(double vatSet) {
        this.vat = vatSet;
    }

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getOutPut() {
        return outPut;
    }

    public void setOutPut(String outPut) {
        this.outPut = outPut;
    }
}
