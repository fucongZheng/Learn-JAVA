package com.fucongzheng.popular;

public class MyMath {
    public static void main(String[] args) {
        //计算绝对值：
        int num = -5;
        int absNum = Math.abs(num);
        System.out.println("绝对值：" + absNum);  // 输出：绝对值：5
        //求两个数的最大值和最小值：
        int x = 10;
        int y = 20;
        int maxNum = Math.max(x, y);
        int minNum = Math.min(x, y);
        System.out.println("最大值：" + maxNum);  // 输出：最大值：20
        System.out.println("最小值：" + minNum);  // 输出：最小值：10

        //计算平方根：
        double number = 25;
        double sqrtValue = Math.sqrt(number);
        System.out.println("平方根：" + sqrtValue);  // 输出：平方根：5.0
        //计算幂运算：
        double base = 2;
        double exponent = 3;
        double result = Math.pow(base, exponent);
        System.out.println(base + "的" + exponent + "次幂：" + result);  // 输出：2.0的3.0次幂：8.0

        //四舍五入：
        double value = 3.7;
        long roundedValue = Math.round(value);
        System.out.println("四舍五入：" + roundedValue);  // 输出：四舍五入：4
        //random()方法是Java中Math类的一个静态方法，用于生成一个0到1之间的伪随机数。它的用法如下：
        double randomValue = Math.random();
        System.out.println(randomValue);
        int min = 10;
        int max = 20;
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println(randomInt);
    }
}
