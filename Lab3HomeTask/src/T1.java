
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
        System.out.println("Enter name : ");

        String myName = sc.nextLine();
        int i;

        for (i = 1; i <= 50; i++) {

            System.out.println(myName);
        }
    }

}
