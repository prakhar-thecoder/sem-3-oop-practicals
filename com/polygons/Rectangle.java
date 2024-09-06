package com.polygons;

public class Rectangle implements Polygon {
    float h, w;

    public Rectangle (float h, float w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public void calcArea() {
        System.out.println("Area of rectangle: " + h*w);
    }

    @Override
    public void calcPeri() {
        System.out.println("Perimeter of reactangle: " + 2 * (h 
        + w));
    }
}
