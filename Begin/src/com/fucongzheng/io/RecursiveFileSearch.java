package com.fucongzheng.io;

import java.io.File;

public class RecursiveFileSearch {
    //使用递归方式查找文件的示例代码
    public static void main(String[] args) {
        String directoryPath = "C:/Users/Administrator/Desktop/工作/雪花人事流程"; // 指定要搜索的目录路径
        String targetFileName = "总部单个.xlsx"; // 要查找的目标文件名

        File directory = new File(directoryPath);
        searchFile(directory, targetFileName);
    }

    public static void searchFile(File directory, String targetFileName) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        // 递归调用以搜索子目录
                        searchFile(file, targetFileName);
                    } else {
                        if (file.getName().equals(targetFileName)) {
                            System.out.println("Found file: " + file.getAbsolutePath());
                        }
                    }
                }
            }
        }
    }
}
