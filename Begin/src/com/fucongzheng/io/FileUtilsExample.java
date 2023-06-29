package com.fucongzheng.io;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileUtilsExample {
    //Commons IO库提供了丰富的工具类和函数，用于简化Java IO操作。下面是一些常见的使用示例来演示Commons IO库的具体用法
    public static void main(String[] args) {
        // 复制文件
        try {
            FileUtils.copyFile(new File("source.txt"), new File("destination.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

// 删除目录及其内容
        try {
            FileUtils.deleteDirectory(new File("directory"));
        } catch (IOException e) {
            e.printStackTrace();
        }

// 读取文件内容到字符串
        try {
            String fileContent = FileUtils.readFileToString(new File("file.txt"), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        // 使用通配符过滤文件
//        File[] files = new File("/path/to/directory").listFiles(FileFilterUtils.wildcardFileFilter("*.txt"));
//
//        // 使用后缀名过滤文件
//        File[] files1 = new File("/path/to/directory").listFiles(FileFilterUtils.suffixFileFilter(".java"));
//        Charset charset = Charsets.detect(new FileInputStream("file.txt"));
//
//// 将字符串按指定字符集编码为字节数组
//        byte[] bytes = "Hello".getBytes(Charsets.UTF_8);
    }
}
