
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
public class User {
    private String name;
    private int id;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        
    }
    public boolean verifyEmail(String email){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter youe Email: ");
        sc.nextLine();
        String em = "anikahridi066@gmail.com" ;
        
        if(em.equals( email)){
            System.out.println("Your email is received correctly");
        }
        else{
            System.out.println("Your email is incorrect");
        }
        return false;
        
    }
}
