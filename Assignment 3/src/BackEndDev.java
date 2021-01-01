
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
public class BackEndDev extends DBA {

    private String working_since;
    private String project_name;
    private int team_members;
    private boolean Scrum_master;

    public BackEndDev(String name, int id, String email, String working_since, String project_name, int team_members,boolean scrum_master) {
        super(name, id, email, working_since, project_name, team_members);
        this.Scrum_master = Scrum_master;
    }

    public void printEmploymentYears(String working_since) {
        Scanner sc = new Scanner(System.in);
        System.out.println(working_since);
        int working_year, previous = 0, running = 0;
        working_year = running - previous;
        System.out.println("Emplyment Working years:" + working_year);

    }

    public void assignProject(String project_name, int team_members, String server_side_framework) {
        System.out.println("Server side framework: " + server_side_framework);
    }
public void AssignedProject() {
        System.out.println("project Assign:" + this.project_name);
    }
}
