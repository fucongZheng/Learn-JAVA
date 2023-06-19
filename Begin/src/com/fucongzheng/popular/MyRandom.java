package com.fucongzheng.popular;

import java.util.Arrays;
import java.util.Random;

public class MyRandom {
    public static void main(String[] args) {
        /*
        Random类位于java.util包下，此类的实例用于生成伪随机数流。之所以称之为伪随机，
        是因为真正意义上的随机数（或者称为随机事件）在某次产生过程中是按照实验过程表现的分布概率随机产生的，
        其结果是不可预测，不可见的。而计算机中的随机函数是按照一定的算法模拟产生的，其结果是确定的，可见的。我们认为这样产生的数据不是真正意义上的随机数，因而称之为伪随机。

         */
        //生成随机整数：
        Random random = new Random();
        int randomNumber = random.nextInt();
        System.out.println("随机整数：" + randomNumber);

        //生成指定范围内的随机整数：

        int min = 10;
        int max = 20;
        int randomInRange = random.nextInt(max - min + 1) + min;
        System.out.println("随机范围内的整数：" + randomInRange);

        //生成随机浮点数：

        double randomDouble = random.nextDouble();
        System.out.println("随机浮点数：" + randomDouble);


        //生成随机布尔值：

        boolean randomBoolean = random.nextBoolean();
        System.out.println("随机布尔值：" + randomBoolean);

        //生成随机字节数组：

        byte[] randomBytes = new byte[5];
        random.nextBytes(randomBytes);
        System.out.println("随机字节数组：" + Arrays.toString(randomBytes));
        //设置随机数种子：
        Random random1 = new Random(123456); // 使用种子12345初始化Random对象
        int randomNumbers = random1.nextInt();
        System.out.println("使用种子生成的随机数：" + randomNumbers);


    }
}
