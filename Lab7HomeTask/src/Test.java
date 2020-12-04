/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class Test {
   public static int gcd (int a, int b){
     if(a==0)
         return b;
     return gcd ( b%a,a);
   }
   public static void lowest (int deno3, int num3){
       int c_factor= gcd(num3,deno3);
       deno3 = deno3 / c_factor;
       num3 = num3 / c_factor;
       System.out.println(num3+"/"+deno3);
   }
   public static void addFraction(int num1, int deno1, int num2, int deno2){
       int deno3 =gcd (deno1,deno2);
       deno3 = (deno1*deno2)/deno3;
       int num3 = (num1)* (deno3/deno1)  +  (num2)* (deno3 / deno2);
       lowest (deno3, num3);
   }
    public static void main(String[] args) {
        int num1 =1 , deno1 = 4 , num2 = 3, deno2=5;
        System.out.println(num1+"/"+deno1+" + "+num2+"/"+deno2+" is equal to ");
        addFraction (num1, deno1, num2,deno2);
    }
}
