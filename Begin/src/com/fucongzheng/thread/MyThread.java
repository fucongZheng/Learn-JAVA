package com.fucongzheng.thread;
/*
在上述代码中，我们创建了一个自定义的线程类 MyThread 继承自 Thread 类。
在 run() 方法中定义了线程要执行的任务逻辑，在本例中简单地输出一条消息。
在 main 方法中，我们创建了 MyThread 类的一个实例 thread，然后调用 start() 方法来启动线程。
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        // 线程要执行的任务逻辑
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + i);
            try {
                Thread.sleep(100); // 暂停1秒钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread(); // 创建线程对象
        thread.start(); // 启动线程

        for (int i = 1; i <= 5; i++) {
            System.out.println("主Thread: " + i);
        }
    }
}
