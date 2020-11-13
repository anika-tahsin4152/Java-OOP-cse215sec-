/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Scanner;

/**
 *
 * @author Hridi
 */
public class Lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two integer");

        int num1 = sc.nextInt();
        //System.out.println("please entered"+num1);
        int num2 = sc.nextInt();
        //System.out.println("please entered"+num2);

        if (num1 > num2) {
            System.out.println(num1 + "greater than " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + "greater than " + num1);
        } else {
            System.out.println(num1 + " and " + num2 + " are equal");
        }

        /*  if (num == 0)
        {
            System.out.println("you have entered zero");
        }
        else
            System.out.println("non zero");*/
    }

}
