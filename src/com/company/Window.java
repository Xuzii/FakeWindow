package com.company;

import java.awt.*;
import java.util.Random;

public class Window implements Comparable{
    private int xPos;
    private int yPos;
    private int xSize;
    private int ySize;
    private Color color;

    public Window() {
        Random rand = new Random();
        color = new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
        xPos = rand.nextInt(900) + 50;
        yPos = rand.nextInt(900) + 50;
        xSize = rand.nextInt(80) + 40;
        ySize = rand.nextInt(80) + 40;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int getxSize() {
        return xSize;
    }

    public int getySize() {
        return ySize;
    }

    public Color getColor() {
        return color;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
