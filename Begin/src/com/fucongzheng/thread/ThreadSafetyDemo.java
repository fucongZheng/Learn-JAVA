package com.fucongzheng.thread;
/*
在上述代码中，我们定义了一个静态变量 counter 来表示计数器。然后创建了两个线程 CounterThread，它们都对 counter 进行自增操作。

由于 counter++ 不是原子操作，它包含读取、自增和写入三个步骤。在多线程环境下，一种典型的线程安全问题是竞态条件（Race Condition），
即两个线程同时读取相同的 counter 值，然后各自进行自增操作，并最终写回 counter 的值。这可能导致结果不正确，因为每个线程只会看到其中一个线程的自增操作。

运行这个程序，每次输出的 Counter 值可能都不同，且不等于预期的 20000。这演示了线程安全问题，因为多个线程并发修改共享变量时没有进行合适的同步控制，导致结果的不确定性。

要解决这个线程安全问题，可以使用同步机制（如synchronized关键字）或使用原子类（如AtomicInteger）来确保对 counter 的操作是原子的，从而避免竞态条件和线程安全问题。
 */
public class ThreadSafetyDemo {
    private static int counter = 0;

    public static void main(String[] args) {
        // 创建两个线程并启动
        Thread thread1 = new CounterThread();
        Thread thread2 = new CounterThread();
        thread1.start();
        thread2.start();

        try {
            // 等待两个线程执行完毕
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter: " + counter);
    }

    static class CounterThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                // 对共享变量进行非原子操作，可能导致线程安全问题
                counter++;
            }
        }
    }
}
