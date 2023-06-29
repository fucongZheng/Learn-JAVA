package com.fucongzheng.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    public static void main(String[] args) {
        // 创建一个 LinkedHashMap 实例，保持插入顺序
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // 添加键值对到 LinkedHashMap
        linkedHashMap.put("Apple", 3);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Orange", 5);

        // 遍历 LinkedHashMap 的键值对（按照插入顺序）
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // 获取 LinkedHashMap 中的第一个和最后一个键值对
        Map.Entry<String, Integer> firstEntry = linkedHashMap.entrySet().iterator().next();
        Map.Entry<String, Integer> lastEntry = null;
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            lastEntry = entry;
        }
        System.out.println("First Entry: " + firstEntry.getKey() + ", " + firstEntry.getValue());
        System.out.println("Last Entry: " + lastEntry.getKey() + ", " + lastEntry.getValue());

        // 移除指定键的键值对
        linkedHashMap.remove("Banana");
        System.out.println("After removal, LinkedHashMap size: " + linkedHashMap.size());
    }
}
