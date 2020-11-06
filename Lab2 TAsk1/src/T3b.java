
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
public class T3b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BMI number: ");
        double BMI = sc.nextDouble();

        String message = (BMI < 18.5) ? "You are under weight"
                : (BMI > 18.5 || BMI < 24.9) ? "You are healthy"
                        : (BMI > 25 || BMI < 29.9) ? "You are overweight"
                                : (BMI > 30 || BMI < 39.9) ? "You are obese"
                                        : "you are elephant";

        System.out.println(message);

    }
}
