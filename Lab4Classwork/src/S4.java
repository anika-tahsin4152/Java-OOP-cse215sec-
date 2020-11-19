
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
public class S4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Stirng: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second Stirng: ");
        String s2 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 < n2) {
            System.out.println("The second string should smaleer than the first one length");
        }
        if (s1.substring(0, n2).equals(s2)) {
            System.out.println("String" + s1 + "Starts with String " + s2);
        } else if (s1.substring(n1 - n2, n1 - 1).equals(s2)) {
            System.out.println("String" + s1 + "Starts with String " + s2);
        } else {
            System.out.println("String" + s1 + "has no match with " + s2);
        }

    }
}
