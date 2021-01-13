/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class Task_04 extends Exception{
    
    double radius;
    
    public Task_04(){
    super();
    }
    public Task_04(String message){
    super(message);
    }
    public void setRadius(double radius) throws Task_04 {
    if(radius<0){
        throw new Task_04("Invalid radius");
    }
        this.radius = radius;
        System.out.println(" The radius has been set to " +radius);
    }
    
    public static void main(String[] args) throws Task_04{
    Task_04 c = new Task_04();
    try{
        c.setRadius(10);
    }catch(Task_04 e){
        System.out.println(e.getMessage());
    }
    }
}

