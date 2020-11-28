
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

    public static void IsPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.next();
        String reverse = null;
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            reverse =reverse+ str.charAt(i);
        }
        if (reverse.equals(str))
        {
            System.out.println("String is palindrome");
        } else
        {
            System.out.println("String is not palindrome");
        }
    }

    public static void main(String[] args) {

        IsPalindrome();

    }

}
