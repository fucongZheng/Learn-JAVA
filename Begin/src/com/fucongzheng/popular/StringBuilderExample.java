package com.fucongzheng.popular;

public class StringBuilderExample {
    /*
    StringBuilder类是可变的，它提供了一系列的方法来修改和操作字符串。与使用String类拼接字符串相比，使用StringBuilder可以减少创建新字符串的开销，并提供更高效的字符串操作
    。通过使用append()、insert()、delete()等方法，可以对字符串进行添加、插入和删除操作。最后，通过使用toString()方法，可以将StringBuilder转换为不可变的String对象。
     */
    public static void main(String[] args) {
        // 创建一个空的StringBuilder对象
        StringBuilder sb = new StringBuilder();

        // 使用append()方法向StringBuilder添加文本
        sb.append("Hello");
        sb.append(", ");
        sb.append("World!");

        // 使用toString()方法将StringBuilder转换为String
        String result = sb.toString();
        System.out.println(result);  // 输出结果：Hello, World!

        // 使用insert()方法在指定位置插入文本
        sb.insert(7, "Java ");
        System.out.println(sb.toString());  // 输出结果：Hello, Java World!

        // 使用delete()方法删除指定范围内的文本
        sb.delete(7, 11);
        System.out.println(sb.toString());  // 输出结果：Hello, World!

        // 使用reverse()方法反转StringBuilder中的文本
        sb.reverse();
        System.out.println(sb.toString());  // 输出结果：!dlroW ,olleH
    }
}
