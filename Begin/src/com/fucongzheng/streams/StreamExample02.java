package com.fucongzheng.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);

        // 对列表进行排序并选择前3个元素
        List<Integer> result = numbers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
