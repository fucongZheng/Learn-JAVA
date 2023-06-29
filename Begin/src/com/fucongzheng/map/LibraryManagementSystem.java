package com.fucongzheng.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/*
以下是一个案例题，旨在帮助巩固你对 Java Map 集合的知识：

考虑一个图书馆的图书管理系统。每本图书都有唯一的 ISBN 号码和对应的书名。设计一个程序，使用 Map 集合来管理图书信息，并实现以下功能：

添加图书：根据给定的 ISBN 号码和书名，将图书添加到图书馆中。
删除图书：根据给定的 ISBN 号码，从图书馆中删除相应的图书。
查找图书：根据给定的 ISBN 号码，查询图书馆中相应图书的书名。
显示所有图书：打印出图书馆中所有图书的 ISBN 号码和书名。
请编写 Java 代码来实现上述功能，并进行测试验证。
 */

public class LibraryManagementSystem {
    private Map<String, String> bookLibrary;

    public LibraryManagementSystem() {
        bookLibrary = new LinkedHashMap<>();
    }
    public void addBook(String isbn, String bookName) {
        bookLibrary.put(isbn, bookName);
    }

    public void removeBook(String isbn) {
        bookLibrary.remove(isbn);
    }

    public String findBook(String isbn) {
        return bookLibrary.get(isbn);
    }

    public void displayAllBooks() {
//        for (Map.Entry<String, String> entry : bookLibrary.entrySet()) {
//            String isbn = entry.getKey();
//            String bookName = entry.getValue();
//            System.out.println("ISBN: " + isbn + ", Book Name: " + bookName);
//        }
        bookLibrary.forEach((key, value) -> System.out.println("ISBN: " + key + ", Book Name: " + value));
    }

    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // 添加图书
        library.addBook("ISBN001", "Java Programming");
        library.addBook("ISBN002", "Python Basics");
        library.addBook("ISBN003", "Data Structures");

        // 显示所有图书
        System.out.println("----- All Books -----");
        library.displayAllBooks();

        // 删除图书
        library.removeBook("ISBN001");

        // 查找图书
        String bookName = library.findBook("ISBN002");
        System.out.println("Book Name: " + bookName);
    }
}
