package simplequarkusapps.loancalculator.models;


public class Loan {
    private double principal;
    private double interestPerDay;
    private double interestPerWeek;
    private double interestPerMonth;
    private double interestPerYear;
    private double ratePerMonth;

    public Loan(){}

    //Loan constructor
    public Loan(double principal, double interestPerDay, double interestPerWeek, double interestPerMonth, double interestPerYear, double ratePerMonth) {
        this.principal = principal;
        this.interestPerDay = interestPerDay;
        this.interestPerWeek = interestPerWeek;
        this.interestPerMonth = interestPerMonth;
        this.interestPerYear = interestPerYear;
        this.ratePerMonth = ratePerMonth;
    }

    //get and set amountToBorrowed
    public double getPrincipal() {
        return principal;
    }
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    //get and set amountToBePaidPerDay
    public double getInterestPerDay() {
        return interestPerDay;
    }
    public void setInterestPerDay(double interestPerDay) {
        this.interestPerDay = interestPerDay;
    }

    //get and set amountToBePaidPerWeek
    public double getInterestPerWeek() {
        return interestPerWeek;
    }
    public void setInterestPerWeek(double interestPerWeek) {
        this.interestPerWeek = interestPerWeek;
    }

    //get and set amountToBePaidPerMonth
    public double getInterestPerMonth(){
        return interestPerMonth;
    }
    public void setInterestPerMonth(double interestPerMonth){
        this.interestPerMonth = interestPerMonth;
    }

    //get and set amountToBePaidPerYear
    public double getInterestPerYear(){
        return interestPerYear;
    }
    public void setInterestPerYear(double interestPerYear){
        this.interestPerYear = interestPerYear;
    }

    //get and set ratePerMonth
    public double getRatePerMonth(){
        return ratePerMonth;
    }
    public void setRatePerMonth(double ratePerMonth){
        this.ratePerMonth = ratePerMonth;
    }
    
}

