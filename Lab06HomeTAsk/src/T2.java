
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
public class T2 {

    public static void main(String[] args) {
        int maxNumber = 13;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println("8:");
        Scanner sc = new Scanner(System.in);
        maxNumber = sc.nextInt();

        System.out.print("Fibonacci series of " + maxNumber + "numbers:");
        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + " ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
