package com.fucongzheng.arrays;

import java.util.Arrays;

public class Arrays_study2 {
    public static void main(String[] args) {
        /*
        冒泡排序
         */
        int[] array = {1,3, 5, 2};
        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] array) {
        /*
        第一次循环 a = 0
        i = 0   i < 3-1-0
        数组3,2,5
        i =1 1<2


        第二次循环
        a=1
        i=0  0<3-1-1
         */
        int temp;
        for (int a = 0; a < array.length - 1; a++) {
            boolean flag = false;
            for (int i = 0; i < array.length - 1 - a; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }

        return array;
    }
}
