package com.fucongzheng.oop2;

public class OuterClass {
    /*
    内部类可以访问外部类的成员（包括私有成员），并且可以直接使用外部类的引用。
内部类可以被声明为四种不同的类型：成员内部类、静态内部类、局部内部类和匿名内部类。
成员内部类是最常见的内部类类型，它与外部类的实例相关联，并且可以访问外部类的所有成员。
静态内部类是与外部类的实例无关的，类似于外部类的静态成员。它不能直接访问外部类的非静态成员，但可以访问外部类的静态成员。
局部内部类是在方法或作用域内部定义的类，仅在其定义的方法或作用域内可见。
匿名内部类是没有显式名称的内部类，通常用于定义一次性的辅助类。
     */
    // 成员内部类示例
    public class InnerClass {

        // ...
        public void innerMethod(){
            System.out.println("内部类型方法");
        }
    }

    // 静态内部类示例
    public static class StaticInnerClass {
        // ...
        public void staticMethod(){
            System.out.println("静态内部类方法");
        }
    }

    // 方法内部类示例
    public void someMethod() {
        class LocalInnerClass {
            // ...
            public void localInnerClassMethod(){
                System.out.println("1、在方法内部定义内部类。\n" +
                        "2、在方法内部实例化内部类，创建其对象。\n" +
                        "3、使用内部类的对象进行操作，因为内部类对外部类的成员具有访问权限。");
            }

        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.localInnerClassMethod();
    }
}
