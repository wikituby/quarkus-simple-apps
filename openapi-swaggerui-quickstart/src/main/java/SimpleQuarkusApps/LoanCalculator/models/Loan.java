package SimpleQuarkusApps.LoanCalculator.models;


public class Loan {
    private double amountToBeBorrowed;
    private double interestToBePaidPerDay;
    private double interestToBePaidPerWeek;
    private double interestToBePaidPerMonth;
    private double interestToBePaidPerYear;
    private double ratePerMonth;
    private String outPut;

    public Loan(){}

    //Loan constructor
    public Loan(double amountToBeBorrowed, double interestToBePaidPerDay, double interestToBePaidPerWeek, double interestToBePaidPerMonth, double interestToBePaidPerYear, double ratePerMonth, String outPut) {
        this.amountToBeBorrowed = amountToBeBorrowed;
        this.interestToBePaidPerDay = interestToBePaidPerDay;
        this.interestToBePaidPerWeek = interestToBePaidPerWeek;
        this.interestToBePaidPerMonth = interestToBePaidPerMonth;
        this.interestToBePaidPerYear = interestToBePaidPerYear;
        this.ratePerMonth = ratePerMonth;
        this.outPut = outPut;
    }

    //get and set amountToBorrowed
    public double getAmountToBeBorrowed() {
        return amountToBeBorrowed;
    }
    public void setAmountToBeBorrowed(double amountToBeBorrowed) {
        this.amountToBeBorrowed = amountToBeBorrowed;
    }

    //get and set amountToBePaidPerDay
    public double getInterestToBePaidPerDay() {
        return interestToBePaidPerDay;
    }
    public void setInterestToBePaidPerDay(double interestToBePaidPerDay) {
        this.interestToBePaidPerDay = interestToBePaidPerDay;
    }

    //get and set amountToBePaidPerWeek
    public double getInterestToBePaidPerWeek() {
        return interestToBePaidPerWeek;
    }
    public void setInterestToBePaidPerWeek(double interestToBePaidPerWeek) {
        this.interestToBePaidPerWeek = interestToBePaidPerWeek;
    }

    //get and set amountToBePaidPerMonth
    public double getInterestToBePaidPerMonth(){
        return interestToBePaidPerMonth;
    }
    public void setInterestToBePaidPerMonth(double interestToBePaidPerMonth){
        this.interestToBePaidPerMonth = interestToBePaidPerMonth;
    }

    //get and set amountToBePaidPerYear
    public double getInterestToBePaidPerYear(){
        return interestToBePaidPerYear;
    }
    public void setInterestToBePaidPerYear(double interestToBePaidPerYear){
        this.interestToBePaidPerYear = interestToBePaidPerYear;
    }

    //get and set ratePerMonth
    public double getRatePerMonth(){
        return ratePerMonth;
    }
    public void setRatePerMonth(double ratePerMonth){
        this.ratePerMonth = ratePerMonth;
    }

    //get and set output
    public String getOutPut(){
        return outPut;
    }
    public void setOutPut(String outPut){
        this.outPut = outPut;
    }

}

