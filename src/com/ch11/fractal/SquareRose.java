package com.ch11.fractal;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *  Square Rose, a recursive algorithm
 */

public class SquareRose extends JPanel
{
    private int levels;
    public SquareRose(int lev)
    {
        levels = lev;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);  // Call JPanel's paintComponent method
        //   to paint the background
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;


        int [] xcoord = {xCenter - 128, xCenter-128, xCenter + 128, xCenter + 128};
        int [] ycoord = {yCenter-128, yCenter + 128, yCenter + 128, yCenter - 128};

        g.setColor(Color.RED);
        drawAndSplit(g, xcoord, ycoord, levels);

    }

    public int [] midpoints(int [] x)
    {
        int [] m = new int [4];

        m[0] = (x[0] + x[1])/2;
        m[1] = (x[1] + x[2])/2;
        m[2] = (x[2] + x[3])/2;
        m[3] = (x[3] + x[0])/2;

        return m;
    }

    public void drawAndSplit(Graphics g, int [] x, int [] y, int times)
    {
        if(times == 0) return;
        g.drawPolygon(x, y, 4);
        drawAndSplit(g, midpoints(x), midpoints(y), times - 1);

    }
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Fractals");
        window.setBounds(200, 200, 500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SquareRose panel = new SquareRose(5);
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}

