
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
public class s2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        switch (st) {
            case "one":
                System.out.println("Entered 1");
                break;
            case "two":
                System.out.println("Entered 2");
                break;
            case "three":
                System.out.println("Entered 3");
                break;

            default:
                System.out.println("anything else");

        }
    }

}
