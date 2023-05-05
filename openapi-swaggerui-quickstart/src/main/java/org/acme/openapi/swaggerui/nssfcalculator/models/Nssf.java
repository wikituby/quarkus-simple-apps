package org.acme.openapi.swaggerui.nssfcalculator.models;

public class Nssf {
    private double netAmount;
    private double nssf;
    private double grossAmount;
    private double rate;
    private String outPut;

    public Nssf(){

    }

    public Nssf(double netAmount, double nssf, double grossAmount, double rate, String outPut) {
        this.netAmount = netAmount;
        this.nssf = nssf;
        this.grossAmount = grossAmount;
        this.rate = rate;
        this.outPut = outPut;
    }

    public double getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(double netAmount) {
        this.netAmount = netAmount;
    }

    public double getNssf() {
        return nssf;
    }

    public void setNssf(double nssf) {
        this.nssf = nssf;
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
    public void setRate(double rate){
        this.rate = rate;
    }
    public String getOutPut(){
        return outPut;
    }
    public void setOutPut(String outPut){
        this.outPut = outPut;
    }

}