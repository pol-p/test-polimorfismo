package org.example;

public class Rectangle extends Shape{
    double x;
    private double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double area(){
        return x * y;
    }

}
