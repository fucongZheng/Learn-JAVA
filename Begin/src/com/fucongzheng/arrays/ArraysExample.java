package com.fucongzheng.arrays;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // 声明和初始化数组
        int[] numbers = {5, 2, 8, 1, 9};

        // 打印数组元素
        System.out.println("Array elements: " + Arrays.toString(numbers));

        // 数组排序
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // 数组搜索
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of element 8: " + index);

        // 数组填充
        Arrays.fill(numbers, 0);
        System.out.println("Array after filling: " + Arrays.toString(numbers));

        // 数组复制
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copy));

        // 数组比较
        boolean isEquals = Arrays.equals(numbers, copy);
        System.out.println("Are arrays equal? " + isEquals);
    }
}
