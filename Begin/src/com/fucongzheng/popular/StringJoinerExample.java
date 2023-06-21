package com.fucongzheng.popular;

import java.util.StringJoiner;

public class StringJoinerExample {
    /*
    这个示例代码展示了如何使用Java的StringJoiner类。在StringJoinerExample类中，我们创建了两个StringJoiner对象。

    首先，我们创建了一个StringJoiner对象sj，并指定了分隔符为", "，前缀为"Prefix: "，后缀为"Suffix"。然后，
    我们使用add()方法向StringJoiner添加元素，通过多次调用add()方法，我们可以逐步构建拼接的字符串。最后，我们使用toString()方法获取最终拼接的字符串，并将其打印输出。

    接下来，我们创建了另一个StringJoiner对象sj2，这次没有指定前缀和后缀，只指定了分隔符为";"。
    然后，我们使用add()方法向StringJoiner添加元素，同样通过多次调用add()方法来构建拼接的字符串。最后，我们使用toString()方法获取最终拼接的字符串，并将其打印输出。
     */
    public static void main(String[] args) {
        // 创建一个StringJoiner对象，指定分隔符和可选的前缀、后缀
        StringJoiner sj = new StringJoiner(", ", "Prefix: ", "Suffix");

        // 使用add()方法向StringJoiner添加元素
        sj.add("Apple");
        sj.add("Banana");
        sj.add("Orange");

        // 使用toString()方法获取最终拼接的字符串
        String result = sj.toString();
        System.out.println(result);  // 输出结果：Prefix: Apple, Banana, OrangeSuffix

        // 创建一个StringJoiner对象，不指定前缀和后缀
        StringJoiner sj2 = new StringJoiner(";");

        // 使用add()方法向StringJoiner添加元素
        sj2.add("Red");
        sj2.add("Green");
        sj2.add("Blue");

        // 使用toString()方法获取最终拼接的字符串
        String result2 = sj2.toString();
        System.out.println(result2);  // 输出结果：Red;Green;Blue
    }
    //StringJoiner类提供了一种方便的方式来拼接字符串，特别适用于构建逗号分隔的列表或其他具有特定分隔符的字符串。
    // 通过在创建StringJoiner对象时指定分隔符、前缀和后缀，并使用add()方法添加元素，可以逐步构建最终的拼接字符串。最后，使用toString()方法获取最终拼接的字符串。
}
