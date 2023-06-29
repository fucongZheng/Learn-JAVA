package com.fucongzheng.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    /*
    数据流
    Java中的数据流（DataInputStream和DataOutputStream）提供了方便的方法来读写基本数据类型（如整数、浮点数和字符串等）。下面是一个简单的示例演示如何使用数据流：

使用DataOutputStream写入数据到文件：
     */
    public static void main(String[] args) {
        try {
            // 创建FileOutputStream对象，指定要写入的文件路径
            FileOutputStream fileOutputStream = new FileOutputStream("path/to/file.dat");

            // 创建DataOutputStream对象，将FileOutputStream作为参数传递
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            int number = 42;
            double value = 3.14;
            String text = "Hello, World!";

            // 使用数据流写入数据
            dataOutputStream.writeInt(number);
            dataOutputStream.writeDouble(value);
            dataOutputStream.writeUTF(text);

            dataOutputStream.close(); // 关闭数据输出流
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
