package simplequarkusapps.vatcalculator.models;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Vat {

    // Vat fields
    private double netAmount;
    private double vat;
    private double grossAmount;
    private double rate;

    // constructors
    public Vat() {
    }

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

    public void setVat(double vat) {
        this.vat = vat;
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

    // calculations
    public void calculateVat() {
        this.rate = 0.18;
        this.vat = this.grossAmount * this.rate;
    }

    public void calculateRate() {
        this.rate = this.vat / this.grossAmount;
    }

    public void calculateNetAmount() {
        this.rate = 0.18;
        this.vat = this.grossAmount * this.rate;
        this.netAmount = this.grossAmount - this.vat;
    }

    public void calculateGrossAmount() {
        this.rate = 0.18;
        this.grossAmount = this.vat / this.rate;
        this.netAmount = this.grossAmount - this.vat;
    }
}