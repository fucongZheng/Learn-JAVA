package com.fucongzheng.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collections02 {
    //在Java中，可以使用Lambda表达式与Collection接口一起使用，以提供更简洁和灵活的代码。Lambda表达式可以用于集合的遍历、过滤、映射等操作。
    public static void main(String[] args) {
        /*
        遍历集合：
        使用forEach()方法结合Lambda表达式对集合进行遍历。
         */
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        // 使用Lambda表达式遍历集合,方法引用
        list.forEach(System.out::println);

        /*
        过滤集合：
        使用stream()方法将集合转换为流，然后可以使用filter()方法结合Lambda表达式对集合进行过滤操作。
         */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // 使用Lambda表达式过滤集合
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n > 30)
                .collect(Collectors.toList());
        System.out.println(filteredNumbers);

        /*
        映射集合：
        使用stream()方法将集合转换为流，然后可以使用map()方法结合Lambda表达式对集合进行映射操作。
         */
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Amy");
        names.add("Mike");

        // 使用Lambda表达式对集合进行映射
        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());
        System.out.println(nameLengths);

        // 使用Lambda表达式进行元素匹配
        boolean anyGreaterThanTwenty = numbers.stream()
                .anyMatch(n -> n > 20);
        System.out.println(anyGreaterThanTwenty);
    }
}
