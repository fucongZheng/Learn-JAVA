package com.fucongzheng.collection;

import java.util.ArrayList;
import java.util.List;
/*
假设你是一个图书管理员，负责管理图书馆中的图书。请设计一个程序，使用集合来实现以下功能：

添加图书到图书馆。
从图书馆移除图书。
显示当前图书馆中的所有图书。
检查某本书是否存在于图书馆中。
要求：

使用合适的集合类来存储图书。
为图书定义一个简单的类，包括书名和作者等属性。
请编写 Java 代码实现上述功能，并在主函数中进行测试。
 */

class Book{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
public class LibraryManager {
    private List<Book> books;

    public LibraryManager(){
        books = new ArrayList<>();
    }

    public void addBooks(Book book){
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }
    public void displayBooks(){
        System.out.println("Books in the library:");
        for (Book book:books
             ) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
    public void removeBook(Book book){
        if (books.remove(book)){
            System.out.println("Removed book: " + book.getTitle());
        }else {
            System.out.println("Book not found: " + book.getTitle());
        }
    }
    public boolean checkBookExists(Book book){
        return books.contains(book);
    }

    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        // 添加图书
        Book book1 = new Book("Java Programming", "John Smith");
        library.addBooks(book1);

        Book book2 = new Book("Python Basics", "Jane Doe");
        library.addBooks(book2);

        library.displayBooks();

        Book book3 = new Book("C++ Fundamentals", "Alice Johnson");
        library.addBooks(book3);
        boolean exists = library.checkBookExists(book3);
        System.out.println("Book 'C++ Fundamentals' exists: " + exists);

        library.removeBook(book2);

        // 再次显示所有图书
        library.displayBooks();

    }
}
