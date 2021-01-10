
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hridi
 */
public class FarmerRegistrationSystem {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("First Name : ");
        String firstName = s.next();
        if (firstName.matches("String")) {
            System.out.println("Please enter a valid First Name !");
            firstName = s.next();
        }
        System.out.println("Last Name : ");
        String lastName = s.next();
        if ((lastName.matches("String"))) {
            System.out.println("Please enter a valid Last Name !");
            lastName = s.next();
        }

        int age = 0;
        System.out.println("Date of Birth(dd-mm-yyyy) : ");
        String dateOfBirth = s.next();
        String[] dob = dateOfBirth.split("-");
        int year = 0;
        try {
            year = Integer.parseInt(dob[2]);
        } catch (Exception e) {
            System.out.println("Invalid Date of Birth");
        }
        age = 2021 - year;
        if (age < 18) {
            System.out.println("Enter valid date of birth.");
            dateOfBirth = s.next();
            dob = dateOfBirth.split("-");
            try {
                year = Integer.parseInt(dob[2]);
            } catch (Exception e) {
                System.out.println("Invalid Date of Birth");
            }
            age = 2021 - year;
        }

        System.out.println("Number of family members above age 18 : ");
        String numFamilyAbove = s.next();
        int num = 0;
        try {
            num = Integer.parseInt(numFamilyAbove);
        } catch (Exception e) {
            System.out.println("Number of family members above age 18 : ");
            numFamilyAbove = s.next();
            num = Integer.parseInt(numFamilyAbove);
        }
        if (num > 15) {
            System.out.println("Enter a valid number.");
            numFamilyAbove = s.next();
            num = Integer.parseInt(numFamilyAbove);
        }

        System.out.println("Number of family members below age 18 : ");
        String numFamilyBelow = s.next();

        System.out.println("Average Monthly Personal Income : ");
        String avgMIncome = s.next();
        if (avgMIncome.matches("String") || avgMIncome.length() > 6) {
            System.out.println("Enter a valid income. ");
            avgMIncome = s.next();
        }
        System.out.println("AverageMonthly Family Income by : ");
        String avgMFIncome = s.next();
        if (avgMFIncome.matches("String") || avgMFIncome.length() > 6) {
            System.out.println("Enter a valid income. ");
            avgMFIncome = s.next();
        }

        System.out.println("Average Monthly family Expanse : ");
        String familyExpense = s.next();
        double familyIn = Double.valueOf(avgMFIncome);
        double familyExp = Double.valueOf(familyExpense);
        if (familyExpense.matches("String") || familyExpense.length() > 6 || familyExp > 25 * familyIn / 100) {
            System.out.println("Enter a valid familyexpense. ");
            familyExpense = s.next();
            familyExp = Double.valueOf(familyExpense);

        }

        System.out.println("Average Monthly Farming Expense : ");
        String FarmExpense = s.next();
        double farmingExp = Double.valueOf(FarmExpense);
        if (farmingExp > 25 * familyIn / 100) {
            System.out.println("Enter a valid farming expense.");
            FarmExpense = s.next();
            farmingExp = Double.valueOf(FarmExpense);
        }

        System.out.println("If they need any help from the government : ");
        String help = s.next();
        if (!(help.equalsIgnoreCase("true") || help.equalsIgnoreCase("false"))) {
            System.out.println("Please enter a valid input(true/false).");
            help = s.next();
        }

        System.out.println("Amount of money they wish to have as stipend from the Govt : ");
        String stipend = s.next();
        double amount = Double.valueOf(stipend);
        if (stipend.matches("String") || amount > 25 * familyIn / 100) {
            System.out.println("Enter a valid amount.");
            stipend = s.next();
            amount = Double.valueOf(stipend);
        }

        System.out.println("Fertilizers (in Kg) s/he needs to buy each month : ");
        String FertilizerKg = s.next();
        if (FertilizerKg.matches("String") || FertilizerKg.length() > 2) {
            System.out.println("Enter a valid amount in kg.");
            FertilizerKg = s.next();
        }
    }

}
