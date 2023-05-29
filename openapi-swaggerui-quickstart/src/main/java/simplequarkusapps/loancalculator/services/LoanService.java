package simplequarkusapps.loancalculator.services;

import jakarta.enterprise.context.ApplicationScoped;
import simplequarkusapps.loancalculator.models.Loan;


@ApplicationScoped
public class LoanService {

    //calculating interest per month
    public String calculateInterest(double principal, double ratePerMonth, int years, int months, int weeks, int days) {
        Loan loanObj = new Loan();
        loanObj.setPrincipal(principal);
        loanObj.setRatePerMonth(ratePerMonth);
        loanObj.setYears(years);
        loanObj.setMonths(months);
        loanObj.setWeeks(weeks);
        loanObj.setDays(days);
        loanObj.calculateInterestPerMonths();
        loanObj.calculateInterestPerDays();
        loanObj.calculateInterestPerWeeks();
        loanObj.calculateInterestPerYears();
        loanObj.calculateTotalInterestInGivenPeriod();
        return String.format("Interest in a given period %.2f", loanObj.getTotalInterestInGivenPeriod());
        //return String.format("Interest period = %.2f, Interest per Month = %.2f, Interest per Day = %.2f, Interest per Week = %.2f", loanObj.getInterestPerYear(), loanObj.getInterestPerMonth(), loanObj.getInterestPerDay(), loanObj.getInterestPerWeek());

    }

   /* //calculating interest per day
    public String calculateInterestPerDay(double principal, double ratePerMonth) {
        Loan1 loanObj = new Loan1();
        loanObj.setPrincipal(principal);
        loanObj.setRatePerMonth(ratePerMonth);
        loanObj.calculateInterestPerDay();
        return String.format("Interest per Day = %.2f, Interest per Week = %.2f, Interest per Year = %.2f, Interest per Month = %.2f, ", loanObj.getInterestPerDay(), loanObj.getInterestPerWeek(), loanObj.getInterestPerYear(), loanObj.getInterestPerMonth());
    }

    //calculating interest per week new version
    public String calculateInterestPerWeek(double principal, double ratePerMonth) {
        Loan1 loanObj = new Loan1();
        loanObj.setPrincipal(principal);
        loanObj.setRatePerMonth(ratePerMonth);
        loanObj.calculateInterestPerWeek();
        return String.format("Interest per Week = %.2f, Interest per Day = %.2f, Interest per Year = %.2f, Interest per Month = %.2f, ", loanObj.getInterestPerWeek(), loanObj.getInterestPerDay(), loanObj.getInterestPerYear(), loanObj.getInterestPerMonth());
    }

    //calculating interest per Year
    public String calculateInterestPerYear(double principal, double ratePerMonth) {
        Loan1 loanObj = new Loan1();
        loanObj.setPrincipal(principal);
        loanObj.setRatePerMonth(ratePerMonth);
        loanObj.calculateInterestPerYear();
        return String.format("Interest per Year = %.2f, Interest per Month = %.2f, Interest per Day = %.2f, Interest per Week = %.2f", loanObj.getInterestPerYear(), loanObj.getInterestPerMonth(), loanObj.getInterestPerDay(), loanObj.getInterestPerWeek());
    }

    //calculating rate per month
    public String calculateRatePerMonth(double interestPerMonth, double principal) {
        Loan1 loanObj = new Loan1();
        loanObj.setInterestPerMonth(interestPerMonth);
        loanObj.setPrincipal(principal);
        loanObj.calculateRatePerMonth();
        return String.format("Rate per Month = %.2f", loanObj.getRatePerMonth());
    }

    //calculate amount to be borrowed
    public String calculatePrincipal(double interestPerMonth, double ratePerMonth) {
        Loan1 loanObj = new Loan1();
        loanObj.setInterestPerMonth(interestPerMonth);
        loanObj.setRatePerMonth(ratePerMonth);
        loanObj.calculatePrincipal();
        return String.format("Principal = %.2f", loanObj.getPrincipal());
    }*/

}
