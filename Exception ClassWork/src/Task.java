
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

public class Task {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            int a = input.nextInt();
            int b = input.nextInt();
            int div = a/b;
            System.out.println(div);
        }catch(Exception e){
            System.out.println("The denom is zero ");
        }
    }
}




