package com.ch2.dimensions;

public class Cylinder {

    private Circle base;
    private double height;

    public Cylinder(double radius, double height){
        this.base = new Circle(radius);
        this.height = height;
    }

    public double getVolume(){
        return base.getArea() * height;
    }

    public double getSurfaceArea(){
        return (height * base.getCircumference()) + (2 * base.getArea());
    }
}
