
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
public class S6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String st = sc.nextLine();
        int currVow=0;
        int preVow=0;
        for(int i =0;  i<st.length();i++){
            char ch = st.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch== 'u'){
                preVow = currVow ;
                currVow = i;
            }
        }System.out.println("Second Last occurname vowel is : "+preVow+ "the vowel is "+st.charAt(preVow));
                
                
    }
}
