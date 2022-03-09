package com.ch10.animal;

public class Animal {
    private String diet;
    private String species;
    private String name;

    public Animal(String diet, String species, String name) {
        this.diet = diet;
        this.species = species;
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " the " + species + " is a " + diet;
    }


}
