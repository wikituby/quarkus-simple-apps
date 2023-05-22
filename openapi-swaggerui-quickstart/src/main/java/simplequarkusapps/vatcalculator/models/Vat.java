package simplequarkusapps.vatcalculator.models;

public class Vat {
    private double netAmount;
    private double vat;
    private double grossAmount;
    private double rate;

    public Vat(){}

    public Vat(double netAmount, double vat, double grossAmount, double rate) {
        this.netAmount = netAmount;
        this.vat = vat;
        this.grossAmount = grossAmount;
        this.rate = rate;
    }

    // getters and setters
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

    public double getRate() {return rate;}

    public void setRate(double rate) {this.rate = rate;}
}
