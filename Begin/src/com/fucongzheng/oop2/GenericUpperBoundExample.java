package com.fucongzheng.oop2;

public class GenericUpperBoundExample<T extends Number> {
    /*
    泛型上界 讲解

    通过使用泛型上界，我们限制了类型参数必须是指定的上界类型或其子类。这样可以确保在使用泛型类时，只能传递符合约束条件的类型参数。如果尝试将不符合上界要求的类型作为类型参数，将在编译时产生错误。

    这个示例代码展示了如何使用泛型上界。在GenericUpperBoundExample<T>类中，我们定义了一个泛型类，并使用T extends Number来指定类型参数的上界为Number类或其子类。

    在类内部，我们声明了一个私有变量data，其类型为T。通过构造函数和访问方法，我们可以初始化并获取该数据。

    在main()方法中，我们首先创建了一个GenericUpperBoundExample<Integer>对象，使用整数类型作为类型参数，并调用getData()方法来获取整数值并打印输出。
    接着，我们创建了一个GenericUpperBoundExample<Double>对象，使用双精度类型作为类型参数，并同样调用getData()方法来获取双精度值并打印输出。
     */
    private T data;

    public GenericUpperBoundExample(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public static void main(String[] args) {
        // 创建泛型类对象，使用Integer类型作为上界
        GenericUpperBoundExample<Integer> integerExample = new GenericUpperBoundExample<>(10);
        int intValue = integerExample.getData();
        System.out.println("整数值：" + intValue);  // 输出结果：整数值：10

        // 创建泛型类对象，使用Double类型作为上界
        GenericUpperBoundExample<Double> doubleExample = new GenericUpperBoundExample<>(3.14);
        double doubleValue = doubleExample.getData();
        System.out.println("双精度值：" + doubleValue);  // 输出结果：双精度值：3.14

         //创建泛型类对象，尝试使用String类型作为上界（编译错误）
        //请注意，在示例代码中，我们尝试将String类型作为类型参数传递给GenericUpperBoundExample类，但由于String不是Number类或其子类，所以会导致编译错误。
//         GenericUpperBoundExample<String> stringExample = new GenericUpperBoundExample<>("Hello");
    }
}
