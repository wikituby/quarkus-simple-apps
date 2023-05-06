package org.acme.openapi.swaggerui.nssfcalculator.services;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.openapi.swaggerui.nssfcalculator.models.Nssf;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

@ApplicationScoped
public class NssfService {

    public String calculateNetPay(double clientGrossAmount) {
        Nssf nssfObj = new Nssf();
        nssfObj.setGrossAmount(clientGrossAmount);
        nssfObj.setEmployeeRate(0.05);
        double calNssf = nssfObj.getGrossAmount()*nssfObj.getEmployeeRate();
        nssfObj.setEmployeeNssfContribution(calNssf);
        double calNetAmount = nssfObj.getGrossAmount()-nssfObj.getEmployeeNssfContribution();
        nssfObj.setNetPay(calNetAmount);
        String calOutput = String.format("Employee NetPay = %.2f, Employee Nssf Contribution= %.2f,", nssfObj.getNetPay(), nssfObj.getEmployeeNssfContribution());
        nssfObj.setOutPut(calOutput);
        return nssfObj.getOutPut();
    }

    public String calculateGrossAmount(double employerNssf) {
        Nssf nssfObj = new Nssf();
        nssfObj.setEmployerNssfContribution(employerNssf);
        nssfObj.setEmployerRate(0.1);
        double calGrossAmount = nssfObj.getEmployerNssfContribution() / nssfObj.getEmployerRate();
        nssfObj.setGrossAmount(calGrossAmount);

        String calOutput = String.format("GrossAmount = %.2f", nssfObj.getGrossAmount());
        nssfObj.setOutPut(calOutput);
        return nssfObj.getOutPut();
    }

    public String calculateRatesAndInfo() {
        Nssf nssfObj = new Nssf();
        /*File file = new File("NssfInfo.txt");
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
        nssfObj.setEmployeeRate(0.05);
        nssfObj.setEmployerRate(0.1);
        double calEmployeeNssfContribution = nssfObj.getGrossAmount()*nssfObj.getEmployeeRate();
        nssfObj.setEmployeeNssfContribution(calEmployeeNssfContribution);
        double calEmployerNssfContribution = nssfObj.getGrossAmount()*nssfObj.getEmployerRate();
        nssfObj.setEmployerNssfContribution(calEmployerNssfContribution);
        double calNetAmount = nssfObj.getGrossAmount()-nssfObj.getEmployeeNssfContribution();
        nssfObj.setNetPay(calNetAmount);
        String calOutput = String.format("Employee Nssf contribution = %.2f,Employer Nssf contribution = %.2f, Employee NetPay = %.2f,", nssfObj.getEmployeeNssfContribution(), nssfObj.getEmployerNssfContribution(), nssfObj.getNetPay());
        nssfObj.setOutPut(calOutput);
        return nssfObj.getOutPut();
        }

}
