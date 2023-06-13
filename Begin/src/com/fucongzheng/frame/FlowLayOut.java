package com.fucongzheng.frame;

import java.awt.*;

public class FlowLayOut {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //流式布局 左右 居中
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setLayout(new BorderLayout());//东西南北中
        frame.setLayout(new GridBagLayout());//表格式布局

        frame.setName("this is my first frame!");

        frame.setVisible(true);
        frame.setSize(400, 800);

        frame.setBackground(Color.red);


        frame.setLocation(200, 200);
        frame.setResizable(false);
    }
}
