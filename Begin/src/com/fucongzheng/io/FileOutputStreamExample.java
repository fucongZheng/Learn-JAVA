package com.fucongzheng.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String filePath = "path/to/file.txt"; // 指定要写入的文件路径

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            String data = "Hello, World!"; // 要写入文件的内容

            byte[] bytes = data.getBytes(); // 将字符串转换为字节数组
            fos.write(bytes); // 将字节数组写入文件
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
