package com.fucongzheng.oop2;

public class ApplicationDemo2 {
    public static void main(String[] args) {
        /*
        在Java中，您可以使用匿名内部类来定义一个没有显式名称的内部类。它通常用于实现一次性的辅助功能或重写接口/抽象类的方法
         */

        MyInterface myInterface = new MyInterface() {
            public void doSomething() {
                System.out.println("匿名类，实现接口");
            }
        };

        AbstractClass abstractClass = new AbstractClass() {
            public void someMethod() {
                System.out.println("匿名类实现抽象类");
            }
        };

        myInterface.doSomething();
        abstractClass.someMethod();
    }
}
