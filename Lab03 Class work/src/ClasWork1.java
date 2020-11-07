
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
public class ClasWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        
        while( i<=num){
            sum = sum+i;
            if(i==num){
                System.out.println(i+ "  ");
                break;
            }
            System.out.println(i+ " + ");
            i++;
    }
        
    }
}
