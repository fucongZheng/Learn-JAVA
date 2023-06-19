package com.fucongzheng.popular;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MyBigDecimal {
    public static void main(String[] args) {
        /*
        Java的BigDecimal类是用于精确计算和表示任意精度的十进制数的类。它提供了高精度的数值操作和运算。以下是对Java的BigDecimal类的代码介绍：
         */
        //创建BigDecimal对象：
        BigDecimal number = new BigDecimal("10.5");  // 使用字符串初始化BigDecimal对象
        BigDecimal anotherNumber = BigDecimal.valueOf(20.3);  // 使用double类型的值初始化BigDecimal对象
        //基本运算操作：
        BigDecimal result = number.add(anotherNumber);  // 加法
        System.out.println(result);
        BigDecimal result1 = number.subtract(anotherNumber);  // 减法
        System.out.println(result1);
        BigDecimal result2 = number.multiply(anotherNumber);  // 乘法
        System.out.println(result2);
//        BigDecimal result3 = number.divide(anotherNumber);  // 除法
//        System.out.println(result3);

        //精度设置：
        BigDecimal result4 = number.setScale(2, RoundingMode.HALF_UP);  // 设置小数点后保留2位，采用四舍五入的方式
        System.out.println(result4);//10.50
        //比较操作：
        int comparison = number.compareTo(anotherNumber);  // 比较两个BigDecimal对象的大小，返回-1、0或1
        System.out.println(comparison);
        boolean isEqual = number.equals(anotherNumber);  // 判断两个BigDecimal对象是否相等
        System.out.println(isEqual);
        //其他常用方法：
        BigDecimal absValue = number.abs();  // 返回BigDecimal对象的绝对值
        int scale = number.scale();  // 返回BigDecimal对象的小数位数
        BigDecimal roundedValue = number.round(new MathContext(2));  // 对BigDecimal对象进行四舍五入操作，并指定精度



    }
}
