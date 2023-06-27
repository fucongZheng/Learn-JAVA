package com.fucongzheng.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collections01 {
    /*
    Collection是集合的父接口，自己有的方法是 add  addAll  remove  removeAll  size  isEmpty  clear  ,它本身就是一个iterator迭代器
     */
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        //boolean add(E element): 将指定元素添加到集合中，并返回添加操作是否成功。
        boolean added = collection.add("apple");
        System.out.println(added);

        //boolean remove(Object element): 从集合中删除指定元素，并返回删除操作是否成功。
        //boolean removeAll(Collection<?> elements): 从集合中删除包含在指定集合中的所有元素，并返回删除操作是否成功。

        boolean removed = collection.remove("apple");
        System.out.println(removed);

        Collection<String> otherCollection = new ArrayList<>();
        otherCollection.add("banana");
        otherCollection.add("orange");
        boolean removedAll = collection.removeAll(otherCollection);  //批量添加，可以添加集合
        System.out.println(removedAll);

        //boolean contains(Object element): 判断集合是否包含指定元素。
        //boolean containsAll(Collection<?> elements): 判断集合是否包含指定集合中的所有元素。
        collection.add("apple");
        boolean contains = collection.contains("apple");

        Collection<String> otherCollections = new ArrayList<>();
        otherCollections.add("banana");
        otherCollections.add("orange");
        boolean containsAll = collection.containsAll(otherCollections);


        //int size(): 返回集合中的元素数量。
        //boolean isEmpty(): 判断集合是否为空，即没有元素。
        int size = collection.size();
        boolean empty = collection.isEmpty();

        //void clear(): 清空集合，删除所有元素。
        collection.clear();

        //Iterator<E> iterator(): 返回一个迭代器用于遍历集合中的元素。
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
