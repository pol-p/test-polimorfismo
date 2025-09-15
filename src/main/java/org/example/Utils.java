package org.example;

import java.util.Arrays;

public class Utils {

    public static double sum(Shape[] v){
        double res = 0;
        for (Shape shape : v){
            res += shape.area();
        }
        return res;
    }
    public static void print(Shape[] v){
        System.out.println(Arrays.toString(v));
    }
    public static void sort(Shape[] vector){
        Arrays.sort(vector);
    }
}
