package com.fucongzheng.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableExample {
    public static void main(String[] args) {
        // 创建 Person 对象数组
        Person[] persons = {
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 20)
        };

        // 使用 Arrays.sort() 方法对 Person 对象数组进行排序,调用的是实现后的compareTo方法
        Arrays.sort(persons);

        // 打印排序后的结果
        for (Person person : persons) {
            System.out.println(person);
        }
        //使用comparator实现比较器

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o2.getAge() - o1.getAge() > 0) {
                    return 1;
                } else if (o2.getAge() - o1.getAge() < 0) {
                    return -1;
                }
                return 0;
            }
        });
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
