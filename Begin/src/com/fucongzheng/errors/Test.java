package com.fucongzheng.errors;

public class Test {

    static void myMethod(int a) throws MyException2 {
        System.out.println("你传入的参数为"+a);
        if (a>10){
            throw new MyException2(a);
        }
        System.out.println("OK");
    }

    public static void main(String[] args) {
        try {
            myMethod(1);
        } catch (MyException2 e) {
//            e.printStackTrace();
            System.out.println("我自己写的提示：" +e);
        }

    }
}
