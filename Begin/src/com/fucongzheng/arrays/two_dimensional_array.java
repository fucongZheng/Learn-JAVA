package com.fucongzheng.arrays;

public class two_dimensional_array {
    public static void main(String[] args) {
        /*
        二维数组
         */
        int[][] array = {{1, 1}, {2, 2},{3,3},{4,5}};

        for (int[] arr:array
             ) {
            for (int i:arr
                 ) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
