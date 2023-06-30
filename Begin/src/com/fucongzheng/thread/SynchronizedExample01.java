package com.fucongzheng.thread;

public class SynchronizedExample01 {
    //同步方法示例：
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
