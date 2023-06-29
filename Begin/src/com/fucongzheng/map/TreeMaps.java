package com.fucongzheng.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    /*
    创建了一个 TreeMap 实例，并以整数作为键，字符串作为值。我们添加键值对到 TreeMap 中，并使用 entrySet() 方法遍历键值对，该方法会按照键的自然顺序（升序）进行排序。

    TreeMap 还提供了一些额外的方法，如 firstEntry() 和 lastEntry() 可以获取第一个和最后一个键值对，floorEntry(key)
    可以获取小于等于给定键的最大键值对，ceilingEntry(key) 可以获取大于等于给定键的最小键值对等。
     */
    public static void main(String[] args) {
        // 创建一个 TreeMap 实例，按照键的自然顺序排序
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // 添加键值对到 TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        // 遍历 TreeMap 的键值对（按照键的升序顺序）
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // 获取 TreeMap 中的第一个和最后一个键值对
        Map.Entry<Integer, String> firstEntry = treeMap.firstEntry();
        Map.Entry<Integer, String> lastEntry = treeMap.lastEntry();
        System.out.println("First Entry: " + firstEntry.getKey() + ", " + firstEntry.getValue());
        System.out.println("Last Entry: " + lastEntry.getKey() + ", " + lastEntry.getValue());

        // 获取小于等于给定键的最大键值对
        Map.Entry<Integer, String> floorEntry = treeMap.floorEntry(2);
        System.out.println("Floor Entry: " + floorEntry.getKey() + ", " + floorEntry.getValue());

        // 获取大于等于给定键的最小键值对
        Map.Entry<Integer, String> ceilingEntry = treeMap.ceilingEntry(2);
        System.out.println("Ceiling Entry: " + ceilingEntry.getKey() + ", " + ceilingEntry.getValue());

        // 移除指定键的键值对
        treeMap.remove(2);
        System.out.println("After removal, TreeMap size: " + treeMap.size());
    }
}
