package com.fucongzheng.popular;

public class StringBufferExample {
    /*
    这个示例代码展示了如何使用Java的StringBuffer类。在StringBufferExample类中，我们创建了一个空的StringBuffer对象。

    首先，我们使用append()方法向StringBuffer对象添加文本。通过多次调用append()方法，我们可以逐步构建字符串。然后，我们使用toString()方法将StringBuffer转换为String类型，
    并将其存储在result变量中。最后，我们打印输出result，显示拼接后的字符串。

    接下来，我们使用insert()方法在指定位置插入文本。在示例中，我们在位置7处插入"Java "，即将"Java "插入到字符串"Hello, World!"中的逗号后面。然后，我们再次打印输出StringBuffer对象。

    然后，我们使用delete()方法删除指定范围内的文本。在示例中，我们删除了索引7到11（不包括索引11）之间的文本，即删除了"Java "。然后，我们再次打印输出StringBuffer对象。

    最后，我们使用reverse()方法反转StringBuffer对象中的文本。在示例中，我们将字符串逆序，得到了"!dlroW ,olleH"。最后，我们再次打印输出StringBuffer对象。



    StringBuffer类与StringBuilder类相似，都是可变的字符串类。它们提供了一系列的方法来修改和操作字符串。不同之处在于，StringBuffer是线程安全的，适用于多线程环境下的字符串操作。
    因此，在涉及到并发或线程安全性要求较高的场景中，可以使用StringBuffer。否则，在单线程环境下，建议使用StringBuilder，因为它更高效。
     */
    public static void main(String[] args) {
        // 创建一个空的StringBuffer对象
        StringBuffer sb = new StringBuffer();

        // 使用append()方法向StringBuffer添加文本
        sb.append("Hello");
        sb.append(", ");
        sb.append("World!");

        // 使用toString()方法将StringBuffer转换为String
        String result = sb.toString();
        System.out.println(result);  // 输出结果：Hello, World!

        // 使用insert()方法在指定位置插入文本
        sb.insert(7, "Java ");
        System.out.println(sb.toString());  // 输出结果：Hello, Java World!

        // 使用delete()方法删除指定范围内的文本
        sb.delete(7, 11);
        System.out.println(sb.toString());  // 输出结果：Hello, World!

        // 使用reverse()方法反转StringBuffer中的文本
        sb.reverse();
        System.out.println(sb.toString());  // 输出结果：!dlroW ,olleH
    }
}
