package com.fucongzheng.oop;

import static java.lang.Math.random; //静态导入包

public class DemoStatic {
    private static String name; //静态变量
    private int age; //非静态变量

    static {
        //静态代码块  跟类一起加载
        //只执行一次
        System.out.println("匿名代码块");
    };

}
