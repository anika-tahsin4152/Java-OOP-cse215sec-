
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
public class Menu {
    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();
    
    public int showMenu(){
        System.out.println("Press 1 for add, 2 for sub,3 for mult, 4for divide");
        System.out.println("Show menu");
        int a = sc.nextInt();
        if( a==1){
            return 1;
        }
        if( a==2){
            return 2;
        }
        if( a==3){
            return 3;
        }
        if( a==4){
            return 4;
        }
        else{
            return -1;
        }
        
    }
    public void handleMenuInput(int menuInput){
        if(menuInput>=1 && menuInput<=4){
        System.out.println("give first input ");
        double m = sc.nextDouble();
        System.out.println("give second input ");
        double n = sc.nextDouble();
//        System.out.println("give third input ");
//        double o = sc.nextDouble();
//        System.out.println("give fourth input ");
//        double p = sc.nextDouble();
    
    if(menuInput==1){
        System.out.println(calc.add(m, n));
    }
    else if(menuInput==2){
        System.out.println(calc.subtract(m, n));
    }
    else if(menuInput==3){
        System.out.println(calc.multiply(m, n));
    }
    else if(menuInput==1){
        System.out.println(calc.devide(m, n));
    }
        }
    else{
        System.out.println("Invalid");
    }

}
}