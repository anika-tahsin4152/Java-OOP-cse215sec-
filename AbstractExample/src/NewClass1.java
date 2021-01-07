/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class NewClass1 extends NewClass{

    @Override
    public double printDigit(double a) {
       return a;
    }
    public static void main(String[] args) {
        NewClass ob;
        ob = new NewClass1();
        System.out.println(ob.printDigit(5.5));
        System.out.println(ob.printDigit(5));
    }
    
    
}
