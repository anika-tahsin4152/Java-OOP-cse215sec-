
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

        //System.out.println("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        //int num = sc.nextInt();
        int lower = 1;
        int upper = 1000;
        for (int i = lower + 1; i < upper; i++) {

            while (i % 5 == 0) {

                i++;

                while (i % 8 == 0) {

                    i++;
                    System.out.println(i + " ");
                }
            }
        }
    }

}
