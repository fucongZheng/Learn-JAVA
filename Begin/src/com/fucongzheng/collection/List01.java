package com.fucongzheng.collection;

import java.util.ArrayList;
import java.util.List;

public class List01 {
    /*
    java.util.List 接口是 Java 集合框架中的一个接口，它继承自 Collection 接口，并定义了一组操作有序元素列表的方法。下面是 List 接口的一些常见方法及其代码详细介绍
    包含add set indexOf remove get sublist 方法
    遍历方式 有for  foreach  迭代器  lambda
     */
    public static void main(String[] args) {
        //添加元素：
        //boolean add(E element): 将指定元素添加到列表的末尾。
        //void add(int index, E element): 在指定位置插入指定元素。

        List<String> list = new ArrayList<>();
        list.add("apple");  // ["apple"]
        list.add(0, "banana");  // ["banana", "apple"]

        //获取元素：
        //E get(int index): 返回列表中指定位置的元素。
        String element = list.get(1);  // "banana"

        //修改元素：
        //E set(int index, E element): 替换列表中指定位置的元素，并返回被替换的元素。
        String replacedElement = list.set(1, "orange");  // ["apple", "orange"], replacedElement = "banana"

        //删除元素：
        //E remove(int index): 移除并返回列表中指定位置的元素。
        String removedElement = list.remove(0);  // ["banana"], removedElement = "apple"

        //查找元素：
        //int indexOf(Object element): 返回列表中首次出现指定元素的索引。
        //int lastIndexOf(Object element): 返回列表中最后一次出现指定元素的索引。
        int firstIndex = list.indexOf("apple");  // 0
        int lastIndex = list.lastIndexOf("apple");  // 2

        //子列表操作：
        //List<E> subList(int fromIndex, int toIndex): 返回列表中指定范围的子列表。
        List<String> subList = list.subList(1, 3);  // ["banana", "orange"]

    }
}
