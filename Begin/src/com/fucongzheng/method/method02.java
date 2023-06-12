package com.fucongzheng.method;

public class method02 {
    /*
    命令行运行Java文件
    javac demo.java
    java demo
     */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
