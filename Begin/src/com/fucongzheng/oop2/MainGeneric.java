package com.fucongzheng.oop2;

public class MainGeneric {
    /*
    这个示例代码展示了如何定义和使用泛型接口。首先，我们定义了一个名为MyGenericInterface<T>的泛型接口，其中T是一个类型参数。接口包含一个抽象方法processData()，它接受一个类型为T的输入并返回相同类型的结果。

然后，我们创建了一个实现了泛型接口MyGenericInterface的类MyGenericInterfaceImpl<T>。在该类中，我们实现了processData()方法来对输入进行处理，并将其原样返回。

在Main类的main()方法中，我们首先创建了一个MyGenericInterface<String>的实例，使用字符串类型作为类型参数，然后调用processData()方法并打印结果。接着，我们创建了一个MyGenericInterface<Integer>的实例，使用整数类型作为类型参数，并同样调用processData()方法并打印结果。
     */
    public static void main(String[] args) {
        MyGenericInterface<String> stringProcessor = new MyGenericInterfaceImpl<>();
        String result = stringProcessor.processData("Hello");
        System.out.println("处理结果：" + result);  // 输出结果：处理结果：Hello

        MyGenericInterface<Integer> integerProcessor = new MyGenericInterfaceImpl<>();
        Integer number = integerProcessor.processData(10);
        System.out.println("处理结果：" + number);  // 输出结果：处理结果：10
    }
}
