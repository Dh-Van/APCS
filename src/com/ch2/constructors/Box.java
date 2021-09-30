package com.ch2.constructors;

public class Box {

    private double height, length, weight;
    private String color;
    private boolean hasLid;

    public Box(double h, double l, double w, String c, boolean lid) {
        height = h;
        length = l;
        weight = w;
        color = c;
        hasLid = lid;
    }

    public Box(double h, double l, double w) {
        height = h;
        length = l;
        weight = w;
        color = "white";
        hasLid = true;
    }

    public Box(){   // default constructor
        height = 1.0;
        weight = 1.0;
        length = 1.0;
        color = "white";
        hasLid = false;
    }

    public static void main(String[] args) {

    }


}
