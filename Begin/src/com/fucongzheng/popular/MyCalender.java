package com.fucongzheng.popular;

import java.util.Calendar;

public class MyCalender {
    public static void main(String[] args) {
        Calendar currentCalendar = Calendar.getInstance();

        // 获取当前日期和时间的各个组成部分
        int year = currentCalendar.get(Calendar.YEAR);
        int month = currentCalendar.get(Calendar.MONTH) + 1; // 月份从0开始，需要加1
        int day = currentCalendar.get(Calendar.DAY_OF_MONTH);
        int hours = currentCalendar.get(Calendar.HOUR_OF_DAY);
        int minutes = currentCalendar.get(Calendar.MINUTE);
        int seconds = currentCalendar.get(Calendar.SECOND);

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        // 设置特定日期和时间
        Calendar customCalendar = Calendar.getInstance();
        customCalendar.set(2023, Calendar.JUNE, 15);
        customCalendar.set(Calendar.HOUR_OF_DAY, 10);
        customCalendar.set(Calendar.MINUTE, 30);
        customCalendar.set(Calendar.SECOND, 0);

        // 格式化日期和时间
        String formattedDateTime = String.format("%04d-%02d-%02d %02d:%02d:%02d",
                customCalendar.get(Calendar.YEAR),
                customCalendar.get(Calendar.MONTH) + 1,
                customCalendar.get(Calendar.DAY_OF_MONTH),
                customCalendar.get(Calendar.HOUR_OF_DAY),
                customCalendar.get(Calendar.MINUTE),
                customCalendar.get(Calendar.SECOND));

        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
