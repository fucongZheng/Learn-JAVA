package com.fucongzheng.otherthing;

import java.util.ArrayList;
import java.util.List;

public class MyLambda {
    public static void main(String[] args) {
        /*
        需要注意的是，Lambda表达式是一种简洁的写法，用于表示匿名函数。
        它可以作为参数传递给函数或方法，并在需要函数式接口（只有一个抽象方法的接口）的地方使用。Lambda表达式提供了一种更简洁、可读性更强的方式来编写功能代码。
         */
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // 使用Lambda表达式遍历集合并输出每个元素
        names.forEach(name -> System.out.println(name));

        // 使用Lambda表达式过滤集合中的元素
        List<String> filteredNames = new ArrayList<>();
        names.forEach(name -> {
            if (name.startsWith("A")) {
                filteredNames.add(name);
            }
        });

        // 使用Lambda表达式对集合进行转换
        List<String> uppercaseNames = new ArrayList<>();
        filteredNames.forEach(name -> uppercaseNames.add(name.toUpperCase()));

        // 使用Lambda表达式排序集合
        uppercaseNames.sort((name1, name2) -> name1.compareTo(name2));

        // 使用方法引用替代Lambda表达式
        uppercaseNames.forEach(System.out::println);
    }
}
