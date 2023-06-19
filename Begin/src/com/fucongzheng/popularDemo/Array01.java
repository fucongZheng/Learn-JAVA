package com.fucongzheng.popularDemo;

import java.util.Scanner;

public class Array01 {
    private String name;
    private double price;
    private String dec;
    private  final Scanner in = new Scanner(System.in);

    public Array01(String name, double price, String dec) {
        this.name = name;
        this.price = price;
        this.dec = dec;
    }

    public Array01() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        boolean flag = true;
        double p = price;
        while (flag) {
            if (p == 0 || p< 0) {
                System.out.println("this price is 0 dollar!");
                System.out.print("请重新输入商品价格：");
                p = in.nextDouble();
            } else {
                this.price = p;
                flag = false;
            }

        }

    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }
}
