
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
public class Work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        
        for (i=0;i<num;i++){
            sum = sum+i;
            if(i==num){
                System.out.println(i+"  ");
                break;
            }
            System.out.println(i+" + ");
        }
        System.out.println("="+sum);
    }
}
