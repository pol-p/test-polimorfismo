package org.example;

public class Square extends Rectangle {


    public Square(double x) {
        super(x, x);
    }

    public double area(){
        return x * x;
    }

}
