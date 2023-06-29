package com.fucongzheng.io;

import java.io.*;

class Person{
    private String Name;
    private int Age;

    public Person(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
public class ObjectOutputStreamExample {
    //使用ObjectOutputStream将对象序列化到文件：
    public static void main(String[] args) {
        try {
            // 创建FileOutputStream对象，指定要写入的文件路径
            FileOutputStream fileOutputStream = new FileOutputStream("path/to/file.dat");

            // 创建ObjectOutputStream对象，将FileOutputStream作为参数传递
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // 创建要序列化的对象
            Person person = new Person("John Doe", 30);

            // 使用对象输出流将对象序列化到文件
            objectOutputStream.writeObject(person);

            objectOutputStream.close(); // 关闭对象输出流
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
