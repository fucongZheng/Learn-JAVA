package com.fucongzheng.method;

public class method03 {
    /*
    可变参数 在指定参数类型后面加一个省略号...
     */
    public static void main(String[] args) {
        method03 method03 = new method03();
        method03.method(2, 3, 4, 5, 6);

    }

    public void method(int... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
