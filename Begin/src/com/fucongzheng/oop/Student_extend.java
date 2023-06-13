package com.fucongzheng.oop;

public class Student_extend extends Person_extend{
    public Student_extend() {
        super();//子类调用父类构造必须写在第一行
        System.out.println("子类无参");

    }

    @Override
    public void talk() {
        System.out.println("自己说话");
    }
}
