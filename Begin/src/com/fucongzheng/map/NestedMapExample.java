package com.fucongzheng.map;

import java.util.HashMap;
import java.util.Map;

public class NestedMapExample {
    /*
    我们创建了一个嵌套的Map集合 nestedMap。其中，键是字符串类型，值是另一个Map集合。我们添加了两个嵌套的Map，分别表示水果和衣服的库存数量。

通过使用 get() 方法，我们可以访问嵌套的Map集合中的特定项。在示例代码中，我们获取了"Fruits"和"Clothes"这两个键对应的内部Map，并进一步获取具体物品的数量。

通过理解和运行上述示例代码，你可以学习如何使用Map集合实现嵌套的数据结构，并在多层级的情况下进行访问和操作。
     */
    public static void main(String[] args) {
        // 创建嵌套的Map集合
        Map<String, Map<String, Integer>> nestedMap = new HashMap<>();

        // 添加数据到嵌套的Map集合
        Map<String, Integer> innerMap1 = new HashMap<>();
        innerMap1.put("Apple", 3);
        innerMap1.put("Banana", 2);
        nestedMap.put("Fruits", innerMap1);

        Map<String, Integer> innerMap2 = new HashMap<>();
        innerMap2.put("Shirt", 5);
        innerMap2.put("Pants", 4);
        nestedMap.put("Clothes", innerMap2);

        // 访问嵌套的Map集合
        Map<String, Integer> fruitsMap = nestedMap.get("Fruits");
        int appleQuantity = fruitsMap.get("Apple");
        System.out.println("Apple Quantity: " + appleQuantity);

        Map<String, Integer> clothesMap = nestedMap.get("Clothes");
        int pantsQuantity = clothesMap.get("Pants");
        System.out.println("Pants Quantity: " + pantsQuantity);
    }
}
