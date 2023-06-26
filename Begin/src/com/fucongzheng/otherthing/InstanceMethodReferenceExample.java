package com.fucongzheng.otherthing;

import java.util.Arrays;
import java.util.List;
/*
特定方法
首先，我们定义了一个名为 StringProcessor 的自定义字符串处理类，其中包含一个实例方法 toUpperCase()，用于将字符串转换为大写形式。

然后，在 InstanceMethodReferenceExample 类的 main() 方法中，我们创建了一个字符串列表 strings，其中包含几个水果名称。

接下来，我们创建了自定义字符串处理类 StringProcessor 的实例对象 processor。

然后，我们使用特定类型的方法引用 processor::toUpperCase 将字符串列表中的每个元素应用于 map() 操作，以将其转换为大写形式。
 */
// 自定义的字符串处理类
class StringProcessor {
    // 实例方法：将字符串转换为大写
    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}

public class InstanceMethodReferenceExample {
    public static void main(String[] args) {
        // 字符串列表
        List<String> strings = Arrays.asList("apple", "banana", "orange");

        // 创建自定义字符串处理类的实例
        StringProcessor processor = new StringProcessor();

        // 使用特定类型的方法引用将字符串列表中的每个元素转换为大写
        strings.stream()
                .map(processor::toUpperCase)
                .forEach(System.out::println);
    }
}
