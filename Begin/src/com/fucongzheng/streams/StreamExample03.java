package com.fucongzheng.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int age;
    private String className;

    // 构造函数、Getter 和 Setter 方法省略

    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }
}
public class StreamExample03 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 18, "A"),
                new Student("Bob", 19, "B"),
                new Student("Charlie", 18, "A"),
                new Student("David", 19, "B")
        );

        // 按照班级对学生进行分组
        Map<String, List<Student>> groupedStudents = students.stream()
                .collect(Collectors.groupingBy(Student::getClassName));

        System.out.println(groupedStudents);
    }
}
