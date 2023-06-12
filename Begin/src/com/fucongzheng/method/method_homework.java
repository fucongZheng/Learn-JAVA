package com.fucongzheng.method;

public class method_homework {
    /*
    可变参数作业
     */
    public static void main(String[] args) {
        getMax(1,2,4,5,3,8);
//        getMax(new double[]{1,2,9});
    }

    public static void getMax(double... number) {
        if (number.length == 0) {
            System.out.println("都没有内容怎么比较");
        }

        double result = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] > result) {
                result = number[i];
            }
        }
        System.out.println("最大值是："+result);
    }
}
