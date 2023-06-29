package com.fucongzheng.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Orange", 5);
//使用 entrySet() 方法遍历键值对：
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
//使用 keySet() 方法遍历键，并通过键获取对应的值：
        for (String key : map.keySet()) {
            int value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
//使用迭代器遍历键值对：
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
        System.out.println();
        //可以使用 Lambda 表达式来遍历 Map 集合。下面是使用 Lambda 表达式的示例代码：
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // 使用 forEach 方法遍历键
        map.keySet().forEach(key -> System.out.println("Key: " + key));

        // 使用 forEach 方法遍历值
        map.values().forEach(value -> System.out.println("Value: " + value));
    }

}
