package SimpleQuarkusApps.NSSFCalculator.services;
import jakarta.enterprise.context.ApplicationScoped;
import SimpleQuarkusApps.NSSFCalculator.models.Nssf;

@ApplicationScoped
public class NssfService {

    public String calculateNetPay(double clientGrossAmount) {
        Nssf nssfObj = new Nssf();
        nssfObj.setGrossAmount(clientGrossAmount);
        //nssfObj.setEmployeeRate(0.05);
        double calNssf = nssfObj.getGrossAmount()*nssfObj.EMPLOYEE_RATE;
        nssfObj.setEmployeeNssfContribution(calNssf);
        double calNetAmount = nssfObj.getGrossAmount()-nssfObj.getEmployeeNssfContribution();
        nssfObj.setNetPay(calNetAmount);
        String output = String.format("Employee NetPay = %.2f, Employee Nssf Contribution= %.2f,", nssfObj.getNetPay(), nssfObj.getEmployeeNssfContribution());
        //nssfObj.setOutPut(calOutput);
        return output;
    }

    public String calculateGrossAmount(double employerNssf) {
        Nssf nssfObj = new Nssf();
        nssfObj.setEmployerNssfContribution(employerNssf);
        //nssfObj.setEmployerRate(0.1);
        double calGrossAmount = nssfObj.getEmployerNssfContribution() / nssfObj.EMPLOYER_RATE;
        nssfObj.setGrossAmount(calGrossAmount);
        String output = String.format("GrossAmount = %.2f", nssfObj.getGrossAmount());
        //nssfObj.setOutPut(calOutput);
        return output;
    }

    public String calculateRatesAndInfo() {
        Nssf nssfObj = new Nssf();
        /*
        File file = new File("NssfInfo.txt");
        if (file.exists()) {
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String calOutput = scanner.nextLine();
                    nssfObj.setOutPut(calOutput);

                }
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } else {
            try {
                FileWriter myWriter = new FileWriter("NssfInfo.txt");
                myWriter.write("Files in Java might be tricky, but it is fun enough!");
                myWriter.close();
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String calOutput = scanner.nextLine();
                    nssfObj.setOutPut(calOutput);

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        String calOutput = String.format("Employee Nssf contribution = %.2f,Employer Nssf contribution = %.2f, Employee NetPay = %.2f,", nssfObj.getEmployeeNssfContribution(), nssfObj.getEmployerNssfContribution(), nssfObj.getNetPay());
        nssfObj.setOutPut(calOutput);*/
        return nssfObj.getNssfInfo();
    }
    public String calculateNssfContribution(double clientGrossAmount){
        Nssf nssfObj = new Nssf();
        nssfObj.setGrossAmount(clientGrossAmount);
        //nssfObj.setEmployeeRate(0.05);
        //nssfObj.setEmployerRate(0.1);
        double calEmployeeNssfContribution = nssfObj.getGrossAmount()*nssfObj.EMPLOYEE_RATE;
        nssfObj.setEmployeeNssfContribution(calEmployeeNssfContribution);
        double calEmployerNssfContribution = nssfObj.getGrossAmount()*nssfObj.EMPLOYER_RATE;
        nssfObj.setEmployerNssfContribution(calEmployerNssfContribution);
        double calNetAmount = nssfObj.getGrossAmount()-nssfObj.getEmployeeNssfContribution();
        nssfObj.setNetPay(calNetAmount);
        double calNssfTotalContribution = nssfObj.getEmployerNssfContribution()+nssfObj.getEmployeeNssfContribution();
        nssfObj.setNssfTotalContribution(calNssfTotalContribution);
        String output = String.format("Employee Nssf contribution = %.2f,Employer Nssf contribution = %.2f, Nssf total Contribution = %.2f,", nssfObj.getEmployeeNssfContribution(), nssfObj.getEmployerNssfContribution(), nssfObj.getNssfTotalContribution());
        //nssfObj.setOutPut(calOutput);
        return output;
        }

}
