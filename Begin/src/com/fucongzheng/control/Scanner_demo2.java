package com.fucongzheng.control;

import java.util.Scanner;

public class Scanner_demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        hello world
        输入一行的内容为：hello world

        nextLine 能接收的内容是以空格输入的内容为结束符号
         */
        if (scanner.hasNextLine()){
            String nextLine = scanner.nextLine();
            System.out.println("输入一行的内容为："+nextLine);
        }
        scanner.close();
    }
}
