package com.fucongzheng.arrays;

import java.util.Arrays;

public class Arrays_study {
    public static void main(String[] args) {
        /*
        给数组赋值 fill
        数组进行排序 sort
        比较数组 equals

        查找数组元素 binarySearch
        toString
         */
        int[] array = {1, 3, 2, 555, 2, 1, 333, 42, 2};
//        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        toStrings(array);
    }
    public static void toStrings(int[] array){
        String start = "[";
        String end = "]";
        System.out.print(start);
        for (int a:array
             ) {
            System.out.print(a +",");
        }
        System.out.print(end);
    }
}
