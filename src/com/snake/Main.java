package com.snake;

public class Main {

    public static void main(String[] args) {
        Snake snake = new Snake(new Vector(15, 15));
        int incrementer = 0;
        while(Constants.isOn){
            if(incrementer > Constants.CLOCK){
                snake.drawBoard();
                incrementer = 0;
            }
            incrementer++;
        }
        snake.drawBoard();
    }
}
