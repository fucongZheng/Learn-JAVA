package com.fucongzheng.popular;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // 添加元素到ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // 获取ArrayList的大小
        int size = numbers.size();
        System.out.println("ArrayList的大小：" + size);  // 输出结果：3

        // 访问特定位置的元素
        int element = numbers.get(1);
        System.out.println("索引位置1的元素：" + element);  // 输出结果：20

        // 修改特定位置的元素
        numbers.set(2, 40);
        System.out.println("修改后的ArrayList：" + numbers);  // 输出结果：[10, 20, 40]

        // 删除特定位置的元素
        numbers.remove(0);
        System.out.println("删除后的ArrayList：" + numbers);  // 输出结果：[20, 40]

        // 检查ArrayList中是否包含某个元素
        boolean containsElement = numbers.contains(20);
        System.out.println("ArrayList中是否包含元素20：" + containsElement);  // 输出结果：true

        // 遍历ArrayList中的所有元素
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            System.out.println("索引位置" + i + "的元素：" + num);
    }
}
}
