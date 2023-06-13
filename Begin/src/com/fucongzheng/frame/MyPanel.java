package com.fucongzheng.frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyPanel {
    /*
    面板
     */
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();

        frame.setLayout(null);

        frame.setBounds(200, 200, 800, 800);
        frame.setBackground(Color.red);
        panel.setBounds(200, 200, 800, 800);
        panel.setBackground(Color.red);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
