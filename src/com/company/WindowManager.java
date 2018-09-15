package com.company;

import java.awt.*;
import java.util.ArrayList;

public class WindowManager {
    private ArrayList<Window> storeWindows;
    public final int WINDOW_COUNT = 11;

    public WindowManager() {
        for (int i = 0; i < WINDOW_COUNT; i++) {
            storeWindows.add(new Window());
        }
    }
    public void display(Graphics g){
        for(Window window : storeWindows){
            g.setColor(window.getColor());
            g.fillRect(window.getxPos(),window.getyPos(),window.getxSize(),window.getySize());
        }

    }
}
