package com.fucongzheng.oop;

public class Person_instanceof {
    private String name;
    private String gender;
    private int age;
    public Person_instanceof(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void talk(){
        System.out.println("父类说话");
    }


}
