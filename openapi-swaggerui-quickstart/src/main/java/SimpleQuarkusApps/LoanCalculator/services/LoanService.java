package SimpleQuarkusApps.LoanCalculator.services;

import jakarta.enterprise.context.ApplicationScoped;
import SimpleQuarkusApps.LoanCalculator.models.Loan;


@ApplicationScoped
public class LoanService {

    //calculating interest per month
    public String calculateInterestPerMonth(double clientPrincipal, double clientRatePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setPrincipal(clientPrincipal);
        loanObj.setRatePerMonth(clientRatePerMonth);
        double calInterestPerMonth = (loanObj.getRatePerMonth() / 100) * loanObj.getPrincipal();
        loanObj.setInterestPerMonth(calInterestPerMonth);

        double calInterestPerDay = (loanObj.getInterestPerMonth()/30);
        loanObj.setInterestPerDay(calInterestPerDay);
        double calInterestPerWeek = (loanObj.getInterestPerDay() * 7);
        loanObj.setInterestPerWeek(calInterestPerWeek);
        double calInterestPerYear = (loanObj.getInterestPerMonth() * 12);
        loanObj.setInterestPerYear(calInterestPerYear);
        String output = String.format("Interest per Month = %.2f, Interest per Day = %.2f, Interest per Week = %.2f, Interest per Year = %.2f,", loanObj.getInterestPerMonth(), loanObj.getInterestPerDay(), loanObj.getInterestPerWeek(), loanObj.getInterestPerYear());
        return output;
    }

    //calculating interest per day
    public String calculateInterestPerDay(double clientPrincipal, double clientRatePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setPrincipal(clientPrincipal);
        loanObj.setRatePerMonth(clientRatePerMonth);
        double calInterestPerMonth = (loanObj.getRatePerMonth() / 100) * loanObj.getPrincipal();
        loanObj.setInterestPerMonth(calInterestPerMonth);
        double calInterestPerDay = (loanObj.getInterestPerMonth()/30);
        loanObj.setInterestPerDay(calInterestPerDay);
        double calInterestPerWeek = (loanObj.getInterestPerDay() * 7);
        loanObj.setInterestPerWeek(calInterestPerWeek);
        double calInterestPerYear = (loanObj.getInterestPerMonth() * 12);
        loanObj.setInterestPerYear(calInterestPerYear);
        String output = String.format("Interest per Day = %.2f, Interest per Week = %.2f, Interest per Year = %.2f, Interest per Month = %.2f, ", loanObj.getInterestPerDay(), loanObj.getInterestPerWeek(), loanObj.getInterestPerYear(), loanObj.getInterestPerMonth());
        return output;

    }

    //calculating interest per week new version
    public String calculateInterestPerWeek(double clientPrincipal, double clientRatePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setPrincipal(clientPrincipal);
        loanObj.setRatePerMonth(clientRatePerMonth);
        double calInterestPerMonth = (loanObj.getRatePerMonth() / 100) * loanObj.getPrincipal();
        loanObj.setInterestPerMonth(calInterestPerMonth);
        double calInterestPerDay = (loanObj.getInterestPerMonth()/30);
        loanObj.setInterestPerDay(calInterestPerDay);
        double calInterestPerWeek = (loanObj.getInterestPerDay() * 7);
        loanObj.setInterestPerWeek(calInterestPerWeek);
        double calInterestPerYear = (loanObj.getInterestPerMonth() * 12);
        loanObj.setInterestPerYear(calInterestPerYear);
        String output = String.format("Interest per Week = %.2f, Interest per Day = %.2f, Interest per Year = %.2f, Interest per Month = %.2f, ", loanObj.getInterestPerWeek(), loanObj.getInterestPerDay(), loanObj.getInterestPerYear(), loanObj.getInterestPerMonth());
        return output;

    }

    //calculating interest per Year
    public String calculateInterestPerYear(double clientPrincipal, double clientRatePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setPrincipal(clientPrincipal);
        loanObj.setRatePerMonth(clientRatePerMonth);
        double calInterestPerMonth = (loanObj.getRatePerMonth() / 100) * loanObj.getPrincipal();
        loanObj.setInterestPerMonth(calInterestPerMonth);
        double calInterestPerDay = (loanObj.getInterestPerMonth()/30);
        loanObj.setInterestPerDay(calInterestPerDay);
        double calInterestPerWeek = (loanObj.getInterestPerDay() * 7);
        loanObj.setInterestPerWeek(calInterestPerWeek);
        double calInterestPerYear = (loanObj.getInterestPerMonth() * 12);
        loanObj.setInterestPerYear(calInterestPerYear);
        String output = String.format("Interest per Year = %.2f, Interest per Month = %.2f, Interest per Day = %.2f, Interest per Week = %.2f", loanObj.getInterestPerYear(), loanObj.getInterestPerMonth(), loanObj.getInterestPerDay(), loanObj.getInterestPerWeek());
        return output;

    }

    //calculating rate per month
    public String calculateRatePerMonth(double interestPerMonth, double principal) {
        Loan loanObj = new Loan();
        loanObj.setInterestPerMonth(interestPerMonth);
        loanObj.setPrincipal(principal);

        double calRatePerMonth = loanObj.getInterestPerMonth() / loanObj.getPrincipal();
        loanObj.setRatePerMonth(calRatePerMonth);

        double calInterestPerDay = (loanObj.getInterestPerMonth() / 30);
        loanObj.setInterestPerDay(calInterestPerDay);
        double calInterestPerWeek = (loanObj.getInterestPerDay() * 7);
        loanObj.setInterestPerWeek(calInterestPerWeek);
        double calInterestPerYear = (loanObj.getInterestPerMonth() * 12);
        loanObj.setInterestPerYear(calInterestPerYear);

        String output = String.format("Rate per Month = %.2f, Interest per Month = %.2f, Interest per Day = %.2f, Interest per Week = %.2f", loanObj.getRatePerMonth(), loanObj.getInterestPerMonth(), loanObj.getInterestPerDay(), loanObj.getInterestPerWeek());
        return output;


    }

    //calculate amount to be borrowed
    public String calculatePrincipal(double interestPerMonth, double ratePerMonth) {
        Loan loanObj = new Loan();
        loanObj.setInterestPerMonth(interestPerMonth);
        loanObj.setRatePerMonth(ratePerMonth);
        double calPrincipal = (loanObj.getInterestPerMonth() / (loanObj.getRatePerMonth() / 100));
        loanObj.setPrincipal(calPrincipal);

        double calInterestPerDay = (loanObj.getInterestPerMonth() / 30);
        loanObj.setInterestPerDay(calInterestPerDay);
        double calInterestPerWeek = (loanObj.getInterestPerDay() * 7);
        loanObj.setInterestPerWeek(calInterestPerWeek);
        double calInterestPerYear = (loanObj.getInterestPerMonth() * 12);
        loanObj.setInterestPerYear(calInterestPerYear);

        String output = String.format("Amount to Borrow = %.2f, Interest per Month = %.2f, Interest per Day = %.2f, Interest per Week = %.2f", loanObj.getPrincipal(), loanObj.getInterestPerMonth(), loanObj.getInterestPerDay(), loanObj.getInterestPerWeek());
        return output;
    }

}
