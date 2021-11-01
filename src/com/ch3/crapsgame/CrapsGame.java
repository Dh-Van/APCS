package com.ch3.crapsgame;// Implements the game of Craps logic

public class CrapsGame
{
  private int point = 0;

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(int total) {
    int result = 0;

    if (point == 0 && total == 11) {
      point = 0;
      result = 1;
    } else if (point == 0 && (total == 2 || total == 3 || total == 12)) {
      point = 0;
      result = -1;
    } else if (point == 0){
      point = total;
    } else if (total == 7){
      point = 0;
      result = -1; //
    }
    else if(point == total){
      point = 0;
      return 1;
    }
    return result;
  }

  /**
   *  Returns the saved point
   */
  public int getPoint()
  {
    return point;
  }
}

