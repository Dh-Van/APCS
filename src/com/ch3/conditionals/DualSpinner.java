package com.ch3.conditionals;

public class DualSpinner {
    /**
     * Precondition: min < max
     */
    /*The spin method simulates a spin of a fair spinner.
     * The method returns a random integer between min and max,
     * inclusive. Complete the spin method below by assigning
     * this random integer to result.
     */

    int i = 0;

    public int spin(int min, int max) {
        int result = 0;
        result = (int) (Math.random()*(max-min))+min;
        return result;
    }

    /**
     * Simulates one round of the game as described in part (b).
     */
    public void playRound() {
        int player = spin(1,10);
        int computer = spin(1,10);

        if(player > computer){
            System.out.println("You Won! " + (player - computer) + " points");
        } else if(player < computer){
            System.out.println("You Lose! " + (player - computer) + " points");
        } else if (player == computer){
            if(i < 2){
                i++;
                playRound();
            } else {
                System.out.println("Tie. 0 points");
            }

        }
    }

    public static void main(String[] args) {
        DualSpinner ds = new DualSpinner();
        for (int i = 0; i < 10; i++) {
            ds.playRound();
        }
    }
}

/* Output
You Won! 1 points
You Won! 8 points
You Lose! -3 points
You Lose! -4 points
You Won! 2 points
You Lose! -5 points
You Lose! -4 points
You Won! 1 points
You Lose! -1 points
You Won! 1 points
 */