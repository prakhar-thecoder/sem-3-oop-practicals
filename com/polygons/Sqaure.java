package com.polygons;

public class Sqaure implements Polygon {
    float s;

    public Sqaure (float s) {
        this.s = s;
    }

    @Override
    public void calcArea() {
        System.out.println("Area of square: " + s*s);
    }

    @Override
    public void calcPeri() {
        System.out.println("Perimeter of square: " + 4*s);
    }
}
