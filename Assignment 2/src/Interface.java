/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class Interface {

    public static void main(String[] args) {

        User us = new User();
        us.getEmail();
       
        Rectangle rec = new Rectangle(5, 10);
        Circle circ = new Circle(5.8);
        Triangle tri = new Triangle(5, 7);

//    rec.getLength();
//    rec.getWidth();
//    
        System.out.println(us);
        System.out.println(rec.getLength()+rec.getWidth());
        System.out.println(circ.CircArea(5.8)+ circ.circCircumference(4.6));
        System.out.println(tri.AreaTriangle()+tri.triPerimeter()+tri.getBase()+tri.getHeight());
    }
}
