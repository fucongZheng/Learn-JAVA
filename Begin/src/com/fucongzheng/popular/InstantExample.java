package com.fucongzheng.popular;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        // 获取当前时间的时间戳
        Instant now = Instant.now();
        System.out.println("Current Timestamp: " + now);

        // 创建指定时间的时间戳
        Instant customInstant = Instant.ofEpochSecond(1630454400);
        System.out.println("Custom Timestamp: " + customInstant);

        // 在现有时间戳的基础上添加时间量
        Instant futureInstant = now.plusSeconds(3600);
        System.out.println("Future Timestamp: " + futureInstant);

        // 在现有时间戳的基础上减去时间量
        Instant pastInstant = now.minusSeconds(1800);
        System.out.println("Past Timestamp: " + pastInstant);

        // 比较时间戳的先后顺序
        boolean isBefore = now.isBefore(customInstant);
        System.out.println("Is Current before Custom? " + isBefore);
    }
}