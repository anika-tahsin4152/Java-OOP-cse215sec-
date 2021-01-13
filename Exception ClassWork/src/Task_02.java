
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

public class Task_02 {
    Scanner input = new Scanner(System.in);
    
    int age = input.nextInt();
    public void checkAge(){
        if(age < 18){
            throw new ArithmeticException();
        }
        else
        {
            System.out.println(" You are eligible to vote. ");
        }
    }
    
    public static void main(String[] args) {
        
        Task_02 obj = new Task_02();
        try{
            obj.checkAge();
        }catch(Exception e){
            System.out.println(e+ "The minimum voting age 18");
        }
    }
    
}


