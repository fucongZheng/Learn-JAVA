package com.fucongzheng.collection;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class TreeSets {
    /*
    java.util.TreeSet 是 Java 集合框架中的一个实现了 SortedSet 接口的有序集合。它基于红黑树数据结构来存储和访问集合中的元素，保持元素的有序性。下面是 TreeSet 类的一些常见方法及其代码详细介绍：

    需要注意的是，TreeSet 类会根据元素的自然顺序或者提供的比较器来保持元素的有序性。如果集合中的元素是自定义的对象，需确保对象实现了 Comparable 接口或者在构造 TreeSet 时传入自定义的比较器。
    另外，由于 TreeSet 是基于红黑树实现的，插入、删除和查找元素的时间复杂度为 O(log N)，使得它在有序性要求较高的场景中具有良好的性能。
     */
    public static void main(String[] args) {
        //添加元素：
        //boolean add(E element): 将指定元素添加到集合中。
        TreeSet<String> set = new TreeSet<>();
        set.add("apple");  // {"apple"}
        set.add("banana");  // {"apple", "banana"}
        set.add("cherry");
        set.add("date");

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

        //获取有序的子集：
        //SortedSet<E> subSet(E fromElement, E toElement): 返回集合中从 fromElement（包括）到 toElement（不包括）之间的元素子集。
        //SortedSet<E> headSet(E toElement): 返回集合中小于 toElement 的所有元素子集。
        //SortedSet<E> tailSet(E fromElement): 返回集合中大于等于 fromElement 的所有元素子集。
        SortedSet<String> subset = set.subSet("banana", "date");  // {"banana", "cherry"}
        SortedSet<String> headSet = set.headSet("cherry");  // {"apple", "banana"}
        SortedSet<String> tailSet = set.tailSet("cherry");  // {"cherry", "date"}

        //---------------------------------------------------------------------------------------------------------
        System.out.println("按字母顺序排列的字符串：");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        //---------------------------------------------------------------------------------------------------------
        //该案例使用 TreeSet 存储自定义的 Person 对象，并按照年龄进行排序。
        TreeSet<Person> set1 = new TreeSet<>(Comparator.comparing(Person::getAge));

        set1.add(new Person("Alice", 25));
        set1.add(new Person("Bob", 30));
        set1.add(new Person("Charlie", 20));

        System.out.println("按年龄顺序排列的人物：");
        for (Person person : set1) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
