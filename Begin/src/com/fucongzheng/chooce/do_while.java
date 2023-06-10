package com.fucongzheng.chooce;

public class do_while {
    public static void main(String[] args) {
        /*
        执行一次
         */
        int i =0;
        int sum =0;
        do{
            sum += i ;
            i++;
        }
        while (i<=100);
        System.out.println(sum);

        System.out.println("=======================");
        int a = 0;
        while (a<0){
            System.out.println(a);
            a++;
        }
        do {
            System.out.println(a);
            a++;
        }while (a<0);
    }
}
