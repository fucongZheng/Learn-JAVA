package com.fucongzheng.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExample {
    //类是Java中用于将字符流转换为字节流的桥梁类。它可以将字符写入输出流，并根据指定的字符编码将其编码为字节。下面是一个简单的示例演示如何使用OutputStreamWriter
    public static void main(String[] args) {
        try {
            // 创建FileOutputStream对象，指定要写入的文件路径
            FileOutputStream fileOutputStream = new FileOutputStream("path/to/file.txt");

            // 创建OutputStreamWriter对象，将FileOutputStream和字符编码作为参数传递
            OutputStreamWriter writer = new OutputStreamWriter(fileOutputStream, "UTF-8");

            String content = "Hello, World!";

            // 将内容写入文件
            writer.write(content);

            writer.close(); // 关闭写入器
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
