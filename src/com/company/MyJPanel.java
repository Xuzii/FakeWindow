package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJPanel extends JPanel implements MouseListener{

    public static WindowManager windowManager;

    public MyJPanel() {
        windowManager = new WindowManager();
        addMouseListener(this);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        windowManager.display(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        windowManager.bringToFront(e.getX(),e.getY());
        System.out.println(e.getX() + " | " + e.getY());
        paintComponent(this.getGraphics());

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
