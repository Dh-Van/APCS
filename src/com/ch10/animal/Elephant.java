package com.ch10.animal;

public class Elephant extends Herbivore{
    private String name;
    private double tuskLength;

    public Elephant(String name, double tuskLength) {
        super( "Elephant", name);
        this.tuskLength = tuskLength;
    }

    @Override
    public String toString(){
        return super.toString() + " with tusks " + tuskLength + " meters long";
    }
}
