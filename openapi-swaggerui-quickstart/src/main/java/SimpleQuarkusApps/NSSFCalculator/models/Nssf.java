package SimpleQuarkusApps.NSSFCalculator.models;

public class Nssf {
    private double netPay;
    private double EmployeeNssfContribution;
    private double EmployerNssfContribution;
    private double NssfTotalContribution;
    private double grossAmount;
    public static final double EMPLOYEE_RATE = 0.05;
    public static final double EMPLOYER_RATE = 0.1;

    public Nssf() {
    }

    public Nssf(double netPay, double EmployeeNssfContribution, double grossAmount, double EmployerNssfContribution, double NssfTotalContribution) {
        this.netPay = netPay;
        this.EmployeeNssfContribution = EmployeeNssfContribution;
        this.EmployerNssfContribution = EmployerNssfContribution;
        this.grossAmount = grossAmount;
        this.NssfTotalContribution = NssfTotalContribution;
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

    public double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public double getNssfTotalContribution() {
        return NssfTotalContribution;
    }

    public void setNssfTotalContribution(double NssfTotalContribution) {
        this.NssfTotalContribution = NssfTotalContribution;
    }

}