package com.fucongzheng.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    //FileInputStream类是用于读取二进制数据的输入流
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Administrator\\Desktop\\username.txt"; // 指定要读取的文件路径

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                // 处理每个字节数据
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
