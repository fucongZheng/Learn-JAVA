package com.fucongzheng.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
    /*
    这段代码创建了一个固定大小为5的线程池，然后使用循环提交了10个任务给线程池执行。
    每个任务都是一个MyTask对象，实现了Runnable接口，其中的run方法定义了任务的具体逻辑。在示例中，任务只是简单地打印出当前任务的ID。

    最后，通过调用executor.shutdown()方法来关闭线程池。请注意，在调用shutdown之后，线程池将不再接受新的任务，但会等待已经提交的任务执行完毕。
     */
    public static void main(String[] args) {
        // 创建一个固定大小为5的线程池
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // 提交10个任务给线程池执行
        for (int i = 0; i < 10; i++) {
            MyTask task = new MyTask(i);
            executor.submit(task);
        }

        // 关闭线程池
        executor.shutdown();
    }

    static class MyTask implements Runnable {
        private int taskId;

        public MyTask(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskId + " is running.");
        }
    }
}

