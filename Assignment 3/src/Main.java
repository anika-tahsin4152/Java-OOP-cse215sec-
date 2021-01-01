/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class Main {
    public static void main(String[] args) {
        Employees emp = new Employees ("Anika", 1922152642, "anikahridi066@gmail.com");
        emp.printStatus();
        DBA d = new DBA("AIrah" , 1922152, "airaht@gmail.com" , "2010","Art", 100  );
   d.assignProject("Air Ticket", 350, "JAVA");
   d.printEmploymentYears("2010");
   d.AssignedProject();
   BackEndDev b = new BackEndDev("aisha",1922152,"ABc@gmail.com", "2012", "Train Ticket",200,true);
    b.assignProject("Train ticket", 200, "server_side_framework");
    b.printStatus();
    b.printEmploymentYears("2015");
    FrontEndDev f = new FrontEndDev("Sam",19236754, "sam@xyz.com", "2005", "AGL Corp", 100, false,"BOSS");
    f.assignProject("Adc", 400, "ab");
    f.printStatus();
    f.AssignedProject();
    f.printEmploymentYears("2012");
    }   
}
