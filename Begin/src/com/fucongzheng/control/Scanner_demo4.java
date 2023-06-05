package com.fucongzheng.control;

import java.util.Scanner;

public class Scanner_demo4 {
    public static void main(String[] args) {
        //demand  输入多个数字，计算其综合和平均值
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double result = 0;
        double avg = 0;
        System.out.print("请输入多个数字（输入非数字就会结束程序）：");
        while (true){
            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                result +=i;
                count++;
            } else if(scanner.hasNextFloat()){
                float f = scanner.nextFloat();
                result+=f;
                count++;
            } else {
                System.out.println("你一共输入了： "+count + "个数！");
                System.out.println("输入的数总和为:"+result);
                if (count==0){
                    System.out.println("数平均值为:"+avg);
                    break;
                }
                avg = result / count;
                System.out.println("输入的数平均值为:"+avg);
                break;
            }

        }
        scanner.close();
    }

}
