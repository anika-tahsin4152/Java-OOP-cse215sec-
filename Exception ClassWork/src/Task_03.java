
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class Task_03 {
    
    public void msg1() throws IOException{
        throw new IOException("input file corrupted");
    }
    
    public void msg2() throws IOException{
        msg1();
    }
    
    void call(){
        try{
            msg2();
        }catch(Exception e){
            System.out.println(e.getMessage()+" io exception caught ");
        }
        finally{
            System.out.println(" I have tested throw vs throws functions");
        }
    }
    
    public static void main(String[] args) {
        
        Task_03 obj = new Task_03();
        
        obj.call();
    }
}
