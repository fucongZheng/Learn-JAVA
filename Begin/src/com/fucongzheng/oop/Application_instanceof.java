package com.fucongzheng.oop;

public class Application_instanceof {
    public static void main(String[] args) {
        /*
        多态
            有继承关系
            子类重写父类方法
            父类引用指向子类对象
        多态 是方法的多态，属性是没有多态性

         */
        Student_instanceof si = new Student_instanceof();
        Person_instanceof pi =  new Student_instanceof();

        si.talk();
        pi.talk();

        //休息能执行哪些方法，主要看对象左边的类型，和右边关系不大
        si.study();
        ((Student_instanceof) pi).study();


        System.out.println("=============");
        System.out.println(si instanceof Student_instanceof);
        System.out.println(si instanceof Person_instanceof);
    }
}
