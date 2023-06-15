package com.fucongzheng.oop;

public interface MyInterface {
    //定义接口：使用 interface 关键字来声明一个接口
    // 方法签名，没有具体实现
    //方法规范：接口中的方法只有方法签名，没有具体的实现。这些方法默认为公共（public）和抽象（abstract），不需要显式地添加这些修饰符
    void method1();
    int method2(String str);
}
