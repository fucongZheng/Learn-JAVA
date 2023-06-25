package com.fucongzheng.popular;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    /*
    这个示例代码展示了如何使用Java的DateTimeFormatter类。

    首先，我们使用DateTimeFormatter.ofPattern()方法创建一个DateTimeFormatter对象，
    并指定日期时间的格式模式。在示例中，我们将日期时间的格式模式设置为"yyyy-MM-dd HH:mm:ss"，表示年份（4位数字），月份（2位数字），日期（2位数字），小时（24小时制，2位数字），分钟（2位数字）和秒（2位数字）。

    接下来，我们获取当前时间的LocalDateTime对象，并使用format()方法将其格式化为字符串。
    通过传递之前创建的DateTimeFormatter对象作为参数，可以将LocalDateTime对象按照指定的格式转换为字符串。最后，我们将格式化后的日期时间字符串打印输出。

    然后，我们演示了如何将字符串解析为日期时间对象。
    我们创建了一个表示"2022-01-01 12:30:00"的日期时间字符串，
    并使用parse()方法将其解析为LocalDateTime对象。同样，我们传递之前创建的DateTimeFormatter对象作为参数，以告知解析器要按照指定的格式进行解析。最后，我们将解析后的日期时间对象打印输出。

    DateTimeFormatter类提供了丰富的方法来格式化和解析日期时间对象。
    可以使用ofPattern()方法创建一个DateTimeFormatter对象，并通过指定格式模式来定义日期时间的格式。使用format()方法可以将日期时间对象格式化为字符串，使用parse()方法可以将字符串解析为日期时间对象。
     */
    public static void main(String[] args) {
        // 创建一个DateTimeFormatter对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // 格式化当前时间
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        // 解析字符串为日期时间对象
        String dateTimeString = "2022-01-01 12:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("Parsed DateTime: " + parsedDateTime);
    }
}
