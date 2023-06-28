package com.fucongzheng.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExample {
    /*
    在上述案例中，主线程和子线程同时对集合进行修改，子线程使用迭代器遍历并删除元素。由于子线程删除元素时，主线程又添加了新的元素，导致了并发修改异常 ConcurrentModificationException 的抛出。

    为了避免并发修改异常，可以采取以下解决方案之一：

    使用线程安全的集合类，如 CopyOnWriteArrayList、ConcurrentHashMap等。
    在多线程环境下对集合进行操作时，使用适当的同步机制，如使用互斥锁（synchronized）或并发容器的原子操作方法。
    在遍历集合时，使用迭代器的 remove() 方法进行元素删除，而不是直接调用集合的删除方法。
    记住，在并发环境下操作集合时要格外小心，确保线程安全性和正确性。
     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // 创建一个线程来并发地修改集合
        Thread thread = new Thread(() -> {
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                int number = iterator.next();
                System.out.println(number);
//                numbers.remove(number); // 集合对象删除会出问题
                iterator.remove();// 并发删除元素
            }
        });

        thread.start();

        // 主线程同时对集合进行修改
//        try {
//            Thread.sleep(1000); // 等待一段时间让子线程先运行
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        numbers.add(4); // 主线程添加元素

        // 等待子线程执行完毕
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
