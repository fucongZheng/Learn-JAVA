package com.fucongzheng.oop;

public class Application_extend {
    /*
    继承
    extends 扩展
    类进行抽象

    Object类
    super
    方法重写
        方法重写只跟非静态方法有关
        重写的关键字只能public
        参数列表必须相同
        范围只能扩大不能缩小 public>protected>default>private
        抛出异常 范围可以被缩小 但不能扩大

    super
        super调用父类的构造方法必须写在第一行
        super必须只能出现在子类的方法或者构造方法中
        super和this 不能同时调用构造方法


    this  没有继承也可以使用
    本身调用者这个对象
    super 代表父类
     */
    public static void main(String[] args) {
        Student_extend se = new Student_extend();
        se.setName("儿子");
        se.talk();
        System.out.println("----");

        Person_extend pe = new Student_extend();
        pe.setName("父亲");
        pe.talk();
    }

}
