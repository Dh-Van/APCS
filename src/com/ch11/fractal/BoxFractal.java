package com.ch11.fractal;

import javax.swing.*;
import java.awt.*;

public class BoxFractal extends JPanel{

    private final int levels;

    public BoxFractal(int levels){
        this.levels = levels;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call JPanel's paintComponent method
        //   to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;

        int x = xCenter - 243;
        int y = yCenter - 243;

        g.setColor(Color.RED);
        draw(g, xcoord, ycoord, levels);
    }

    public int[] getXPoints(int[] x, int size){
        x[0] = 0;
        x[1] = size - (size / 3);
        x[2] = size - (2 * size / 3);
        x[3] = 0;
        x[4] = size - (size / 3);

        return x;
    }

    public int[] getYPoints(int[] y, int size){
        y[0] = 0;
        y[1] = 0;
        y[2] = size - (2 * size / 3);
        y[3] = size - (size / 3);
        y[4] = size - (size / 3);

        return y;
    }

    private void draw(Graphics g, int[] x, int[] y, int levels){

        if(levels == 0) return;
        double size = 486 * Math.pow(3, -levels + 1);

        for(int i = 0; i < 5; i++){
            g.fillRect(x[i], y[i], (int) size, (int) size);
        }

        draw(g, getXPoints(x, (int) size), getYPoints((int) y, size));



    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Fractals");
        window.setBounds(200, 200, 486, 486);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoxFractal panel = new BoxFractal(2);
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}
