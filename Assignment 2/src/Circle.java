/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class Circle {
    private double redius;

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }

    public Circle(double redius) {
        this.redius = redius;
    }
    public double circCircumference (double Circle){
        return 2*3.1416*redius;
    }
    public double CircArea(double Circle ){
        return 3.1416*redius*redius;
    }
    public void drawCircle(){
        double n = 0 ;

        for (int i = (int) -n; i <= n; i++) {
            for (int j = (int) -n; j <= n; j++) {
                if (i*i + j*j <= n*n) System.out.print("* ");
                else                  System.out.print(". ");
            }
            System.out.println();
        }

    }
}
