package com.company;
import java.math.*;
public class Circulo {
    private double radius;
    private String colour;
    private double area;

    public Circulo(){
        this.radius = 1.0;
        this.colour = "red";
    }
    public  Circulo(double r,String c){
        this.radius = r;
        this.colour = c;
    }

    public double getRadius() { return radius; }

    public String getColour() { return colour; }

    public void calculateArea(){
        this.area = Math.PI * getRadius() * getRadius();
        System.out.printf("\nThe area is: %.2f", this.area);
    }
}
