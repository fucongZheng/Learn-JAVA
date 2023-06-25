package com.fucongzheng.popular;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneTimeExample {
    public static void main(String[] args) {
        // 获取当前系统默认时区
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println("Default Zone: " + defaultZone);

        // 获取指定时区的当前时间
        ZoneId losAngelesZone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime losAngelesTime = ZonedDateTime.now(losAngelesZone);
        System.out.println("Los Angeles Time: " + losAngelesTime);

        // 创建自定义的时区时间
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        ZonedDateTime customTime = ZonedDateTime.of(2022, 10, 1, 9, 0, 0, 0, tokyoZone);
        System.out.println("Custom Time: " + customTime);

        // 转换时区
        ZoneId londonZone = ZoneId.of("Europe/London");
        ZonedDateTime londonTime = customTime.withZoneSameInstant(londonZone);
        System.out.println("London Time: " + londonTime);

        // 比较时区时间
        boolean isBefore = losAngelesTime.isBefore(customTime);
        System.out.println("Is Los Angeles Time before Custom Time? " + isBefore);
    }
}
