package com.fucongzheng.method;

import java.util.Scanner;

public class final_homework {
    /*
    计算器实现
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入您要进行的计算方式:");
        String s = scanner.nextLine();
        System.out.print("请输入数字进行计算:");
        int i = scanner.nextInt();
        int i2 = scanner.nextInt();
        switch (s) {
            case "加":

                System.out.println("计算结果为："+add(i,i2));;
                break;
            case "减":

                System.out.println("计算结果为："+subtracts(i,i2));;
                break;
            case "乘":
//                System.out.print("请输入数字进行计算:");
                System.out.println("计算结果为："+ride(i,i2));;
                break;
            case "除":
//                System.out.print("请输入数字进行计算:");
                System.out.println("计算结果为："+divide(i,i2));;
                break;
            default:
                System.out.println("没有您要的计算方式");
        }

    }

    public static double add(double... number) {
        if (number.length == 0) {
            System.out.println("please input two numbers!");
            return 0;
        }
        double result = number[0];
        for (int i = 1; i < number.length; i++) {
            result += number[i];
        }
        return result;
    }

    public static double subtracts(double... number) {
        if (number.length == 0) {
            System.out.println("please input two numbers!");
            return 0;
        }
        double result = number[0];
        for (int i = 1; i < number.length; i++) {
            result = result - number[i];
        }
        return result;
    }

    public static double ride(double... number) {
        if (number.length == 0) {
            System.out.println("please input two numbers!");
            return 0;
        }
        double result = number[0];
        ;
        for (int i = 1; i < number.length; i++) {
            result *= number[i];
        }
        return result;
    }

    public static double divide(double... number) {
        if (number.length == 0) {
            System.out.println("please input two numbers!");
            return 0;
        }
        double result = number[0];
        for (int i = 1; i < number.length; i++) {
            result = result / number[i];
        }
        return result;
    }
}
