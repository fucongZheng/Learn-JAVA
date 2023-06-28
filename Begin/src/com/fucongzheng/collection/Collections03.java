package com.fucongzheng.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections03 {
    public static void main(String[] args) {
        //使用 Collections.sort() 方法对列表进行排序：
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Before sorting: " + numbers); // 输出：Before sorting: [5, 2, 8, 1]

        Collections.sort(numbers);

        System.out.println("After sorting: " + numbers); // 输出：After sorting: [1, 2, 5, 8]

        //使用 Collections.reverse() 方法反转列表的元素顺序：

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        System.out.println("Before reversing: " + fruits); // 输出：Before reversing: [apple, banana, cherry]

        Collections.reverse(fruits);

        System.out.println("After reversing: " + fruits); // 输出：After reversing: [cherry, banana, apple]

        //使用 Collections.shuffle() 方法随机打乱列表中的元素：
        //选中要修改的参数名称。
        //使用快捷键 Shift + F6（或者右键点击然后选择 "Refactor" -> "Rename"）打开重命名对话框。
        //在对话框中输入新的参数名称并按下 Enter 键。
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        System.out.println("Before shuffling: " + integers); // 输出：Before shuffling: [1, 2, 3, 4]

        Collections.shuffle(integers);

        System.out.println("After shuffling: " + integers); // 输出：After shuffling: [2, 3, 4, 1]
    }
}
