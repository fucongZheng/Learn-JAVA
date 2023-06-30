package com.fucongzheng.thread;
//在上述代码中，我们创建了一个实现了 Runnable 接口的类 MyRunnable。
//在 run() 方法中定义了线程要执行的任务逻辑，在本例中也是简单地输出一条消息。
//在 main 方法中，我们创建了一个 MyRunnable 类的实例 runnable，然后将该对象传递给 Thread 的构造函数来创建一个线程对象 thread。
//最后，调用 start() 方法启动线程。
public class MyRunnable implements Runnable {
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
        MyRunnable runnable = new MyRunnable(); // 创建实现了Runnable接口的对象
        Thread thread = new Thread(runnable); // 将Runnable对象传递给Thread构造函数
        thread.start(); // 启动线程

        for (int i = 1; i <= 5; i++) {
            System.out.println("主Thread: " + i);
        }
    }
}