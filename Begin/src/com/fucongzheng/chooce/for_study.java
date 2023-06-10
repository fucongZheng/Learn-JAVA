package com.fucongzheng.chooce;

public class for_study {
    public static void main(String[] args) {
        /*
        for
         */
        int a = 1;

        for (int i =1 ;i<=100;i++){
            System.out.println(i+a);
        }

        for (int x =0;x<=1000;x++){
            if (x%5==0){
                System.out.print(x +"\t");
            }
            if(x%15==0){
                System.out.println();
            }
        }
    }
}
