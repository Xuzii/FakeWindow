package com.company;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {
    public MyJPanel() {
        WindowManager windowManager = new WindowManager();
        //windowManager.display(g);
    }

    protected void paintCompenent(Graphics g){
        super.paintComponent(g);

    }

}
