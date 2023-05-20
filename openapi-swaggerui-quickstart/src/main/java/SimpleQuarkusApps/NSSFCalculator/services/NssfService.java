package SimpleQuarkusApps.NSSFCalculator.services;
import jakarta.enterprise.context.ApplicationScoped;
import SimpleQuarkusApps.NSSFCalculator.models.Nssf;

@ApplicationScoped
public class NssfService {

    public String calculateRatesAndInfo() {
        return "1: Nssf Employer Contribution = 10% of GrossPay.\n2: Nssf Employee Contribution = 5% of GrossPay\n3: Total Nssf Contribution from Employee and Employer = 15%";
    }
    public String calculateNssfContribution(double grossPay){
        Nssf nssfObj = new Nssf();
        nssfObj.setGrossPay(grossPay);
        double calEmployeeNssfContribution = nssfObj.EMPLOYEE_RATE * nssfObj.getGrossPay();
        nssfObj.setEmployeeNssfContribution(calEmployeeNssfContribution);
        double calEmployerNssfContribution = nssfObj.EMPLOYER_RATE * nssfObj.getGrossPay();
        nssfObj.setEmployerNssfContribution(calEmployerNssfContribution);
        double calNetAmount = nssfObj.getGrossPay()-nssfObj.getEmployeeNssfContribution();
        nssfObj.setNetPay(calNetAmount);
        double calNssfTotalContribution = nssfObj.getEmployerNssfContribution()+nssfObj.getEmployeeNssfContribution();
        nssfObj.setNssfTotalContribution(calNssfTotalContribution);
        return String.format("Employee Nssf contribution = %.2f,Employer Nssf contribution = %.2f, Nssf total Contribution = %.2f,", nssfObj.getEmployeeNssfContribution(), nssfObj.getEmployerNssfContribution(), nssfObj.getNssfTotalContribution());
    }
    public String calculateGrossPay(double employerNssfContribution) {
        Nssf nssfObj = new Nssf();
        nssfObj.setEmployerNssfContribution(employerNssfContribution);
        double calGrossAmount = nssfObj.getEmployerNssfContribution() / nssfObj.EMPLOYER_RATE;
        nssfObj.setGrossPay(calGrossAmount);
        return String.format("GrossPay = %.2f", nssfObj.getGrossPay());
    }

    public String calculateNetPay(double grossPay) {
        Nssf nssfObj = new Nssf();
        nssfObj.setGrossPay(grossPay);
        double calNssf = nssfObj.EMPLOYEE_RATE * nssfObj.getGrossPay();
        nssfObj.setEmployeeNssfContribution(calNssf);
        double calNetAmount = nssfObj.getGrossPay()-nssfObj.getEmployeeNssfContribution();
        nssfObj.setNetPay(calNetAmount);
        return String.format("Employee NetPay = %.2f, Employee Nssf Contribution= %.2f,", nssfObj.getNetPay(), nssfObj.getEmployeeNssfContribution());
    }

}
