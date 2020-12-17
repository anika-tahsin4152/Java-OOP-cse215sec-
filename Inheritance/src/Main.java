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
        Circle circ = new Circle("blue", false, 5.23);
        System.out.println(circ.getArea());
        System.out.println(circ.getPeremeter());
        System.out.println(circ.toString());

        circ.getColor();
        System.out.println(circ.getColor());
        
        Triangle tr = new Triangle(2, 5, 7.7);
        System.out.println(tr.getArea());
        System.out.println(tr.toString());
        System.out.println(tr.getPerimeter());

        GeometricObject geo = new GeometricObject();
//        geo.getColor();
//        geo.getDateCreated();
//        geo.getFilled();
        System.out.println(geo.getColor() + geo.getDateCreated() + geo.getFilled());
        System.out.println(geo.toString());

    }
}
