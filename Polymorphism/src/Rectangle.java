/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hridi
 */ 
public class Rectangle extends GeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    String color;
    Boolean filled;
    
    Rectangle(){
        side1=2.0;
        side2=2.0;
        color = "Red";
        filled = false;
    }
    
    Rectangle(double s1,double s2,String c,Boolean f){
        this.side1=s1;
        this.side2=s2;
        this.color=c;
        this.filled=f;
    }
    double getSide1(){
        return this.side1;
    }
    double getSide2(){
        return this.side2;
    }

    double getPerimeter(){
        return (2*(this.side1+this.side2));
    }
    double getArea(){
        double area = this.side1*this.side2;
        return area;
    }
    public String getColor()
    {
        return this.color;
    }
    public boolean getFilled(){
        return this.filled;
    }
    
    String ToString(){
        return String.format("side1 = %f , side2 = %f\n",side1,side2);
    }
    void displayObject(){
        System.out.println("Area of rectangle = "+getArea());
        System.out.println("Perimeter of rectangle = "+getPerimeter());
        System.out.println(ToString());
    }
}