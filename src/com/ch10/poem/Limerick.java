package com.ch10.poem;

public class Limerick extends Poem {

    public Limerick(){
        super(5);
    }

    public int getSyllables(int line){
        switch(line){
            case 1:
            case 2:
            case 5:
                return 9;
            case 3:
            case 4:
                return 6;
            default:
                return 0;
        }
    }

    public void printRhythm(){
        for(int i = 1; i <= getNumlines(); i++){
            printCustomRhythm(getSyllables(i));
        }
    }
}