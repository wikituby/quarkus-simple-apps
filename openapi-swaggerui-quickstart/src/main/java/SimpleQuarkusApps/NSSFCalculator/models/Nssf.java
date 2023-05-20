package SimpleQuarkusApps.NSSFCalculator.models;

public class Nssf {
    private double netPay;
    private double EmployeeNssfContribution;
    private double EmployerNssfContribution;
    private double NssfTotalContribution;
    private double grossPay;
    public final double EMPLOYEE_RATE = 0.05;
    public final double EMPLOYER_RATE = 0.1;

    public Nssf() {
    }

    public Nssf(double netPay, double EmployeeNssfContribution, double grossPay, double EmployerNssfContribution, double NssfTotalContribution) {
        this.netPay = netPay;
        this.EmployeeNssfContribution = EmployeeNssfContribution;
        this.EmployerNssfContribution = EmployerNssfContribution;
        this.grossPay = grossPay;
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

    public void setEmployeeNssfContribution(double EmployeeNssfContribution) {this.EmployeeNssfContribution = EmployeeNssfContribution;}

    public double getEmployerNssfContribution() {
        return EmployerNssfContribution;
    }

    public void setEmployerNssfContribution(double EmployerNssfContribution) {this.EmployerNssfContribution = EmployerNssfContribution;}

    public double getGrossPay() {
        return grossPay;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getNssfTotalContribution() {
        return NssfTotalContribution;
    }

    public void setNssfTotalContribution(double NssfTotalContribution) {this.NssfTotalContribution = NssfTotalContribution;}

}