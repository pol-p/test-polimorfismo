package org.example;

public class Circle extends Shape {
    private double r;

    public Circle(double ri){
        this.r = ri;
    }

    public double area(){
        return Math.PI * r * r;
    }
}
