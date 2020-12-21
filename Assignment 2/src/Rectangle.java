
import java.awt.Shape;
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
public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    Rectangle() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double recPerimeter(double Rectangle) {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    public double recArea(double Rectangle) {
        double Area = (length * width);
        return Area;
    }

    public void drawRectagle() {
        double rows = 0;
        double col = 0;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= col; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
