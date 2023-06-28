package com.fucongzheng.collection;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        /*
        ava.util.LinkedList 是 Java 集合框架中的一个实现了 List 接口的双向链表数据结构。它提供了对链表的操作和访问方法。下面是 LinkedList 接口的一些常见方法及其代码详细介绍：
        LinkedList是双向链表 有addFirst addLast  get  getFirst getLast  set remove  queue队列
         */
        //添加元素：
        //boolean add(E element): 将指定元素添加到链表的末尾。
        //void addFirst(E element): 将指定元素添加到链表的头部。
        //void addLast(E element): 将指定元素添加到链表的末尾。
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");  // ["apple"]
        linkedList.addFirst("banana");  // ["banana", "apple"]
        linkedList.addLast("orange");  // ["banana", "apple", "orange"]

        //获取元素：
        //E get(int index): 返回链表中指定位置的元素。
        //E getFirst(): 返回链表的第一个元素。
        //E getLast(): 返回链表的最后一个元素。
        String element = linkedList.get(1);  // "banana"
        String firstElement = linkedList.getFirst();  // "apple"
        String lastElement = linkedList.getLast();  // "banana"

        //修改元素：
        //E set(int index, E element): 替换链表中指定位置的元素，并返回被替换的元素。
        String replacedElement = linkedList.set(1, "orange");  // ["apple", "orange"], replacedElement = "banana"

        //删除元素：
        //E remove(int index): 移除并返回链表中指定位置的元素。
        //E removeFirst(): 移除并返回链表的第一个元素。
        //E removeLast(): 移除并返回链表的最后一个元素。
        String removedElement = linkedList.remove(0);  // ["banana"], removedElement = "apple"
        String firstElements = linkedList.removeFirst();  // [], firstElement = "banana"
        String lastElements = linkedList.removeLast();  // []

        //队列操作： LinkedList 还可以用作队列，支持队列的先进先出（FIFO）操作。
        //void offer(E element): 将指定元素添加到队列的末尾。
        //E poll(): 获取并移除队列的头部元素。
        //E peek(): 获取但不移除队列的头部元素。
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("apple");
        queue.offer("banana");
        String headElement = queue.poll();  // "apple", queue = ["banana"]
        String peekedElement = queue.peek();  // "banana", queue = ["banana"]

        //栈 后进先出
        LinkedList<String> stack = new LinkedList<>();
        stack.push("apple");
        stack.push("banana");
        stack.pop();
        System.out.println(stack);
    }
}
