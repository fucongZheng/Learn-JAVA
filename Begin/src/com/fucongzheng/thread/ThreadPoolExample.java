package com.fucongzheng.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    /*
    上述代码中，我们使用Executors.newFixedThreadPool()方法创建了一个固定大小为5的线程池。然后，我们通过execute()方法向线程池提交了10个任务，每个任务都是一个实现了Runnable接口的MyTask对象。

线程池会自动分配并管理线程来执行这些任务。每个任务在执行时都会打印出相关信息，并模拟耗时操作。最后，通过调用shutdown()方法关闭线程池。

使用线程池可以避免频繁地创建和销毁线程，提高系统性能和资源利用率。它还提供了任务队列、线程池大小控制、线程超时等功能，使得多线程编程更加方便和可控。
     */
    public static void main(String[] args) {
        // 创建固定大小的线程池
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // 提交任务给线程池执行
        for (int i = 0; i < 10; i++) {
            Runnable task = new MyTask(i);
            executor.execute(task);
        }

        // 关闭线程池
        executor.shutdown();
    }
}

class MyTask implements Runnable {
    private int taskId;

    public MyTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is executing.");

        // 模拟任务执行耗时
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Task " + taskId + " is completed.");
    }
}
