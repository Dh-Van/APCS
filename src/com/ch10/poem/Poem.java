package com.ch10.poem;

public class Poem {
    private int numLines;

    public Poem(){
        numLines = 0;
    }

    public Poem(int numLines){
        this.numLines = numLines;
    }

    public int getNumlines(){
        return numLines;
    }

    public void printRhythm(){
        System.out.println("Free Verse!");;
    }

    public void printCustomRhythm(int syl){
        for(int i = 1; i <= syl; i++){
            if(i == syl){
                System.out.println("ta");
            } else {
                System.out.printf("ta-");
            }
        }
    }
}
