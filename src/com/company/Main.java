package com.company;

import javax.swing.*;

public class Main {
    public static JFrame frame;
    public static int WINDOW_SIZE = 1000;

    public static void main(String[] args) {
        setupJFrame();
    }
    public static void setupJFrame(){
        frame = new JFrame("Windows 10 but Better");
        frame.setSize(WINDOW_SIZE,WINDOW_SIZE);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyJPanel panel = new MyJPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}
