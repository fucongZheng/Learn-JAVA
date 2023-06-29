package com.fucongzheng.io;

import java.io.PrintStream;

public class PrintStreamExample {
    //Java中的打印流（PrintStream和PrintWriter）提供了方便的方法用于输出文本数据到控制台或文件。下面是一个简单的示例演示如何使用打印流：
    //
    //使用PrintStream打印到控制台：
    public static void main(String[] args) {
        PrintStream printStream = System.out;

        int number = 42;
        String text = "Hello, World!";

        // 使用打印流输出整数和字符串
        printStream.println(number);
        printStream.println(text);

        printStream.close(); // 不是必需，System.out不需要关闭
    }
}
