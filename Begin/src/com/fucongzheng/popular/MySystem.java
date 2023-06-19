package com.fucongzheng.popular;

import java.util.Arrays;
import java.util.Scanner;

public class MySystem {
    public static void main(String[] args) {
        /*
        Java的System类提供了一系列与系统操作和资源访问相关的静态方法。以下是对Java的System类的一些常用方法的代码介绍
         */
        //获取当前时间：
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        //复制数组：
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        System.out.println(Arrays.toString(destinationArray));
        //获取环境变量：
        String javaHome = System.getenv("JAVA_HOME");

        //终止程序的执行：
//        System.exit(0);

        //获取系统属性：
        String osName = System.getProperty("os.name");
        System.out.println(osName);
        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);
        //标准输入输出：
        Scanner scanner = new Scanner(System.in);  // 读取控制台输入
        System.out.println("Hello, World!");  // 输出到控制台
        System.err.println("Error message");  // 输出错误信息到控制台  红色的字

        //加载本地库：
        System.loadLibrary("myLibrary");  // 加载名为"myLibrary"的本地库文件

    }
}
