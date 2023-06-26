package com.fucongzheng.otherthing;

import java.util.function.Function;

// 自定义的Person类
class Persons {
    private String name;


    public Persons(String name) {
        this.name = name;

    }
    public Persons(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age="  +
                '}';
    }
}

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        // 使用构造器引用创建Person对象
        Function<String, Persons> personFactory = Persons::new;

        // 使用构造器引用创建多个Person对象
        Persons person1 = personFactory.apply("Alice");
        Persons person2 = personFactory.apply("Bob");

        // 打印创建的Person对象
        System.out.println(person1);
        System.out.println(person2);
    }
}
