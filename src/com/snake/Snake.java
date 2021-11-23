package com.snake;

import java.util.ArrayList;

public class Snake {

    Vector headPos;
    ArrayList<Vector> body;
    Vector[][] board;

    public Snake(Vector headPos){
        this.headPos = headPos;
        body = new ArrayList<>();
        board = new Vector[Constants.BOARDWIDTH][Constants.BOARDWIDTH];
        body.add(headPos);
    }

    public void addBody(int x, int y){
        body.add(new Vector(x, y));
    }

    public void addBody(Vector v){
        body.add(v);
    }

    public void drawBoard(){
        Vector coordinate = new Vector(0, 0);
        for(int i = 0, j = 0; i < Constants.BOARDHEIGHT; i++){
            for(j = 0; j < Constants.BOARDWIDTH; j++){
                for(Vector v : body){
                    if(v == headPos) {
                        System.out.print("Ω");
                        continue;
                    } else if(v == coordinate){
                        System.out.print("○"); //Alt+X + 03O9
                        continue;
                    }
                }
                System.out.print("*");
                coordinate.set(j, i);
            }
            coordinate.set(j, i);
            System.out.println();
        }
    }


}
