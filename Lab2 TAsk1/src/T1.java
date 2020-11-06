
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
public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();
        
        switch(num%2){
            case 0:
                System.out.println("Given number is even ");
                break;
            case 1:
                System.out.println("Given number is odd");
                break;
            
        }
    }
 
}
