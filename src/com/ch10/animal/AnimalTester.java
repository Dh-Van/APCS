package com.ch10.animal;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Animal("Carnivore", "Alien", "Kyle");
        System.out.println(animal.toString());

        Herbivore herbivore = new Herbivore("Krytonian", "Mihir");
        System.out.println(herbivore.toString());

        Elephant elephant = new Elephant("Patrick", 5);
        System.out.println(elephant.toString());

    }
}
