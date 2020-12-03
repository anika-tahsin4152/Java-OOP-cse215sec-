/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class Calculator {

    public double add(double a, double b) {
        return a + b;

    }

    public double subtract(double a, double b) {
        return a - b;

    }

    public double multiply(double a, double b) {
        return a * b;

    }

    public double devide(double a, double b) {
        if (b != 0) {
            return a/b ;
        } else {
            System.out.println("Zero");
            return -1.0;
        }
        
    }
}
