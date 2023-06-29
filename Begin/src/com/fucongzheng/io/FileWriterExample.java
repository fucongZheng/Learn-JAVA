package com.fucongzheng.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    //在上述示例中，我们创建了一个FileWriter对象来写入指定路径下的文本文件。然后，我们使用write()方法将内容（"Hello, World!"）写入文件中。最后，我们通过调用close()方法关闭FileWriter以释放资源。
    //
    //需要注意的是，如果指定的文件不存在，FileWriter会创建一个新的文件；如果文件已存在，FileWriter会覆盖原有内容。如果希望追加内容而不是覆盖，请考虑使用FileWriter的另一个构造函数或者使用FileWriter的append()方法。
    public static void main(String[] args) {
        try {
            // 创建FileWriter对象，指定要写入的文件路径
            FileWriter writer = new FileWriter("path/to/file.txt");

            String content = "Hello, World!";

            // 将内容写入文件
            writer.write(content);

            writer.close(); // 关闭文件写入器
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
