/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class Employees {
    private String name ;
    private int id;
    private String email;
//   private  double salary;

    public Employees(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        
    }

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
   public boolean verifyEmail(String email){// verify email
        if(email.endsWith(".com") && email.contains("@")){
            return true;
        }
        else{
            return false;
        }
   }
    public void printStatus(){
                System.out.println(this.getName()+" "+this.getId()+" "+this.getName());
        }
    @Override
    public String toString() {
        return "Employees{" + "name=" + name + ", id=" + id + ", email=" + email + '}';
    }

   
    
    
}
