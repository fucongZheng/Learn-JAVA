package com.fucongzheng.algorithm;

public class BinarySearch {
    /*
    二分查找算法
    binarySearch() 方法接受一个已排序的整数数组 array 和目标值 target，并返回目标值在数组中的索引。如果目标值不存在于数组中，则返回 -1。

    在 binarySearch() 方法中，我们使用了经典的二分查找算法。我们通过维护左边界 left 和右边界 right 来定义当前搜索的范围。
    然后，我们用 (left + right) / 2 计算中间元素的索引 mid。如果中间元素等于目标值，则返回该索引。如果中间元素小于目标值，
    说明目标值在右侧，更新左边界为 mid + 1。如果中间元素大于目标值，说明目标值在左侧，更新右边界为 mid - 1。重复这个过程直到找到目标值或搜索范围为空。

    在 main() 方法中，我们创建一个已排序的整数数组 array 和目标值 target。然后，我们调用 binarySearch() 方法来查找目标值在数组中的索引。根据返回的索引结果，我们打印出相应的信息
     */
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 91;

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
