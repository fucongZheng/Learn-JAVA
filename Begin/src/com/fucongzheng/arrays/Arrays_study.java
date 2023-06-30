package com.fucongzheng.arrays;

import org.slf4j.LoggerFactory;

import java.util.Arrays;
import org.slf4j.Logger;

public class Arrays_study {
    public static final Logger LOGGER = LoggerFactory.getLogger("FucongZheng");
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
            LOGGER.debug("参数a是->" +a);
        }
        System.out.print(end);
    }
}
