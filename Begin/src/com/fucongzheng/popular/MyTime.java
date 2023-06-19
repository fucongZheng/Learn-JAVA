package com.fucongzheng.popular;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyTime {
    public static void main(String[] args) {
        // LocalDate示例
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
        //获取当前日期是 星期几
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        System.out.println(dayOfWeek);

        // LocalTime示例
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // LocalDateTime示例
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // 格式化日期和时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // 解析字符串为日期和时间
        String dateTimeString = "2023-06-15 10:30:00";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("Parsed Date and Time: " + parsedDateTime);
    }
}
