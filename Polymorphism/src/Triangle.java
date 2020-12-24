/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hridi
 */
 
public class Triangle extends GeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    String color;
    Boolean filled;
    
    Triangle(){
        side1=2.0;
        side2=2.0;
        side3=3.0;
        color = "Red";
        filled = false;
    }
    
    Triangle(double s1,double s2,double s3,String c,Boolean f){
        this.side1=s1;
        this.side2=s2;
        this.side3=s3;
        this.color=c;
        this.filled=f;
    }
    double getSide1(){
        return this.side1;
    }
    double getSide2(){
        return this.side2;
    }
    double getSide3(){
        return this.side3;
    }
    
    double getPerimeter(){
        return (this.side1+this.side2+this.side3)/2;
    }
    double getArea(){
        double p = this.getPerimeter();
        System.out.println(ToString());
        double area = p*(p-this.side1)*(p-this.side2)*(p-this.side3);
        return Math.sqrt(area);
    }
    public String getColor(){
        return this.color;
    }
    public boolean getFilled(){
        return this.filled;
    }

    
    String ToString(){
        return String.format("side1 = %f , side2 = %f , side3= %f\n",side1,side2,side3);
    }
}

