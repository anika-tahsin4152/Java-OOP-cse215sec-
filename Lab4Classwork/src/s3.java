
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
public class s3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of one side for the hexaagon: ");
        double s = sc.nextDouble();
        double hexagonArea = ((6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6)));
        System.out.println(hexagonArea);

    }
}
