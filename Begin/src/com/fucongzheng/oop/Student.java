package com.fucongzheng.oop;

public class Student {
    /*
    1、造器，实例化对象本质就是调用构造器
    2、定义有参构造、就必须定义无参构造
     */
    //属性
    String name;
    int age;

    //无参构造
    public Student() {
    }

    public Student(String name, int age) {
        //带参构造方法
        this.name = name;
        this.age = age;
    }

    //方法
    public void study() {
        System.out.println(this.name + "正在学习");
    }
}

