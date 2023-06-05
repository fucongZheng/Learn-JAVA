package com.fucongzheng.control;

import java.util.Scanner;

public class Scanner_demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        System.out.println("请输入数字系统帮忙进行求和和求平均值！");
        while (scanner.hasNextDouble()){
            double v = scanner.nextDouble();
            sum += v;
            count++;
        }
        System.out.println("你输入了"+count+"个数;总和为："+sum);
        if (count==0){
            System.out.println("你输入了"+count+"个数;平均值为：0");
        }else {System.out.println("你输入了"+count+"个数;平均值为："+sum/count);}

        scanner.close();

    }
}
