package com.fucongzheng.regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    /*
    正则表达式
    首先，我们定义了一个包含所需邮箱格式的正则表达式模式字符串。该模式使用了特定的语法，用于匹配符合标准邮箱格式的字符串。在这个例子中，我们匹配的是常见的电子邮件地址格式。

    然后，我们使用Pattern.compile()方法将正则表达式模式编译为Pattern对象。这样可以提高匹配效率，因为编译后的模式可以被重复使用。

    接下来，我们创建了一个Matcher对象，用于应用正则表达式模式匹配文本。通过调用matcher.find()方法，我们可以查找匹配项。在这个例子中，我们使用了一个循环来遍历所有匹配的邮箱地址。

    当matcher.find()返回true时，表示找到了一个匹配项。我们可以使用matcher.group()方法获取匹配项的字符串，并对其进行进一步处理或输出。
     */
    public static void main(String[] args) {
        String text = "Hello, my email is john@example.com";

        // 定义邮箱正则表达式模式
        String patternString = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";

        // 编译正则表达式模式
        Pattern pattern = Pattern.compile(patternString);

        // 创建Matcher对象，并将文本与正则表达式匹配
        Matcher matcher = pattern.matcher(text);

        // 查找并输出匹配的邮箱地址
        while (matcher.find()) {
            String email = matcher.group();
            System.out.println("Email found: " + email);
        }
    }
}
