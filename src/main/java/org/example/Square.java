package org.example;

public class Square extends Rectangle {
    private double x;

    public Square(double x) {
        this.x = x;
    }

    public double area() {
        return x * x;
    }
}
