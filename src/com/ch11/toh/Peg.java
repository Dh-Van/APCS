package com.ch11.toh;

import java.util.Arrays;

public class Peg {
    private int pegNum;
    private int numDiscs;  // The total number of discs in the current game.
    private int[] discs;   // array of discs - bottom disc is in position 0
    // the discs are integers which represent their size
    private int count;     // the number of discs currently on the peg.

    public Peg(int peg, int num) {
        this.pegNum = peg;
        this.numDiscs = num;

        discs = new int[numDiscs];

        count = 0;
    }

    public int getPegNum() {
        return pegNum;
    }

    public String getDiscs(){
        return Arrays.toString(discs);
    }

    public String toString() {
        String s = "Peg " + pegNum;
        return s;
    }

    // Adds a disc of a given size to the curent peg
    public boolean addDisc(int size) {
        if(count == 0 || discs[count-1] > size){
            discs[count] = size;
            count++;
            return true;
        } else {
            System.out.println("Can't do that");
            return false;
        }
    }

    // Gets the top most disc from the peg and removes it
    public int popDisc() {
        int size = discs[count - 1];
        discs[count - 1] = 0;
        count--;
        return size;
    }

    public int getNumDiscs(){
        return count;
    }

    // Moves the top disc from the current peg to another peg
    public boolean moveTopDisc(Peg newPeg) {
        int disc = popDisc();
        if (newPeg.addDisc(disc)) {
            System.out.println("Moving disc " + disc + " from peg " + pegNum + " to peg " + newPeg.getPegNum());
            return true;
        }
        else {
            System.out.println("Bad Move");
            // Need to add the popped disc if the move wasn't legal 
            // this.addDisc(disc);
            return false;
        }
    }

    public static void main(String [] arg) {
        Peg p1 = new Peg(1,5);
        Peg p2 = new Peg(2,5);

        p1.addDisc(3);
        System.out.println(Arrays.toString(p1.discs));
        p1.addDisc(2);
        System.out.println(Arrays.toString(p1.discs));
        p1.addDisc(4);
        System.out.println(Arrays.toString(p1.discs));
        p1.popDisc();
        System.out.println(Arrays.toString(p1.discs));

        p1.moveTopDisc(p2);
        System.out.println(Arrays.toString(p2.discs));
    }




}

/**
 [3, 0, 0, 0, 0]
 [3, 2, 0, 0, 0]
 Can't do that
 [3, 2, 0, 0, 0]
 [3, 0, 0, 0, 0]
 **/