package com.ch11.fractal;

import javax.swing.*;
import java.awt.*;

public class    Triangle extends JPanel {

    private final int levels;

    public Triangle(int levels){
        this.levels = levels;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call JPanel's paintComponent method
        //   to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;


        int [] xcoord = {xCenter - 128*1, xCenter, xCenter + 128*1};
        int [] ycoord = {yCenter, yCenter - 128*1, yCenter};

        g.setColor(Color.RED);
        drawAndSplit(g, xcoord, ycoord, levels);
    }

    public int [] midpoints(int [] x) {
        int[] midpoints = new int[3];

        midpoints[0] = (x[0] + x[1])/2;
        midpoints[1] = (x[1] + x[2])/2;
        midpoints[2] = (x[2] + x[0])/2;

        return midpoints;
    }

    public void drawAndSplit(Graphics g, int[] x, int[] y, int times)
    {
        if(times == 0) return;
        if(times == 1) {
            g.setColor(Color.BLACK);
            g.fillPolygon(x, y, 3);
            return;
        }

        if(times > 0){
            int[] midX = midpoints(x);
            int[] midY = midpoints(y);

            int[] leftX = {x[0], midX[0], midX[2]};
            int[] leftY = {y[0], midY[0], midY[2]};
            drawAndSplit(g, leftX, leftY, times - 1);

            int[] centerX = {midX[0], x[1], midX[1]};
            int[] centerY = {midY[0], y[1], midY[1]};
            drawAndSplit(g, centerX, centerY, times - 1);

            int[] rightX = {midX[2], midX[1], x[2]};
            int[] rightY = {midY[2], midY[1], y[2]};
            drawAndSplit(g, rightX, rightY, times - 1);
        }

    }


    public static void main(String[] args) {
        JFrame window = new JFrame("Fractals");
        window.setBounds(200, 200, 500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Triangle panel = new Triangle(4);
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}
