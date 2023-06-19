package com.fucongzheng.popular;

import java.util.Date;

public class MyDate {

    public static void main(String[] args) {
        // 创建一个表示当前日期和时间的Date对象
        Date currentDate = new Date();

        // 显示当前日期和时间
        System.out.println("Current Date and Time: " + currentDate);

        // 获取自1970年1月1日以来经过的毫秒数
        long milliseconds = currentDate.getTime();
        System.out.println("Milliseconds since January 1, 1970: " + milliseconds);

        // 使用毫秒数设置日期
        long newMilliseconds = 1623760800000L; // 示例：2021年6月15日 00:00:00
        currentDate.setTime(newMilliseconds);
        System.out.println("Updated Date: " + currentDate);

        // 获取日期的具体组成部分
        int year = currentDate.getYear() + 1900; // 年份是基于1900，需要加上1900
        int month = currentDate.getMonth() + 1; // 月份从0开始，需要加1
        int day = currentDate.getDate();
        int hours = currentDate.getHours();
        int minutes = currentDate.getMinutes();
        int seconds = currentDate.getSeconds();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

    }
}
