/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
public class Triangle extends GeometricObject {

    private double lengthOfSide1;
    private double lengthOfSide2;
    private double lengthOfSide3;

    Triangle() {
        super();
        this.lengthOfSide1 = 1.0;
        this.lengthOfSide2 = 1.0;
        this.lengthOfSide3 = 1.0;
    }

    public Triangle(double lengthOfSide1, double lengthOfSide2, double lengthOfSide3) {
        this.lengthOfSide1 = lengthOfSide1;
        this.lengthOfSide2 = lengthOfSide2;
        this.lengthOfSide3 = lengthOfSide3;
    }

    public double getLengthOfSide1() {
        return lengthOfSide1;
    }

    public double getLengthOfSide2() {
        return lengthOfSide2;
    }

    public double getLengthOfSide3() {
        return lengthOfSide3;
    }

    public double getArea() {
        double halfPerimeter = (this.lengthOfSide1 + this.lengthOfSide2 + this.lengthOfSide3) / 2;
        double area = halfPerimeter * (halfPerimeter - this.lengthOfSide1) * (halfPerimeter - this.lengthOfSide2) * (halfPerimeter - this.lengthOfSide3);
        return Math.sqrt(area);

    }

    public double getPerimeter() {
        return (lengthOfSide1 * lengthOfSide2 * lengthOfSide3);
    }

    @Override
    public String toString() {
        return "Triangle{" + "lengthOfSide1=" + lengthOfSide1 + ", lengthOfSide2=" + lengthOfSide2 + ", lengthOfSide3=" + lengthOfSide3 + '}';
    }

}
