package com.fucongzheng.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {
    /*
    在上述代码中，我们创建了一个 ThreadPoolExecutor 对象，并指定了核心线程数、最大线程数、线程空闲时间以及队列类型。这里使用了一个有界阻塞队列 ArrayBlockingQueue 来存储任务。

    然后，通过 execute() 方法向线程池提交任务。本例中，我们提交了10个任务，每个任务都是实现了 Runnable 接口的 MyTask 对象。

    线程池会自动管理和分配线程来执行这些任务。每个任务在执行时会打印相关信息，并模拟耗时操作。最后，通过调用 shutdown() 方法关闭线程池。
     */
    public static void main(String[] args) {
        int corePoolSize = 2; // 核心线程数
        int maxPoolSize = 5; // 最大线程数
        long keepAliveTime = 1; // 线程空闲时间
        int taskCount = 10; // 任务数量

        // 创建线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                corePoolSize, maxPoolSize, keepAliveTime,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(taskCount));

        // 提交任务给线程池执行
        for (int i = 0; i < taskCount; i++) {
            Runnable task = new MyTask1(i);
            executor.execute(task);
        }

        // 关闭线程池
        executor.shutdown();
    }
}

class MyTask1 implements Runnable {
    private int taskId;

    public MyTask1(int taskId) {
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
