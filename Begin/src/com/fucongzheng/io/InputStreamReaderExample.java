package com.fucongzheng.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExample {
    //类是Java中用于读取字节流并将其转换为字符流的桥梁类。它可以从输入流中读取字节，并根据指定的字符编码将其解码成字符。下面是一个简单的示例演示如何使用
    public static void main(String[] args) {
        try {
            // 创建FileInputStream对象，指定要读取的文件路径
            FileInputStream fileInputStream = new FileInputStream("path/to/file.txt");

            // 创建InputStreamReader对象，将FileInputStream和字符编码作为参数传递
            InputStreamReader reader = new InputStreamReader(fileInputStream, "UTF-8");

            int character; // 用于存储读取的字符

            // 循环读取文件中的字符直到达到文件末尾
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // 打印读取的字符
            }

            reader.close(); // 关闭读取器
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
