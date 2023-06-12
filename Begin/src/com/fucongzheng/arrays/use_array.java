package com.fucongzheng.arrays;

public class use_array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("-------------");
        for (int num : array) {
            System.out.println(num);
        }
    }
}
