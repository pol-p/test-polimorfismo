package org.example;

public class Main {

    public static void main(String[] args) {
        Shape[] v = new Shape[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Circle(5);
        v[2] = new Square(5);
        v[3] = new Circle(120);

        double res = Utils.sum(v);

        System.out.println("sum: " + res);

        Utils.print(v);

        Utils.sort(v);

        Utils.print(v);

    }
}