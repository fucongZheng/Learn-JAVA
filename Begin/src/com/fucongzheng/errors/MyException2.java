package com.fucongzheng.errors;

public class MyException2 extends Exception{
    private int detail;

    public MyException2(int detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "fucong tishi MyException2{" +
                "detail=" + detail +
                '}';
    }
}
