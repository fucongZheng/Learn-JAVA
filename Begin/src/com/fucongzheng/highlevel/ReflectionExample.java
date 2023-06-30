package com.fucongzheng.highlevel;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        // 获取类的信息
        Class<Person> personClass = Person.class;
        String className = personClass.getName();
        Package classPackage = personClass.getPackage();
        Class<?> superClass = personClass.getSuperclass();

        System.out.println("Class Name: " + className);
        System.out.println("Package: " + classPackage.getName());
        System.out.println("Superclass: " + superClass.getName());

        // 创建对象
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);
        Person person = constructor.newInstance("John Doe", 25);
        System.out.println("Person: " + person);

        // 调用方法
        Method method = personClass.getMethod("sayHello");
        method.invoke(person);

        // 访问和修改字段
        Field nameField = personClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(person, "Jane Smith");
        System.out.println("Updated Person: " + person);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
