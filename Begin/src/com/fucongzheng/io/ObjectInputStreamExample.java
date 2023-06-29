package com.fucongzheng.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) {
        //使用ObjectInputStream从文件中反序列化对象：
        try {
            // 创建FileInputStream对象，指定要读取的文件路径
            FileInputStream fileInputStream = new FileInputStream("path/to/file.dat");

            // 创建ObjectInputStream对象，将FileInputStream作为参数传递
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // 从文件中反序列化对象
            Person person = (Person) objectInputStream.readObject();

            // 打印反序列化得到的对象
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            objectInputStream.close(); // 关闭对象输入流
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
