package com.fucongzheng.chooce;

public class stop_loop {
    /*
    break continue goto
     */
    public static void main(String[] args) {
        int i =0;
        while(i<100){
            i++;
            System.out.println(i);
            if (i==30){
                break;
            }
        }
        System.out.println("1111");

        System.out.println("----------");
        int count = 0;
        outer:for (int a=101;a<150;a++){
            for (int b = 2;b<a/2;b++){
                if (a%b==0){
                continue outer;}
            }
        }
        System.out.println(i+"");
    }
}