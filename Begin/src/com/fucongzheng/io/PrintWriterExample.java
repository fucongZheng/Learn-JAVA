package com.fucongzheng.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
    /*
    上述示例中，我们使用System.out创建了一个PrintStream对象来输出到控制台。然后，我们使用println()方法分别输出整数和字符串。

在第二个示例中，我们创建了一个PrintWriter对象，并将其初始化为使用FileWriter来写入指定路径下的文件。然后，我们使用println()方法将整数和字符串写入文件中。

需要注意的是，打印流的println()方法可以接受不同类型的参数，并自动处理类型转换和格式化输出。

在实际应用中，您可以根据需要选择使用PrintStream或PrintWriter，并结合相应的输出目标（如控制台或文件）来输出文本数据。
     */
    public static void main(String[] args) {
        try {
            // 创建PrintWriter对象，指定要写入的文件路径
            PrintWriter printWriter = new PrintWriter(new FileWriter("path/to/file.txt"));

            int number = 42;
            String text = "Hello, World!";

            // 使用打印流写入整数和字符串
            printWriter.println(number);
            printWriter.println(text);

            printWriter.close(); // 关闭打印流
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
