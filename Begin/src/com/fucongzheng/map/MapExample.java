package com.fucongzheng.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    /*
    创建了一个 HashMap 实例来存储学生姓名和对应的分数。我们使用不同的方法来添加、获取、判断是否包含键、遍历键值对、修改值、删除键值对以及获取 Map 的大小等操作。

    put
    get(key)
    containsKey
    size()
    remove
    clear
     */
    public static void main(String[] args) {
        // 创建一个 HashMap 实例，存储学生姓名和对应的分数
        Map<String, Integer> scores = new HashMap<>();

        // 添加键值对到 Map
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 95);

        // 获取某个键对应的值
        int aliceScore = scores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        // 判断是否包含指定的键
        boolean containsBob = scores.containsKey("Bob");
        System.out.println("Contains Bob: " + containsBob);

        // 遍历 Map 的键值对
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + "'s score: " + score);
        }

        // 修改某个键对应的值
        scores.put("Alice", 95);
        System.out.println("Updated Alice's score: " + scores.get("Alice"));

        // 删除某个键值对
        scores.remove("Charlie");
        System.out.println("Charlie's score after removal: " + scores.get("Charlie"));

        // 获取 Map 的大小
        int size = scores.size();
        System.out.println("Map size: " + size);

        // 清空 Map
        scores.clear();
        System.out.println("Map is empty: " + scores.isEmpty());
    }
}
