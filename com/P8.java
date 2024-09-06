package com;

import com.polygons.*;;

public class P8 {
    public static void main(String[] args) {
        Sqaure s = new Sqaure(2);
        Rectangle r = new Rectangle(1, 2);

        s.calcArea();
        s.calcPeri();

        r.calcArea();
        r.calcPeri();
    }
}
