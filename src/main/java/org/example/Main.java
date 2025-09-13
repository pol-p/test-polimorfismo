package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void print(Shape[] v){
        System.out.println(Arrays.toString(v));
    }
    public static double sum(Shape[] v){
        double res = 0;
        for (Shape shape : v){
            res += shape.area();
        }
        return res;
    }
    public static void main(String[] args) {
        Shape[] v = new Shape[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Circle(5);
        v[2] = new Square(5);
        v[3] = new Circle(120);

        double res = sum(v);

        System.out.println("sum: " + res);

        print(v);

        sort(v);

        print(v);

    }
}