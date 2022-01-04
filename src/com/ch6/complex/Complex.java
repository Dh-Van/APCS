package com.ch6.complex;

public class Complex {
    private double a;
    private double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex(double a) {
        this(a, 0.0);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(-3, 4);

        Complex c3 = new Complex(3, -4);
        Complex c4 = new Complex(3);

        Complex c5 = new Complex(0.0, 4);
        Complex c6 = new Complex(-3, -4);

        Complex c7 = new Complex(5, 4);
        Complex c8 = new Complex(-5, 4);

        Complex c9 = new Complex(5, -4);
        Complex c10 = new Complex(5);

        System.out.println(c1.add(c2));
        System.out.println(c3.add(c4) + "\n");

        System.out.println(c5.abs());
        System.out.println(c6.abs() + "\n");

        System.out.println(c7.multiply(c8));
        System.out.println(c9.multiply(c10) + "\n");


    }

    public double abs(){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public Complex add(Complex other){
        return new Complex((this.a + other.a), (this.b + other.b));
    }

    public Complex add(double a, double b){
        return new Complex((this.a + a), (this.b + b));
    }

    public Complex multiply(Complex other){
        // Subtraction inverses the sin of b * b since i^2 = -1
        double a = (this.a * other.a) - (this.b * other.b);
        double b = (this.a * other.b) + (this.b * other.a);
        return new Complex(a, b);
    }

    public Complex multiply(double a, double b){
        // Subtraction inverses the sin of b * b since i^2 = -1
        double r = (this.a * a) - (this.b * b);
        double i = (this.a * b) + (this.b * a);
        return new Complex(r, i);
    }

    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }
}

/* Output
0.0 + 8.0i
6.0 + -4.0i

4.0
5.0

-41.0 + 0.0i
25.0 + -20.0i
 */