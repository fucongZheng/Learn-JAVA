package com.fucongzheng.frame;

import java.awt.*;

public class FrameStudy {
    /*
    frame 基本用法
     */
    public static void main(String[] args) {
        Frame frame = new Frame();

        frame.setName("this is my first frame!");

        frame.setVisible(true);
        frame.setSize(400, 800);

        frame.setBackground(Color.red);


        frame.setLocation(200, 200);
        frame.setResizable(false);
    }
}
