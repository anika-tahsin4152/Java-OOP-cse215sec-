
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
public class T3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number: ");
        double BMI = sc.nextDouble();

        if (BMI < 18.5) {
            System.out.println("You are underweight");
        } else if (BMI > 18.5 || BMI < 24.9) {
            System.out.println("You are healty");}
            else if (BMI > 25 || BMI < 29.9){
            System.out.println("You are over weight");}
          else if (BMI>30 || BMI<39.9){
            System.out.println("You are obese");}
          else{
            System.out.println("You are elephant");}

        }
    }


