package com.fucongzheng.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    //在上述示例中，我们创建了一个FileReader对象来读取指定路径下的文本文件。然后，我们使用read()方法逐个字符地读取文件内容，并将其打印到控制台上。最后，我们通过调用close()方法关闭FileReader以释放资源。
    public static void main(String[] args) {
        try {
            // 创建FileReader对象，指定要读取的文件路径
            FileReader reader = new FileReader("path/to/file.txt");

            int character; // 用于存储读取的字符

            // 循环读取文件中的字符直到达到文件末尾
            while ((character = reader.read()) != -1) {
                System.out.print((char) character); // 打印读取的字符
            }

            reader.close(); // 关闭文件读取器
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
