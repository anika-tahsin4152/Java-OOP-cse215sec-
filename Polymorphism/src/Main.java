
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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        String color = sc.next();
        Boolean f = true;

        Triangle obj = new Triangle(s1, s2, s3, color, f);

        String isfilledT;
        if (f == true) {
            isfilledT = "Yes";
        } else {
            isfilledT = "No";
        }
        System.out.printf(obj.getArea() + obj.getPerimeter() + obj.getColor(), isfilledT);

        s1 = sc.nextDouble();
        s2 = sc.nextDouble();

        color = sc.next();
        f = true;
        Rectangle objr = new Rectangle(s1, s2, color, f);

        objr.displayObject();
        objr.displayObject();
    }
}
