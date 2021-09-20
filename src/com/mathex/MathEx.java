package com.mathex;

public class MathEx {
    public static void main(String[] args) {
        MathEx mathEx = new MathEx();
        System.out.println(mathEx.swap(132));
    }

    public int swap(int number){
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int restOfNumber = number / 100;
        return (restOfNumber * 100) + (ones * 10) + tens;
    }

    public int timeSwap(int curHour, int curMin, int depHour, int depMin){

    }
}
