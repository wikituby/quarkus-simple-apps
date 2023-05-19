package SimpleQuarkusApps.NSSFCalculator.services;
import jakarta.enterprise.context.ApplicationScoped;
import SimpleQuarkusApps.NSSFCalculator.models.Nssf;

@ApplicationScoped
public class NssfService {

    public String calculateNetPay(double clientGrossAmount) {
        Nssf nssfObj = new Nssf();
        nssfObj.setGrossAmount(clientGrossAmount);
        double calNssf = nssfObj.getGrossAmount()*nssfObj.EMPLOYEE_RATE;
        nssfObj.setEmployeeNssfContribution(calNssf);
        double calNetAmount = nssfObj.getGrossAmount()-nssfObj.getEmployeeNssfContribution();
        nssfObj.setNetPay(calNetAmount);
        String output = String.format("Employee NetPay = %.2f, Employee Nssf Contribution= %.2f,", nssfObj.getNetPay(), nssfObj.getEmployeeNssfContribution());
        return output;
    }

    public String calculateGrossAmount(double employerNssf) {
        Nssf nssfObj = new Nssf();
        nssfObj.setEmployerNssfContribution(employerNssf);
        double calGrossAmount = nssfObj.getEmployerNssfContribution() / nssfObj.EMPLOYER_RATE;
        nssfObj.setGrossAmount(calGrossAmount);
        String output = String.format("GrossAmount = %.2f", nssfObj.getGrossAmount());
        return output;
    }

    public String calculateRatesAndInfo() {
        return "1: Nssf Employer Contribution = 10% of GrossPay.\n2: Nssf Employee Contribution = 5% of GrossPay\n3: Total Nssf Contribution from Employee and Employer = 15%";
    }
    public String calculateNssfContribution(double clientGrossAmount){
        Nssf nssfObj = new Nssf();
        nssfObj.setGrossAmount(clientGrossAmount);
        double calEmployeeNssfContribution = nssfObj.getGrossAmount()*nssfObj.EMPLOYEE_RATE;
        nssfObj.setEmployeeNssfContribution(calEmployeeNssfContribution);
        double calEmployerNssfContribution = nssfObj.getGrossAmount()*nssfObj.EMPLOYER_RATE;
        nssfObj.setEmployerNssfContribution(calEmployerNssfContribution);
        double calNetAmount = nssfObj.getGrossAmount()-nssfObj.getEmployeeNssfContribution();
        nssfObj.setNetPay(calNetAmount);
        double calNssfTotalContribution = nssfObj.getEmployerNssfContribution()+nssfObj.getEmployeeNssfContribution();
        nssfObj.setNssfTotalContribution(calNssfTotalContribution);
        String output = String.format("Employee Nssf contribution = %.2f,Employer Nssf contribution = %.2f, Nssf total Contribution = %.2f,", nssfObj.getEmployeeNssfContribution(), nssfObj.getEmployerNssfContribution(), nssfObj.getNssfTotalContribution());
        return output;
        }

}
