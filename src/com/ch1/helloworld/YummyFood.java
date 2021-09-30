package com.ch1.helloworld;

public class YummyFood {

    public static void main(String[] args) {
        System.out.print("YUMMY YUMMY ");
        System.out.println("HI HI HI HI");
        chocolate();
        iceCream();
    }

    public static void chocolate(){
        System.out.println("Chocolate");
    }

    public static void iceCream(){
        System.out.println("Vanilla");
        chocolate();
        System.out.println("That was yummy");
    }
}
