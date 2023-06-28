package com.fucongzheng.collection;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        /*
        java.util.Set 接口是 Java 集合框架中的一个接口，它继承自 Collection 接口，并定义了一组不允许包含重复元素的集合操作方法。下面是 Set 接口的一些常见方法及其代码详细介绍：
        add addAll remove  contains size isEmpty clear
         */
        //添加元素：
        //boolean add(E element): 将指定元素添加到集合中。
        //boolean addAll(Collection<? extends E> collection): 将指定集合中的所有元素添加到集合中。
        Set<String> set = new HashSet<>();
        set.add("apple");  // {"apple"}
        set.add("banana");  // {"apple", "banana"}

        Set<String> fruits = new HashSet<>();
        fruits.add("orange");
        fruits.add("kiwi");
        set.addAll(fruits);  // {"apple", "banana", "orange", "kiwi"}

        //删除元素：
        //boolean remove(Object element): 从集合中移除指定元素。
        //boolean removeAll(Collection<?> collection): 从集合中移除指定集合中的所有元素。
        boolean removed = set.remove("banana");  // {"apple"}, removed = true

        boolean allRemoved = set.removeAll(fruits);  // {"apple"}, allRemoved = false

        //判断元素是否存在：
        //boolean contains(Object element): 判断集合是否包含指定的元素。
        //boolean containsAll(Collection<?> collection): 判断集合是否包含指定集合中的所有元素。
        boolean contains = set.contains("banana");  // true
        boolean allContains = set.containsAll(fruits);  // false

        //获取集合大小和判断是否为空：
        //int size(): 返回集合中的元素数量。
        //boolean isEmpty(): 判断集合是否为空。

        int size = set.size();  // 2
        boolean empty = set.isEmpty();  // false

        //清空集合：
        //void clear(): 清空集合中的所有元素。
        set.clear();  // {}



    }
}
