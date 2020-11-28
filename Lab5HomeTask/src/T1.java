/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {
        cVowel();
    }

    public static void cVowel() {
        int count = 0;
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                count++;

            }
        }
        System.out.println(+count);

    }
}
