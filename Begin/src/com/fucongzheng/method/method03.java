package com.fucongzheng.method;

public class method03 {
    /*
    可变参数 在指定参数类型后面加一个省略号...
    在这个案例中，printStrings() 方法使用可变参数 String... strings 来接收不定数量的字符串，并逐个打印出来。

    使用可变参数使得方法调用更加灵活，可以传递任意数量的参数。你可以根据实际需求定义接受不同类型和数量参数的方法，并在调用时传入相应的参数。

     */
    public static void main(String[] args) {
        method03 method03 = new method03();
        method03.method(2, 3, 4, 5, 6);

        printStrings("Hello", "World"); // 输出：Hello\nWorld

        printStrings("Java", "is", "awesome!"); // 输出：Java\nis\nawesome!

    }

    public void method(int... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
    public static void printStrings(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
