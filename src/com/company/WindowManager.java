package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class WindowManager {
    private ArrayList<Window> storeWindows = new ArrayList<>();
    public final int WINDOW_COUNT = 11;

    public WindowManager() {
        for (int i = 0; i < WINDOW_COUNT; i++) {
            storeWindows.add(new Window());
        }
    }
    public void display(Graphics g){
        for (int i = WINDOW_COUNT - 1; i >= 0 ; i--) {
            g.setColor(storeWindows.get(i).getColor());
            g.fillRect(storeWindows.get(i).getxPos(),storeWindows.get(i).getyPos(),storeWindows.get(i).getxSize(),storeWindows.get(i).getySize());
        }
    }
    public void bringToFront(int xClick, int yClick){
        for(int i = 0; i < WINDOW_COUNT; i++){
            if((xClick > storeWindows.get(i).getxPos() && xClick < storeWindows.get(i).getxPos() + storeWindows.get(i).getxSize()) &&
                    (yClick > storeWindows.get(i).getyPos() && yClick < storeWindows.get(i).getyPos() + storeWindows.get(i).getySize())){
                Window inefficientWindow = storeWindows.get(i);
                storeWindows.remove(storeWindows.get(i));
                storeWindows.add(0,inefficientWindow);
                System.out.println("MOVE");
            }
        }

    }
}
