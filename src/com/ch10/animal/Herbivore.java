package com.ch10.animal;

public class Herbivore extends Animal{
    private String species;
    private String name;

    public Herbivore(String species, String name) {
        super("Herbivore", species, name);
    }
}
