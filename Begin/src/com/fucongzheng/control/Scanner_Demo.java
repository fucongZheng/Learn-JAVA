package com.fucongzheng.control;

import java.util.Scanner;

public class Scanner_Demo {
    public static void main(String[] args) {
        /*
        Scanner 对象 获取用户键盘输入的内容
        基本语法
        Scanner in  =new Scanner(System.in);
        有方法 next()  nextLine() 方法获取输入的字符串
        hasNext()  hasNextLine() 判断是否有输入

        使用next方法接收   ,next接收的内容 不能有空格，next会去掉空格的内容
        hello world
        输入的内容为：hello
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方法接收");
        if (scanner.hasNext()) {
            String next = scanner.next();
            System.out.println("输入的内容为："+next);
        }
        //凡是使用IO流都要关闭，如果不关闭就会占用内存

        scanner.close();
    }
}
