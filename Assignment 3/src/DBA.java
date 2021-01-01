
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
public class DBA extends Employees {

    private String working_since;
    private String project_name;
    private int team_members;

//    public DBA(String name, int id, double salary, String working_since) {
//        super(name, id, salary);
//        this.working_since= working_since;
//    }
//      public DBA(String name, int id, String email, String working_since, String project_name, int team_members) {
//                super(name, id, email);
//                this.working_since = working_since;
//                this.project_name = project_name;
//                this.team_members = team_members;
    //    }
    
    public DBA(String name, int id, String email, String working_since, String project_name, int team_members) {
                super(name, id, email);
                this.working_since = working_since;
                this.project_name = project_name;
                this.team_members = team_members;
        }


    public void printEmploymentYears(String working_since) {
        Scanner sc = new Scanner(System.in);
        int working_year, previous = 0, running = 0;
        working_year = running - previous;
        System.out.println("Emplyment Working years:" + working_year);
    }

    public void assignProject(String project_name, int team_members, String query_language) {
        System.out.println("Query language: " + query_language);
    }

    public void AssignedProject() {
        System.out.println("project Assign:" + this.project_name);
    }
}
