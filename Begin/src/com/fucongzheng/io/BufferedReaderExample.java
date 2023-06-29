package com.fucongzheng.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    /*
    在上述示例中，我们首先创建一个FileReader对象来读取指定路径下的文本文件，然后将其作为参数传递给BufferedReader的构造函数。这样可以将缓冲区添加到文件读取过程中，提高读取效率。

随后，我们使用readLine()方法逐行读取文件内容，并将每一行打印到控制台上。当readLine()返回null时，表示已经到达文件末尾，循环结束。

最后，我们通过调用close()方法关闭BufferedReader以释放资源。需要注意的是，BufferedReader的close()方法会自动关闭底层的FileReader，因此我们不需要单独关闭FileReader对象。

使用BufferedReader可以提高读取文本文件的效率，特别是在处理大型文件时。它还提供了其他方法，如ready()用于检查流是否准备好进行读取，以及mark()和reset()用于在读取过程中标记和重置位置等
     */
    public static void main(String[] args) {
        try {
            // 创建FileReader对象，指定要读取的文件路径
            FileReader fileReader = new FileReader("path/to/file.txt");

            // 创建BufferedReader对象，将FileReader作为参数传递
            BufferedReader reader = new BufferedReader(fileReader);

            String line; // 用于存储读取的每一行内容

            // 循环读取文件中的每一行直到达到文件末尾
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // 打印读取的每一行内容
            }

            reader.close(); // 关闭文件读取器
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
