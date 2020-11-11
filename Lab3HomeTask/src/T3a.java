

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
public class T3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        //int max = sc.nextInt();
        //System.out.println("Enter Minimum Number: ");
        //int min = sc.nextInt();
        int randomNumber =sc.nextInt();
       int min =1;
        int max=1000;
       int  randNumber = (int) (min + Math.random()* (max-min +1));
        System.out.println(randNumber);
    
    
    }
}
