package com.fucongzheng.frame;

import java.awt.*;

public class MyFrame extends Frame {
    /*
    封装frame类
     */
    static int count = 0;

    public MyFrame(int x, int y, int with, int high, Color colors) {
        super("my frame" + (++count));
        setBounds(x, y, with, high);
        setBackground(colors);
        setVisible(true);
    }
}
