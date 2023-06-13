package com.fucongzheng.oop;

public class Person_extend {
    private String name;
    private int age;
    private String gender;

    public  Person_extend(){
        System.out.println("父类无参");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void talk(){
        System.out.println(this.name+"正在讲话！");
    }
}
