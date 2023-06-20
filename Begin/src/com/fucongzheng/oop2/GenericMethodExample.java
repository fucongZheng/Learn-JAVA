package com.fucongzheng.oop2;

public class GenericMethodExample {
    /*
    这个示例代码展示了如何定义和使用泛型方法。在GenericMethodExample类中，我们定义了一个名为printArray()的泛型方法。该方法接受一个泛型数组作为参数，并遍历数组将每个元素打印输出。

    在泛型方法的定义中，我们使用了类型参数<T>来表示可以适用于任意类型的数据。通过在方法返回类型之前放置类型参数，我们可以在方法中使用这个类型参数，并对传入的数据进行通用操作。

    在main()方法中，我们创建了不同类型的数组：Integer[]、Double[]和String[]。然后，我们分别调用printArray()方法，并传入这些不同类型的数组作为参数，从而实现了对不同类型数组的打印输出。
     */
    // 定义一个泛型方法
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 调用泛型方法并传入不同类型的数组
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"Hello", "World"};

        System.out.println("整数数组：");
        printArray(intArray);  // 输出结果：1 2 3 4 5

        System.out.println("双精度数组：");
        printArray(doubleArray);  // 输出结果：1.1 2.2 3.3 4.4 5.5

        System.out.println("字符串数组：");
        printArray(stringArray);  // 输出结果：Hello World
    }
    //通过泛型方法，我们可以编写能够适应不同类型数据的通用处理逻辑，提高代码的灵活性和可重用性。泛型方法使得我们能够在单个方法中处理多种类型的数据，避免了重复编写类似的方法逻辑。

    //public static <T extends Person>method(<T> t){      这个泛型方法限定了类型
    // }

    //public static method(<? extends Person> t){}
}
