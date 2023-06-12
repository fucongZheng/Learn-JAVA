package com.fucongzheng.method;

public class method01 {
    public static void main(String[] args) {

        int maxs = Maxs(1, 2);
        System.out.println(maxs);
    }

    public static int Maxs(int num, int num2) {
        int result = 0;
        if (num == num2){
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
}
