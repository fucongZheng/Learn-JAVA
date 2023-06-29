package com.fucongzheng.io;

import java.io.File;
import java.io.IOException;

public class FileExample {
    /*
    Java 中的 java.io.File 类提供了许多常用方法，用于操作文件和目录。以下是 File 类的一些常用方法：

    创建文件或目录：

    boolean createNewFile(): 创建一个新的文件，如果文件已经存在，则返回 false。
    boolean mkdir(): 创建一个新的目录。
    boolean mkdirs(): 创建一个新的目录，并创建所有不存在的父目录。
    文件和目录信息获取：

    String getName(): 获取文件或目录的名称。
    String getPath(): 获取文件或目录的路径。
    String getAbsolutePath(): 获取文件或目录的绝对路径。
    boolean exists(): 判断文件或目录是否存在。
    boolean isFile(): 判断是否为文件。
    boolean isDirectory(): 判断是否为目录。
    long lastModified(): 获取文件或目录的最后修改时间。
    long length(): 获取文件的大小（字节数）。
    文件和目录操作：

    boolean delete(): 删除文件或目录。
    boolean renameTo(File dest): 将文件或目录重命名为指定的名称。
    String[] list(): 获取目录下所有文件和子目录的名称数组。
    File[] listFiles(): 获取目录下所有文件和子目录的 File 对象数组。
    其他常用方法：

    boolean canRead(): 检查文件或目录是否可读。
    boolean canWrite(): 检查文件或目录是否可写。
    boolean isHidden(): 检查文件或目录是否被隐藏。
     */
    public static void main(String[] args) {
        // 创建文件对象
        File file = new File("path/to/file.txt");

        try {
            // 创建新文件
            boolean created = file.createNewFile();
            System.out.println("File created: " + created);
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // 创建目录对象
        File directory = new File("path/to/directory");

        // 创建新目录
        boolean createdDir = directory.mkdir();
        System.out.println("Directory created: " + createdDir);
    }
}
