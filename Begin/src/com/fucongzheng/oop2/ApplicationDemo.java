package com.fucongzheng.oop2;

public class ApplicationDemo {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();  // 创建成员内部类的实例

        OuterClass.StaticInnerClass staticInnerObject = new OuterClass.StaticInnerClass();  // 创建静态内部类的实例

        outerObject.someMethod();  // 调用外部类方法内的方法

        innerObject.innerMethod();
        staticInnerObject.staticMethod();

    }
}
