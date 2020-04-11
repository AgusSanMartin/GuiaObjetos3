package com.company;

public class Main {

    public static void main(String[] args) {
	Cilindro cilindro1 = new Cilindro(2.3,"Blue",3);
	System.out.printf("\ncilindro1: Radius: %.2f, Height: %.2f, Base Area: %.2f, Volumen: %.2f\n",cilindro1.getRadius()
                                                                                                ,cilindro1.getHeight()
                                                                                                ,cilindro1.calculateArea()
                                                                                                ,cilindro1.calculateVolumen());

    System.out.println(cilindro1.toString());
    }
}
