package com.ch11.fractal;

import javax.swing.*;
import java.awt.*;

public class Triangle extends JPanel {

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

    public int [] midpoints(int [] x)
    {
        int [] m = new int [3];

        m[0] = (x[0] + x[1])/2;
        m[1] = (x[1] + x[2])/2;
        m[2] = (x[2] + x[0])/2;

        return m;
    }

    public void drawAndSplit(Graphics g, int [] x, int [] y, int times)
    {
        if(times == 0) return;
        if(times % 2 == 0) g.setColor(Color.WHITE);
        if(times % 2 != 0) g.setColor(Color.BLACK);
        g.fillPolygon(x, y, 3);
        drawAndSplit(g, midpoints(x), midpoints(y), times - 1);

    }


    public static void main(String[] args) {
        JFrame window = new JFrame("Fractals");
        window.setBounds(200, 200, 500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Triangle panel = new Triangle(15);
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}
