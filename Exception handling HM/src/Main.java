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
        try {
            Patient p = new Patient("Anika", 19, "obesity");
            System.out.println(p);
        } catch (IllegalArgumentException | InvalidNameException ex) {
            System.out.println(ex.getMessage());

        }
        try {
            Patient patient1 = new Patient("Ta", 5, "Infection");
            System.out.println(patient1);
        } catch (IllegalArgumentException | InvalidNameException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Patient patient2 = new Patient("Raad", 6, "Cold");

            System.out.println(patient2);
        } catch (IllegalArgumentException | InvalidNameException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
