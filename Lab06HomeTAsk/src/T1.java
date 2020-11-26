
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

        int[] number = new int[6];
        System.out.print("please Enter 6 number: ");
        int sum = 0;
        int totalsub=6;
        int num=3;
        double percentange;
        number[0] = sc.nextInt();
        number[1] = sc.nextInt();
        number[2] = sc.nextInt();
        number[3] = sc.nextInt();
        number[4] = sc.nextInt();
        number[5] = sc.nextInt();

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }
         percentange=(3*100/6);
        System.out.println("The average is : " + sum / number.length);
        System.out.println("The percentange is : " +percentange+"%");

    }
    

}
