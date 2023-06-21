package com.fucongzheng.popular;

public class RuntimeExample {
    /*
    这个示例代码展示了如何使用Java的Runtime类。

    首先，我们通过调用Runtime.getRuntime()方法获取当前运行时对象的实例。

    然后，我们使用availableProcessors()方法获取处理器核心数，并将其打印输出。

    接下来，我们使用maxMemory()方法获取最大内存量（以字节为单位），并使用freeMemory()方法获取可用的空闲内存量（以字节为单位）。然后，我们将这些信息打印输出。

    在示例中，我们还展示了如何使用exec()方法执行操作系统命令。我们通过runtime.exec("ls -l")执行了一个简单的"ls -l"命令。然后，
    我们使用waitFor()方法等待命令执行完成，并获取退出代码。最后，我们将退出代码打印输出。

    Java的Runtime类还提供了其他方法来与运行时环境进行交互，例如启动新进程、加载动态库等。可以根据具体需求使用相应的方法。

    需要注意的是，Runtime类的使用需要谨慎，特别是在执行操作系统命令时。确保只执行可信的命令并适当处理可能的异常情况。
     */
    public static void main(String[] args) {
        // 获取当前运行时对象
        Runtime runtime = Runtime.getRuntime();

        // 获取处理器核心数
        int cores = runtime.availableProcessors();
        System.out.println("CPU Cores: " + cores);

        // 获取最大内存量（以字节为单位）
        long maxMemory = runtime.maxMemory();
        System.out.println("Max Memory: " + maxMemory + " bytes");

        // 获取空闲内存量（以字节为单位）
        long freeMemory = runtime.freeMemory();
        System.out.println("Free Memory: " + freeMemory + " bytes");

        // 执行操作系统命令
        try {
            Process process = runtime.exec("ls -l");
            int exitCode = process.waitFor();
            System.out.println("Exit Code: " + exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
