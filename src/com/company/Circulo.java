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

    public double calculateArea(){
        this.area = Math.PI * getRadius() * getRadius();
        return this.area;
    }

    @Override
    public String toString() {
        return "Circulo: radius " + getRadius() + " color " + getColour();
    }
}
