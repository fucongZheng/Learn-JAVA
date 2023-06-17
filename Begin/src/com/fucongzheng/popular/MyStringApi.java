package com.fucongzheng.popular;

import java.util.Arrays;
import java.util.Locale;

public class MyStringApi {
    public static void main(String[] args) {
        String name = " zolaz";

        //compareTo()方法 用于在字典顺序中比较两个字符串。返回值为0表示相等，大于0表示当前字符串大于目标字符串，小于0表示当前字符串小于目标字符串
        System.out.println(name.compareTo("expensive"));


        //equals()方法：用于比较两个字符串的内容是否相等。
        System.out.println(name.equals("zola1"));

        //concat()方法：与"+"运算符类似，将指定的字符串连接到当前字符串的末尾，并返回新的字符串。
        System.out.println("concat()方法：与\"+\"运算符类似，将指定的字符串连接到当前字符串的末尾，并返回新的字符串   ");
        String man = name.concat("is a good man");
        System.out.println(man);
        //substring()方法：用于从一个字符串中提取指定范围的子串。
        //取值范围从0 开始到 1 不取2
        String substring = name.substring(0, 2);
        System.out.println(substring);

        //charAt()方法：用于获取指定位置的字符
        char c = name.charAt(0);
        System.out.println(c);

        //toUpperCase()方法：将字符串转换为大写形式。

        System.out.println(name.toUpperCase());
        //toLowerCase()方法：将字符串转换为小写形式。
        System.out.println(name.toLowerCase());

        //字符串查找：
        //
        //indexOf()方法：返回指定字符或子串在字符串中首次出现的位置。
        int z = name.indexOf('z');
        System.out.println(z);

        //lastIndexOf()方法：返回指定字符或子串在字符串中最后一次出现的位置。
        System.out.println(name.lastIndexOf('z'));

        //split()方法：根据指定的分隔符将字符串拆分成字符串数组。
        String[] os = name.split("o");
        System.out.println(Arrays.toString(os));

        //format()方法：根据指定的格式将数据格式化成字符串。
        System.out.println(String.format(name, "a"));

        //length()方法：返回字符串的长度。
        int length = name.length();
        System.out.println(length);

        //matches()方法：使用正则表达式进行匹配。
        System.out.println(name.matches("zolaz"));
        //replaceFirst()和replaceAll()方法：用新的字符串替换匹配的文本。
        System.out.println(name.replaceFirst("z", "L"));

        System.out.println(name.replaceAll("zolaz","hello"));

        //trim()去除字符串两端的空白字符、
        System.out.println(name.trim());
        // startsWith()和endsWith()检查字符串是否以指定的前缀或后缀开始或结束
        
    }
}
