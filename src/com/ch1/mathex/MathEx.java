package src.com.ch1.mathex;

public class MathEx {
    public static void main(String[] args) {
        MathEx mathEx = new MathEx();
        mathEx.timeLeft(1,15, 4, 36);
    }

    public static int digitSwapper(int number){
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int restOfNumber = number / 100;
        return (restOfNumber * 100) + (ones * 10) + tens;
    }

    public void timeLeft(int curHour, int curMin, int depHour, int depMin){
        int leftMin = ((depHour * 60) + depMin) - ((curHour * 60) + curMin);
        int leftHour = leftMin / 60;
        System.out.println(leftHour + " hours and " + leftMin % 60 + " minutes");
    }
}
