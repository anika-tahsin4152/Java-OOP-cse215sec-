
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
public class FrontEndDev extends BackEndDev {
    private String working_since;
    private String project_name;
    private int team_members;
    private String team_leader;

     public FrontEndDev(String name, int id, String email, String working_since, String project_name, int team_members,
                        boolean scrum_master, String team_leader) {
                super(name, id, email, working_since, project_name, team_members, scrum_master);
                this.team_leader = team_leader;
        }
    public void printEmploymentYears(String working_since) {
        Scanner sc = new Scanner(System.in);
        System.out.println(working_since);
        int working_year, previous = 0, running = 0;
        working_year = running - previous;
        System.out.println("Emplyment Working years:" + working_year);

    }
    public void assignProject(String project_name, int team_members, String front_end_framework) {
        System.out.println("Server side framework: " + front_end_framework);
    }
public void AssignedProject() {
        System.out.println("project Assign:" + this.project_name);
    }
}
