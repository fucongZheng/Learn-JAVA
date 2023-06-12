package com.fucongzheng.method;


public class recursion {
    /*
    递归
    递归就是方法自己调用自己的过程

    递归结构包括两个部分
    递归头和递归体
     */
    public static void main(String[] args) {
        int a = test(5);
        System.out.println(a);
    }

    public static int test(int num) {
        if (num == 1) {
            return 1;
        }
        return test(num-1) * (num);

    }
}
