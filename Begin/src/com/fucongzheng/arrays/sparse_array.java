package com.fucongzheng.arrays;

public class sparse_array {
    public static void main(String[] args) {
        /*
        稀疏数组
        当一个数组中大部分元素为0，或者为同一值的数组时，可以使用稀疏数组来保存该数组.
         */
        int[][] two_array = new int[11][11];
        two_array[1][2] = 1;
        two_array[2][3] = 2;
        printArray(two_array);
        System.out.println("--------");
        printArray(sparse(two_array));
        System.out.println("--------");
        int[][] arr = sparse(two_array);
        printArray(original(arr));
    }

    public static void printArray(int[][] array) {
        for (int[] arr : array
        ) {
            for (int num : arr
            ) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] sparse(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0) {
                    sum++;
                }
            }

        }

        int[][] sparses = new int[sum + 1][3];
        sparses[0][0] = 11;
        sparses[0][1] = 11;
        sparses[0][2] = sum;

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 0) {
                    count++;
                    sparses[count][0] = i;
                    sparses[count][1] = j;
                    sparses[count][2] = array[i][j];
                }
            }

        }
        return sparses;

    }

    public static int[][] original(int[][] array) {

        int[][] arr = new int[array[0][0]][array[0][1]];

        for (int i = 1; i < array.length; i++) {
            arr[array[i][0]][array[i][1]] = array[i][2];
        }
        return arr;
    }
}
