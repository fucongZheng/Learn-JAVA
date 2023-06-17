package com.fucongzheng.popular;

public class MyString {
    public static void main(String[] args) {
        /*
        String 变量是不可变字符串
         */
        //方式一
        String name = "china";

        name += " is a";
        name += " beautiful";
        name += " country";

        System.out.println(name);
        //方式二
        String s = new String();
        //方式三
        char[] car = {'a','b','重','楼'};
        String s1 = new String(car);
        System.out.println(s1);
        //方式四
        byte[] by = {97, 98, 99};
        String s2 = new String(by);
        System.out.println(s2);


    }
}
