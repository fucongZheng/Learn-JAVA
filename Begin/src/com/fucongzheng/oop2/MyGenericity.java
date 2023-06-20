package com.fucongzheng.oop2;

public class MyGenericity<T> {
    /*
    泛型类   用E T V K

    通过使用泛型，我们可以创建能够存储不同类型数据的通用类。在实例化对象时，将具体的类型作为类型参数传递给泛型类，从而实现对特定类型数据的存储和操作。
    这个示例代码展示了如何在Java中使用泛型。我们创建了一个名为GenericExample<T>的泛型类，其中T是一个类型参数，表示泛型类型。在类内部，我们声明了一个私有变量data，其类型为T，并提供了相应的构造函数和访问方法。

在main()方法中，我们首先创建了一个GenericExample<Integer>对象来存储整数类型的数据，并通过getData()方法获取该数据并打印输出。接着，我们创建了一个GenericExample<String>对象来存储字符串类型的数据，并同样通过getData()方法获取该数据并打印输出。

通过使用泛型，我们可以创建能够存储不同类型数据的通用类。在实例化对象时，将具体的类型作为类型参数传递给泛型类，从而实现对特定类型数据的存储和操作。

请注意，在实际使用中，泛型还有其他更高级的应用，如通配符、上界和下界等概念，但以上示例提供了一个基本的泛型用法的了解。

public Demo<T extends Person>
public Demo1<E,T>
     */
    private T data;

    public MyGenericity(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public static void main(String[] args) {
        // 创建一个存储整数类型的GenericExample对象
        MyGenericity<Integer> integerExample = new MyGenericity<>(10);
        int intValue = integerExample.getData();
        System.out.println("整数值：" + intValue);  // 输出结果：整数值：10

        // 创建一个存储字符串类型的GenericExample对象
        MyGenericity<String> stringExample = new MyGenericity<>("Hello");
        String strValue = stringExample.getData();
        System.out.println("字符串值：" + strValue);  // 输出结果：字符串值：Hello
    }
}
