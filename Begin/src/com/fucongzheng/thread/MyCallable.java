package com.fucongzheng.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
/*
在上述代码中，我们创建了一个实现了Callable接口的类MyCallable。
call()方法定义了线程要执行的任务逻辑，并返回一个结果。在本例中，简单地返回一条消息。
在main方法中，我们创建了一个MyCallable类的实例callable，然后将该实例封装到FutureTask对象中。
接下来，将FutureTask对象传递给Thread的构造函数来创建一个线程对象thread。
最后，调用start()方法启动线程，并使用futureTask.get()方法获取线程执行的结果。
使用Callable和Future允许我们在多线程任务中返回结果或抛出异常，并且可以通过Future对象获取异步线程的执行结果。这种方式更加灵活，同时也提供了更多操作线程的能力。

需要注意的是，futureTask.get()方法是一个阻塞调用，如果线程尚未完成执行，它会等待线程执行完毕再返回结果。这可能导致主线程被阻塞，直到子线程执行完成。
 */
public class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
        // 线程要执行的任务逻辑
        return "MyCallable is running";
        }

        public static void main(String[] args) {
        MyCallable callable = new MyCallable(); // 创建实现了Callable接口的对象
        FutureTask<String> futureTask = new FutureTask<>(callable); // 将Callable对象封装到FutureTask中
        Thread thread = new Thread(futureTask); // 将FutureTask对象传递给Thread构造函数
        thread.start(); // 启动线程

        try {
        String result = futureTask.get(); // 获取线程执行结果
        System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
        }
    }
}
