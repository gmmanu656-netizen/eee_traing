package com.basics.method;

public class Example3 {
    static double tsa_cube(int l) {
        return 6 * l * l;
    }
    static double tsa_cuboid(int l, int b,int h) {
        return 2 * (l * b + b * h + l * h);
    }
    static double tsa_cylinder(int r, int h) {
        return 2 * Math.PI * r * (r + h);
    }

    static void main() {
        System.out.println(tsa_cube(6) + "sq-units");
        System.out.println(tsa_cuboid(1,9,4)+"sq units");
        System.out.println(tsa_cylinder(7,10)+"sq units");
    }

    }

