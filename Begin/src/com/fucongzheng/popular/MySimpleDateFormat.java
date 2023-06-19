package com.fucongzheng.popular;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MySimpleDateFormat {
    public static void main(String[] args) {
        /*
        SimpleDateFormat类提供了许多其他用于格式化和解析日期和时间的方法，
        例如setLenient()、getTimeZone()等。它还支持各种日期和时间模式，
        可通过模式字母指定不同的日期和时间格式，如"yyyy"表示年份，"MM"表示月份，"dd"表示天数等。

        需要注意的是，SimpleDateFormat是非线程安全的，如果在多线程环境下使用，请考虑使用线程安全的替代方案，例如java.time.format.DateTimeFormatter。
         */
        // 创建一个SimpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // 获取当前日期和时间
        Date currentDate = new Date();

        // 格式化日期和时间为字符串
        String formattedDateTime = sdf.format(currentDate);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // 解析字符串为日期和时间
        String dateTimeString = "2023-06-15 10:30:00";
        try {
            Date parsedDateTime = sdf.parse(dateTimeString);
            System.out.println("Parsed Date and Time: " + parsedDateTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
