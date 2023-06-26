package com.fucongzheng.otherthing;

import java.util.Arrays;
/*
首先，我们定义了一个名为 StringUtils 的自定义工具类，其中包含一个静态方法 toUpperCase()，用于将字符串转换为大写形式。

然后，在 StaticMethodReferenceExample 类的 main() 方法中，我们创建了一个字符串数组 strings，其中包含几个水果名称。

接下来，我们使用静态方法引用 StringUtils::toUpperCase 将字符串数组中的每个元素应用于 map() 操作，以将其转换为大写形式。

最后，我们使用 forEach() 方法打印转换后的结果。
 */

// 自定义的工具类
class StringUtils {
    // 静态方法：将字符串转换为大写
    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}

public class StaticMethodReferenceExample {
    public static void main(String[] args) {
        // 字符串数组
        String[] strings = {"apple", "banana", "orange"};

        // 使用静态方法引用将字符串数组中的每个元素转换为大写
        Arrays.stream(strings)
                .map(StringUtils::toUpperCase)
                .forEach(System.out::println);
    }
}
