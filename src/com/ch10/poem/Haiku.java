package com.ch10.poem;

public class Haiku extends Poem {

    public Haiku(){
        super(3);
    }

    public int getSyllables(int line){
        switch(line){
            case 2:
                return 7;
            case 1:
            case 3:
                return 5;
            default:
                return 0;
        }
    }

    @Override
    public void printRhythm(){
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= getSyllables(i); j++){
                sb.append("ta-");
            }
            sb.deleteCharAt(sb.lastIndexOf("-"));
            sb.append("\n");
        }
        System.out.printf(sb.toString());
    }
}
