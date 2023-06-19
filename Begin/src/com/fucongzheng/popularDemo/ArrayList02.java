package com.fucongzheng.popularDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {
    private ArrayList<Array01> foodList = new ArrayList<>();

    public void add(){
        Array01 array01 = new Array01();

        Scanner in = new Scanner(System.in);
        System.out.print("请输入商品名称：");
        String s = in.next();
        array01.setName(s);
        System.out.print("请输入商品价格：");
        double v = in.nextDouble();
        array01.setPrice(v);
        System.out.print("请输入商品描述：");
        String s1 = in.next();
        array01.setDec(s1);

        foodList.add(array01);

    }

    public void showFood(){
        if (foodList.size() == 0){
            System.out.println("当前还没有任何菜，请先添加");
            return;
        }
        for (Array01 food:foodList
             ) {
            System.out.println(food.getName() + "：这道菜是"+ food.getDec() + "，它的价格是" +food.getPrice() + "dollars");
        }
    }
    public void start(){
        Scanner in = new Scanner(System.in);
        System.out.println("---------欢迎光临菜单管理--------------");
        while (true){
            System.out.println("请选择您要的操作方法:输入1添加菜谱、输入2展示已有菜单、输入3退出程序!");
            String next = in.next();
            switch (next){
                case "1":
                    add();
                    break;
                case "2":
                    showFood();
                    break;
                case "3":
                    return ;
                default:
                    System.out.println("您输入的指令不对！请检查");
           }
        }
    }
}
