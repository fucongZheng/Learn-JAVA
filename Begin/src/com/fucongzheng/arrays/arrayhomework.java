package com.fucongzheng.arrays;

public class arrayhomework {
    /*
    反转数组
    foreach
    数组作为方法的入参
    数组作为返回值
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        print_array(reverse(array));
    }

    public static int[] reverse(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0, j = result.length - 1; i < array.length; i++, j--) {
            result[j] = array[i];
        }

        return result;
    }

    public static void print_array(int[] array) {
        for (int num : array
        ) {
            System.out.print(num + " ");
        }
    }
}
