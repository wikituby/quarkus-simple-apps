package simplequarkusapps.nssfcalculator.models;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Nssf {

    //fields
    private double netPay;
    private double employeeNssfContribution;
    private double employerNssfContribution;
    private double nssfTotalContribution;
    private double grossPay;
    public final double EMPLOYEE_RATE = 0.05;
    public final double EMPLOYER_RATE = 0.1;
    public String nssInfo;

    //constructors
    public Nssf() {
    }

    public Nssf(double netPay, double employeeNssfContribution, double grossPay, double employerNssfContribution, double nssfTotalContribution, String nssInfo) {
        this.netPay = netPay;
        this.employeeNssfContribution = employeeNssfContribution;
        this.employerNssfContribution = employerNssfContribution;
        this.grossPay = grossPay;
        this.nssfTotalContribution = nssfTotalContribution;
        this.nssInfo = nssInfo;
    }

    //getters anf setters
    public String getNssInfo() {
        return "1: Nssf Employer Contribution = 10% of GrossPay.\n2: Nssf Employee Contribution = 5% of GrossPay\n3: Total Nssf Contribution from Employee and Employer = 15% of GrossPay";
    }

    public void setNssInfo(String nssInfo) {
        this.nssInfo = nssInfo;
    }

    public double getNetPay() {
        return netPay;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    public double getEmployeeNssfContribution() {
        return employeeNssfContribution;
    }

    public void setEmployeeNssfContribution(double employeeNssfContribution) {
        this.employeeNssfContribution = employeeNssfContribution;
    }

    public double getEmployerNssfContribution() {
        return employerNssfContribution;
    }

    public void setEmployerNssfContribution(double employerNssfContribution) {
        this.employerNssfContribution = employerNssfContribution;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getNssfTotalContribution() {
        return nssfTotalContribution;
    }

    public void setNssfTotalContribution(double nssfTotalContribution) {
        this.nssfTotalContribution = nssfTotalContribution;
    }

    //calculations
    public void calculateNetPay() {
        this.employeeNssfContribution = EMPLOYEE_RATE * this.grossPay;
        this.netPay = this.grossPay - this.employeeNssfContribution;
    }

    public void calculateNssfContribution() {
        this.employeeNssfContribution = EMPLOYEE_RATE * this.grossPay;
        this.employerNssfContribution = EMPLOYER_RATE * this.grossPay;
        this.nssfTotalContribution = this.employeeNssfContribution + employerNssfContribution;
    }

    public void calculateGrossPay(){
        this.grossPay=this.employerNssfContribution/this.EMPLOYER_RATE;
    }


}