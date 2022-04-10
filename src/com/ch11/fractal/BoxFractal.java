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
        draw(g, x, y, 486, 496, levels);
    }

    private void draw(Graphics g, int x, int y, int h, int w, int times){

        if(levels == 0) return;
        if(levels == 1) g.fillRect(x, y, w, h);

        draw(g, x, y, h/3, w/3, --times);
        draw(g, x + w/3, y + h/3, h/3, w/3, --times);
        draw(g, x + 2 * w/3, y + h/3, h/3, w/3, --times);
        draw(g, x + 2 * w/3, y + 2 * h/3, h/3, w/3, --times);

    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Fractals");
        window.setBounds(200, 200, 500, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BoxFractal panel = new BoxFractal(3);
        panel.setBackground(Color.WHITE);
        Container c = window.getContentPane();
        c.add(panel);
        window.setVisible(true);
    }
}
