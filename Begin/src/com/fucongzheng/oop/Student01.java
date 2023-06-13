package com.fucongzheng.oop;

public class Student01 {
    /*
    高内聚 低耦合
    高内聚 类的内部数据操作细节自己完成，不允许外部干涉；
    低耦合 仅暴露少量的方法给外部使用

    封装 数据的隐藏
    应该进制直接访问一个对象中数据的实际表示，而应该通过操作接口来访问

    属性私有  get set(做安全校验)  private
    快捷键 ALT +INSERT

    封装提高程序的安全性包含数据
    隐藏代码的实现细节
    统一接口
     */
    private String name;
    private int age;
    private String gender;

    public Student01() {
    }

    public Student01(String name, int age, String gender) {
        this.name = name;
        this.age = setAge(age);
        this.gender = gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("您给的年龄不符合实际！");
            return 0;
        }
        return age;
    }

    public void study() {
        System.out.println(this.name + "正在学习");
    }
}
