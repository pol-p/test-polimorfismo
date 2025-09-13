package org.example;

public abstract class Shape implements Comparable<Shape>{

    public abstract double area();

    public int compareTo(Shape s) {
        return Double.compare(this.area(), s.area());
    }
}
