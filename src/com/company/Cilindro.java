package com.company;
import java.math.*;
public class Cilindro extends Circulo{
    private double height;
    private double volumen;
    private double area;
    public Cilindro(){
        super();
        this.height = 1.0;
    }
    public Cilindro(double r, String c, double h){
        super(r, c);
        this.height = h;
    }

    public double getHeight() { return height; }

    public double calculateVolumen(){
        this.volumen = super.calculateArea() * height;
        return this.volumen;
    }

    @Override
    public double calculateArea() {
        this.area = (Math.PI * 2) * this.getRadius() * this.getHeight() + (2 * super.calculateArea());
        return this.area;
    }

    @Override
    public String toString() {
        return "Cilindro: subclase de " + super.toString() + " altura= " + this.getHeight();
    }
}
