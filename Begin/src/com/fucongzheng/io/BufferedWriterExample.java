package com.fucongzheng.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    /*
    在上述示例中，我们首先创建一个FileWriter对象来写入指定路径下的文本文件，然后将其作为参数传递给BufferedWriter的构造函数。这样可以将缓冲区添加到文件写入过程中，提高写入效率。

    随后，我们使用write()方法将内容（"Hello, World!"）写入文件中。由于使用了缓冲区，实际的写入操作可能会在调用close()方法时才执行。如果需要立即写入，可以调用flush()方法刷新缓冲区。

    最后，我们通过调用close()方法关闭BufferedWriter以释放资源。需要注意的是，BufferedWriter的close()方法会自动关闭底层的FileWriter，因此我们不需要单独关闭FileWriter对象。

    使用BufferedWriter可以提高写入文本文件的效率，特别是在处理大量数据时。它还提供了其他方法，如newLine()用于写入换行符，以及flush()用于手动刷新缓冲区等。
     */
    public static void main(String[] args) {
        try {
            // 创建FileWriter对象，指定要写入的文件路径
            FileWriter fileWriter = new FileWriter("path/to/file.txt");

            // 创建BufferedWriter对象，将FileWriter作为参数传递
            BufferedWriter writer = new BufferedWriter(fileWriter);

            String content = "Hello, World!";

            // 将内容写入文件
            writer.write(content);

            writer.close(); // 关闭文件写入器
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
