package com.fucongzheng.io;

import java.io.FileInputStream;
import java.io.IOException;
//ava.io.FileInputStream 读取多个字节时，可以使用 read(byte[] b) 方法。该方法将多个字节读取到指定的字节数组中
public class FileInputStreamReadBytesExample { public static void main(String[] args) {
    String filePath = "path/to/file.txt"; // 指定要读取的文件路径

    try (FileInputStream fis = new FileInputStream(filePath)) {
        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            // 处理读取到的字节数据
            for (int i = 0; i < bytesRead; i++) {
                System.out.print((char) buffer[i]);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
