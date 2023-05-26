package simplequarkusapps.loancalculator.services;

import jakarta.enterprise.context.ApplicationScoped;
import simplequarkusapps.loancalculator.models.Loan;


@ApplicationScoped
public class LoanService {

    //calculating interest per month
    public String calculateInterestPerMonth(double principal, double ratePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setPrincipal(principal);
        loanObj.setRatePerMonth(ratePerMonth);
        loanObj.calculateInterestPerMonth();
        return String.format("Interest per Month = %.2f, Interest per Day = %.2f, Interest per Week = %.2f, Interest per Year = %.2f,", loanObj.getInterestPerMonth(), loanObj.getInterestPerDay(), loanObj.getInterestPerWeek(), loanObj.getInterestPerYear());
    }

    //calculating interest per day
    public String calculateInterestPerDay(double principal, double ratePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setPrincipal(principal);
        loanObj.setRatePerMonth(ratePerMonth);
        loanObj.calculateInterestPerDay();
        return String.format("Interest per Day = %.2f, Interest per Week = %.2f, Interest per Year = %.2f, Interest per Month = %.2f, ", loanObj.getInterestPerDay(), loanObj.getInterestPerWeek(), loanObj.getInterestPerYear(), loanObj.getInterestPerMonth());

    }

    //calculating interest per week new version
    public String calculateInterestPerWeek(double principal, double ratePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setPrincipal(principal);
        loanObj.setRatePerMonth(ratePerMonth);
        loanObj.calculateInterestPerWeek();
        return String.format("Interest per Week = %.2f, Interest per Day = %.2f, Interest per Year = %.2f, Interest per Month = %.2f, ", loanObj.getInterestPerWeek(), loanObj.getInterestPerDay(), loanObj.getInterestPerYear(), loanObj.getInterestPerMonth());

    }

    //calculating interest per Year
    public String calculateInterestPerYear(double principal, double ratePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setPrincipal(principal);
        loanObj.setRatePerMonth(ratePerMonth);
        loanObj.calculateInterestPerYear();
        return String.format("Interest per Year = %.2f, Interest per Month = %.2f, Interest per Day = %.2f, Interest per Week = %.2f", loanObj.getInterestPerYear(), loanObj.getInterestPerMonth(), loanObj.getInterestPerDay(), loanObj.getInterestPerWeek());
    }

    //calculating rate per month
    public String calculateRatePerMonth(double interestPerMonth, double principal) {
        Loan loanObj = new Loan();
        loanObj.setInterestPerMonth(interestPerMonth);
        loanObj.setPrincipal(principal);
        loanObj.calculateRatePerMonth();
        return String.format("Rate per Month = %.2f", loanObj.getRatePerMonth());
    }

    //calculate amount to be borrowed
    public String calculatePrincipal(double interestPerMonth, double ratePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setInterestPerMonth(interestPerMonth);
        loanObj.setRatePerMonth(ratePerMonth);
        loanObj.calculatePrincipal();
        return String.format("Principal = %.2f", loanObj.getPrincipal());
    }

}
