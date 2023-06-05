package com.fucongzheng.control;

import java.util.Scanner;

public class Scanner_demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        float f;
        System.out.println("请输入内容:");
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
            System.out.println("你输入的整数为："+a);
        } else {
            System.out.println("你输入的不是整数");
        }

        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("你输入的小数为："+f);
        } else {
            System.out.println("你输入的不是小数.");
        }
        scanner.close();
    }
}
