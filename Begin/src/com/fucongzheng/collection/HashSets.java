package com.fucongzheng.collection;

import java.util.HashSet;

public class HashSets {
    /*
    java.util.HashSet 是 Java 集合框架中的一个实现了 Set 接口的哈希表数据结构。它使用哈希算法来存储和访问集合中的元素，具有高效的插入、删除和查找操作。下面是 HashSet 类的一些常见方法及其代码详细介绍：
     */
    public static void main(String[] args) {
        //添加元素：
        //boolean add(E element): 将指定元素添加到集合中。
        HashSet<String> set = new HashSet<>();
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

        //清空集合：
        //void clear(): 清空集合中的所有元素。
        set.clear();  // {}
    }
}
