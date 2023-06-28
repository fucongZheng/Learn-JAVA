package com.fucongzheng.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {
        /*
        java.util.LinkedHashSet 是 Java 集合框架中的一个实现了 Set 接口的有序集合，它通过链表和哈希表相结合的方式来存储和访问集合中的元素。下面是 LinkedHashSet 类的一些常见方法及其代码详细介绍：

         */
        //添加元素：
        //boolean add(E element): 将指定元素添加到集合中。
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("apple");  // {"apple"}
        set.add("banana");  // {"apple", "banana"}

        //删除元素：
        //boolean remove(Object element): 从集合中移除指定元素。
        boolean removed = set.remove("banana");  // {"apple"}, removed = true

        //判断元素是否存在：
        //boolean contains(Object element): 判断集合是否包含指定的元素。
        boolean contains = set.contains("banana");  // true

        //获取集合大小和判断是否为空：
        //int size(): 返回集合中的元素数量。
        //boolean isEmpty(): 判断集合是否为空。
        int size = set.size();  // 2
        boolean empty = set.isEmpty();  // false



        //遍历方式
        //使用迭代器（Iterator）遍历：
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            // 对当前元素进行操作
            System.out.println(element);
        }
        //使用增强型 for 循环遍历：
        for (String element : set) {
            // 对当前元素进行操作
            System.out.println(element);
        }
        //使用流（Stream）遍历（Java 8+）：
        set.stream().forEach(element -> {
            // 对当前元素进行操作
            System.out.println(element);
        });

        //清空集合：
        //void clear(): 清空集合中的所有元素。
        set.clear();  // {}
    }
}
