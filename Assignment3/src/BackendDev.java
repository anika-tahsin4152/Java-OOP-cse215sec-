/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class BackendDev extends DBA {

    private String Working_since;
    private String Project_name;
    private int team_members;
    private boolean scrum_master;

    public BackendDev(String Working_since, String Project_name, int team_members, String name, int id, double salary) {
        super(Working_since, Project_name, team_members, name, id, salary);
        this.Working_since = Working_since;
        this.Project_name = Project_name;
        this.team_members = team_members;
        this.scrum_master = scrum_master;
    }
    public void printEmploymentYears(String working_since){
        
    } 
    public void assignProject(String Project_name, int team_members,String server_side_framework){
        
    }
    public void printAssignProject(){
        
    }

}
