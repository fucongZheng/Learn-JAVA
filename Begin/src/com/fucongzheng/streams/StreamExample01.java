package com.fucongzheng.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // 过滤出所有偶数并将其乘以2
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
