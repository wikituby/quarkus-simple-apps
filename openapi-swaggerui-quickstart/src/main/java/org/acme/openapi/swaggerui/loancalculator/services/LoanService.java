package org.acme.openapi.swaggerui.loancalculator.services;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.openapi.swaggerui.loancalculator.models.Loan;


@ApplicationScoped
public class LoanService {

    //calculating interest per month
    public String calculateInterestToBePaidPerMonth(double clientAmountToBeBorrowed, double clientRatePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setAmountToBeBorrowed(clientAmountToBeBorrowed);
        loanObj.setRatePerMonth(clientRatePerMonth);
        double calInterestToBePaidPerMonth = (loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed();
        loanObj.setInterestToBePaidPerMonth(calInterestToBePaidPerMonth);
        double calInterestToBePaidPerDay = (((loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed())/30);
        loanObj.setInterestToBePaidPerDay(calInterestToBePaidPerDay);
        double calInterestToBePaidPerWeek = (loanObj.getInterestToBePaidPerDay()*7);
        loanObj.setInterestToBePaidPerWeek(calInterestToBePaidPerWeek);
        double calInterestToBePaidPerYear = (loanObj.getInterestToBePaidPerMonth()*12);
        loanObj.setInterestToBePaidPerYear(calInterestToBePaidPerYear);
        String calOutput = String.format("Interest per Month = %.2f, Interest per Day = %.2f, Interest per Week = %.2f, Interest per Year = %.2f,", loanObj.getInterestToBePaidPerMonth(), loanObj.getInterestToBePaidPerDay(), loanObj.getInterestToBePaidPerWeek(), loanObj.getInterestToBePaidPerYear());
        loanObj.setOutPut(calOutput);
        return loanObj.getOutPut();
    }
    //calculating interest per day

    public String calculateInterestToBePaidPerDay(double clientAmountToBeBorrowed, double clientRatePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setAmountToBeBorrowed(clientAmountToBeBorrowed);
        loanObj.setRatePerMonth(clientRatePerMonth);
        double calInterestToBePaidPerMonth = (loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed();
        loanObj.setInterestToBePaidPerMonth(calInterestToBePaidPerMonth);
        double calInterestToBePaidPerDay = (((loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed())/30);
        loanObj.setInterestToBePaidPerDay(calInterestToBePaidPerDay);
        double calInterestToBePaidPerWeek = (loanObj.getInterestToBePaidPerDay()*7);
        loanObj.setInterestToBePaidPerWeek(calInterestToBePaidPerWeek);
        double calInterestToBePaidPerYear = (loanObj.getInterestToBePaidPerMonth()*12);
        loanObj.setInterestToBePaidPerYear(calInterestToBePaidPerYear);
        String calOutput = String.format("Interest per Day = %.2f, Interest per Week = %.2f, Interest per Year = %.2f, Interest per Month = %.2f, ", loanObj.getInterestToBePaidPerDay(), loanObj.getInterestToBePaidPerWeek(), loanObj.getInterestToBePaidPerYear(), loanObj.getInterestToBePaidPerMonth());
        loanObj.setOutPut(calOutput);
        return loanObj.getOutPut();
    }
    //calculating interest per week

    public String calculateInterestToBePaidPerWeek(double clientAmountToBeBorrowed, double clientRatePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setAmountToBeBorrowed(clientAmountToBeBorrowed);
        loanObj.setRatePerMonth(clientRatePerMonth);
        double calInterestToBePaidPerMonth = (loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed();
        loanObj.setInterestToBePaidPerMonth(calInterestToBePaidPerMonth);
        double calInterestToBePaidPerDay = (((loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed())/30);
        loanObj.setInterestToBePaidPerDay(calInterestToBePaidPerDay);
        double calInterestToBePaidPerWeek = (loanObj.getInterestToBePaidPerDay()*7);
        loanObj.setInterestToBePaidPerWeek(calInterestToBePaidPerWeek);
        double calInterestToBePaidPerYear = (loanObj.getInterestToBePaidPerMonth()*12);
        loanObj.setInterestToBePaidPerYear(calInterestToBePaidPerYear);
        String calOutput = String.format("Interest per Week = %.2f, Interest per Day = %.2f, Interest per Year = %.2f, Interest per Month = %.2f, ", loanObj.getInterestToBePaidPerWeek(), loanObj.getInterestToBePaidPerDay(), loanObj.getInterestToBePaidPerYear(), loanObj.getInterestToBePaidPerMonth());
        loanObj.setOutPut(calOutput);
        return loanObj.getOutPut();
    }
    //calculating interest per Year
    public String calculateInterestToBePaidPerYear(double clientAmountToBeBorrowed, double clientRatePerMonth){
        Loan loanObj = new Loan();
        loanObj.setAmountToBeBorrowed(clientAmountToBeBorrowed);
        loanObj.setRatePerMonth(clientRatePerMonth);
        double calInterestToBePaidPerMonth = (loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed();
        loanObj.setInterestToBePaidPerMonth(calInterestToBePaidPerMonth);
        double calInterestToBePaidPerDay = (((loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed())/30);
        loanObj.setInterestToBePaidPerDay(calInterestToBePaidPerDay);
        double calInterestToBePaidPerWeek = (loanObj.getInterestToBePaidPerDay()*7);
        loanObj.setInterestToBePaidPerWeek(calInterestToBePaidPerWeek);
        double calInterestToBePaidPerYear = (loanObj.getInterestToBePaidPerMonth()*12);
        loanObj.setInterestToBePaidPerYear(calInterestToBePaidPerYear);
        String calOutput = String.format("Interest per Year = %.2f, Interest per Month = %.2f, Interest per Day = %.2f, Interest per Week = %.2f", loanObj.getInterestToBePaidPerYear(), loanObj.getInterestToBePaidPerMonth(), loanObj.getInterestToBePaidPerDay(), loanObj.getInterestToBePaidPerWeek());
        loanObj.setOutPut(calOutput);
        return loanObj.getOutPut();
    }
    //calculating rate per month
    public String calculateRatePerMonth(double clientInterestPerMonth, double clientAmountToBorrow){
        Loan loanObj = new Loan();
        loanObj.setInterestToBePaidPerMonth(clientInterestPerMonth);
        loanObj.setAmountToBeBorrowed(clientAmountToBorrow);

        double calRatePerMonth = loanObj.getInterestToBePaidPerMonth()/loanObj.getAmountToBeBorrowed();
        loanObj.setRatePerMonth(calRatePerMonth);

        double calInterestToBePaidPerMonth = (loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed();
        loanObj.setInterestToBePaidPerMonth(calInterestToBePaidPerMonth);
        double calInterestToBePaidPerDay = (((loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed())/30);
        loanObj.setInterestToBePaidPerDay(calInterestToBePaidPerDay);
        double calInterestToBePaidPerWeek = (loanObj.getInterestToBePaidPerDay()*7);
        loanObj.setInterestToBePaidPerWeek(calInterestToBePaidPerWeek);
        double calInterestToBePaidPerYear = (loanObj.getInterestToBePaidPerMonth()*12);
        loanObj.setInterestToBePaidPerYear(calInterestToBePaidPerYear);

        String calOutput = String.format("Rate per Month = %.2f, Interest per Month = %.2f, Interest per Day = %.2f, Interest per Week = %.2f", loanObj.getRatePerMonth(), loanObj.getInterestToBePaidPerMonth(), loanObj.getInterestToBePaidPerDay(), loanObj.getInterestToBePaidPerWeek());
        loanObj.setOutPut(calOutput);
        return loanObj.getOutPut();

    }
    //calculate amount to be borrowed
    public String calculateAmountToBeBorrowed(double clientInterestPerMonth, double clientRatePerMonth){
        Loan loanObj = new Loan();
        loanObj.setInterestToBePaidPerMonth(clientInterestPerMonth);
        loanObj.setRatePerMonth(clientRatePerMonth);
        double calAmountToBeBorrowed = ((loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed())/(loanObj.getRatePerMonth()/100);
        loanObj.setAmountToBeBorrowed(calAmountToBeBorrowed);

        double calInterestToBePaidPerMonth = (loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed();
        loanObj.setInterestToBePaidPerMonth(calInterestToBePaidPerMonth);
        double calInterestToBePaidPerDay = (((loanObj.getRatePerMonth()/100)*loanObj.getAmountToBeBorrowed())/30);
        loanObj.setInterestToBePaidPerDay(calInterestToBePaidPerDay);
        double calInterestToBePaidPerWeek = (loanObj.getInterestToBePaidPerDay()*7);
        loanObj.setInterestToBePaidPerWeek(calInterestToBePaidPerWeek);
        double calInterestToBePaidPerYear = (loanObj.getInterestToBePaidPerMonth()*12);
        loanObj.setInterestToBePaidPerYear(calInterestToBePaidPerYear);

        String calOutput = String.format("Amount to Borrow = %.2f, Interest per Month = %.2f, Interest per Day = %.2f, Interest per Week = %.2f", loanObj.getAmountToBeBorrowed(), loanObj.getInterestToBePaidPerMonth(), loanObj.getInterestToBePaidPerDay(), loanObj.getInterestToBePaidPerWeek());
        loanObj.setOutPut(calOutput);
        return loanObj.getOutPut();

    }

}
