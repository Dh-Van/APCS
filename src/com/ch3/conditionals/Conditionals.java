package com.ch3.conditionals;

public class Conditionals {

    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }

    public boolean negPos(int a, int b, boolean negative){
        if(negative && a * b < 0) {
            return a < 0 && b < 0;
        }
        return a < 0 || b < 0;
    }

    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if(isMorning && isMom){
            return true;
        }
        return !(isMorning || isAsleep);
    }


}
