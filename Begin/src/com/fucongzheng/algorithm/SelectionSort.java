package com.fucongzheng.algorithm;

public class SelectionSort {
    /*
    选择排序
    在 selectionSort() 方法中，我们使用两个嵌套的循环来进行选择排序。外层循环 i 控制每一轮的选择操作，从第一个元素到倒数第二个元素（n - 1）。

    在每一轮中，我们首先假设当前未排序部分的第一个元素是最小的，并将其索引作为 minIndex。然后，在内层循环 j 中，
    我们遍历未排序部分的元素，并检查是否存在比当前最小值更小的元素。如果找到了较小的元素，就更新 minIndex。

    完成内层循环之后，我们将找到的最小元素与当前位置 i 的元素进行交换。这样，每一轮都会将未排序部分的最小元素放置到已排序部分的末尾。

    在 main() 方法中，我们创建一个整数数组 array 并初始化。然后，我们打印出排序前的数组内容，并调用 selectionSort() 方法对数组进行排序。最后，我们再次打印出排序后的数组内容
     */
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // 在未排序部分中找到最小元素的索引
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // 将最小元素与当前位置交换
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 3};

        System.out.println("Array before sorting:");
        printArray(array);

        selectionSort(array);

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
