package org.acme.openapi.swaggerui.nssfcalculator.models;

public class Nssf {
    private double netPay;
    private double EmployeeNssfContribution;
    private double EmployerNssfContribution;
    private double grossAmount;
    private double employeeRate;
    private double employerRate;
    private String nssfInfo = "1: Nssf Employeer Contribution = 10% of GrossPay.\n2: Nssf Employee Contribution = 5% of GrossPay\n3: Total Nssf Contribution from Employee and Employer = 15%";

    private String outPut;

    public Nssf(){

    }

    public Nssf(double netAmount, double nssf, double grossAmount, double rate, String outPut) {
        this.netPay = netPay;
        this.EmployeeNssfContribution = EmployeeNssfContribution;
        this.EmployerNssfContribution = EmployerNssfContribution;
        this.grossAmount = grossAmount;
        this.employeeRate = employeeRate;
        this.employerRate = employerRate;
        this.nssfInfo = nssfInfo;
        this.outPut = outPut;
    }
    public String getNssfInfo() {
        return nssfInfo;
    }

    public void setNssfInfo(String nssfInfo) {
        this.nssfInfo = nssfInfo;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public double getEmployeeNssfContribution() {
        return EmployeeNssfContribution;
    }
    public void setEmployeeNssfContribution(double EmployeeNssfContribution) {
        this.EmployeeNssfContribution = EmployeeNssfContribution;
    }

    public double getEmployerNssfContribution() {
        return EmployerNssfContribution;
    }
    public void setEmployerNssfContribution(double EmployerNssfContribution) {
        this.EmployerNssfContribution = EmployerNssfContribution;
    }
    public double getEmployerRate(){
        return employerRate;
    }
    public void setEmployerRate(double employerRate){
        this.employerRate = employerRate;
    }


    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public double getEmployeeRate() {
        return employeeRate;
    }
    public void setEmployeeRate(double employeeRate){
        this.employeeRate = employeeRate;
    }
    public String getOutPut(){
        return outPut;
    }
    public void setOutPut(String outPut){
        this.outPut = outPut;
    }

}