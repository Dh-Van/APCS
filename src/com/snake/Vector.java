package com.snake;

public class Vector {

    double x, y;

    public Vector(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Vector(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
