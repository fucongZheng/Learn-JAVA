package com.fucongzheng.algorithm;

public class BubbleSort {
    /*
    冒泡排序
    在 bubbleSort() 方法中，我们使用两个嵌套的循环来遍历数组并比较相邻元素。外层循环 i 控制每一轮的比较次数，
    从第一个元素到倒数第二个元素（n - 1）。内层循环 j 在每一轮中进行相邻元素的比较和交换操作，从第一个元素到当前轮次需要比较的最后一个元素（n - i - 1）。

    如果发现相邻元素顺序不对（前一个元素大于后一个元素），就交换它们的位置。通过这样的比较和交换操作，每一轮都会将当前未排序部分的最大元素移动到末尾。

    在内层循环的每次迭代之后，我们检查是否发生了交换操作。如果没有发生交换，表示数组已经有序，可以提前退出外层循环。

    在 main() 方法中，我们创建一个整数数组 array 并初始化。然后，我们打印出排序前的数组内容，并调用 bubbleSort() 方法对数组进行排序。最后，我们再次打印出排序后的数组内容。
     */
    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // 标记是否发生了交换
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // 交换相邻元素
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // 如果没有发生交换，表示数组已经有序，提前退出循环
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 3};

        System.out.println("Array before sorting:");
        printArray(array);

        bubbleSort(array);

        System.out.println("Array after sorting:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
