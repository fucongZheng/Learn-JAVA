package com.fucongzheng.errors;

public class MyException {
    public static void main(String[] args) {
        /*
        ctrl + alt +T 快捷键
         */
        int a =1;
        int b =0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException  e){
            System.out.println("除数不能为0");
            e.printStackTrace();//打印错误信息
        } finally {
            System.out.println("都要执行");
        }

    }
}
