package com.fucongzheng.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamExample {
    /*
    数据流
    在上述示例中，我们使用DataOutputStream将整数、浮点数和字符串写入到文件中。然后，我们使用DataInputStream从文件中读取这些数据。

需要注意的是，数据流按照二进制格式来读写数据，因此写入和读取的顺序必须一致。在读取数据时，需要按照写入的顺序进行读取，以确保正确解析数据。

使用数据流可以方便地读写基本数据类型，并且数据流提供了对应的方法用于读写不同类型的数据。在实际应用中，您可以根据具体需求选择适合的数据流来处理数据的读写操作
     */
    public static void main(String[] args) {
        try {
            // 创建FileInputStream对象，指定要读取的文件路径
            FileInputStream fileInputStream = new FileInputStream("path/to/file.dat");

            // 创建DataInputStream对象，将FileInputStream作为参数传递
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            // 从数据流中读取数据
            int number = dataInputStream.readInt();
            double value = dataInputStream.readDouble();
            String text = dataInputStream.readUTF();

            // 打印读取的数据
            System.out.println("Number: " + number);
            System.out.println("Value: " + value);
            System.out.println("Text: " + text);

            dataInputStream.close(); // 关闭数据输入流
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
