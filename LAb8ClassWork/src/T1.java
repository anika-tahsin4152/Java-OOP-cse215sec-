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
    int numerator;
    int denomerator;

    public T1(int numerator, int denomerator) {
        this.numerator = numerator;
        this.denomerator = denomerator;
    }    

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenomerator() {
        return denomerator;
    }

    public void setDenomerator(int denomerator) {
        this.denomerator = denomerator;
    }
     
    public void add(T1 Fraction){
        this.numerator=Fraction.numerator;
        this.denomerator=Fraction.denomerator;
        System.out.println(numerator+" / "+denomerator);
    }     
         
     }   
        
        
    

