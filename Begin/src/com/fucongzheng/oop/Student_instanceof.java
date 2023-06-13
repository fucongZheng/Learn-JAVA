package com.fucongzheng.oop;

public class Student_instanceof extends Person_instanceof{
    public Student_instanceof() {
    }

    @Override
    public void talk() {
        System.out.println("子类说话");
    }

    public void study(){
        System.out.println("子类学习");
    }
}
