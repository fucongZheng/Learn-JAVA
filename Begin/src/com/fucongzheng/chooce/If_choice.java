package com.fucongzheng.chooce;

import java.util.Scanner;

public class If_choice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入内容：");
        String s = scanner.nextLine();

        if (s.equals("hello")) {
            System.out.println("输入正确");
        } else if(s.equals("world")) {
            System.out.println("输入正确");
        }
        else {
            System.out.println("您输入的是" + s);
        }
        scanner.close();
    }
}
