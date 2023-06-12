package com.fucongzheng.method;

public class whatismethod {
    public static void main(String[] args) {
        /*
        什么是方法,方法只完成一个功能，利于后期扩展
        方法的定义和调用
            方法包含一个方法头和方法体
               修饰符
               返回值类型
               方法名
               参数类型
               方法体
            修饰符 返回值类型 方法名（参数类型 参数名）{
            方法体
            }
        方法重载
        命令行传参
        可变参数
        递归
         */
        int sum = add(1, 2);
        System.out.println(sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
