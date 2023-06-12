package com.fucongzheng.method;

public class Method_overload {
    public static void main(String[] args) {
        /*
        方法重载
        方法名相同，方法参数类型不同
         */
    }

    public static int Maxs(int num, int num2) {
        int result = 0;
        if (num == num2) {
            System.out.println("相等");
            return 0;
        }

        if (num > num2) {
            result = num;
        } else {
            result = num2;
        }
        return result;
    }

    public static double Maxs(double a, double b) {
        double result = 0;
        if (a == b) {
            System.out.println("相等");
            return 0;
        }

        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }
}
