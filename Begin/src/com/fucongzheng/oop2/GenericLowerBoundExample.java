package com.fucongzheng.oop2;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundExample<T> {
    /*
    泛型 下界
    这个示例代码展示了如何使用泛型下界。在GenericLowerBoundExample<T>类中，我们定义了一个泛型类，并使用List<? super T>来指定类型参数的下界为T的父类。

    在类内部，我们声明了一个私有变量list，其类型为List<? super T>。通过构造函数，我们可以传递具体的List对象并进行初始化。

    在addData()方法中，我们使用list.add(data)来添加数据到列表中。由于类型参数的下界是T的父类，所以可以安全地将T类型的元素添加到列表中。

    在main()方法中，我们首先创建了一个List<Number>对象，并将其作为参数传递给GenericLowerBoundExample<Number>类的实例。然后，我们使用addData()方法向列表中添加整数和双精度，并打印输出结果。

    接着，我们创建了一个List<Integer>对象，并将其作为参数传递给GenericLowerBoundExample<Integer>类的实例。然后，我们使用addData()方法向列表中添加整数，并同样打印输出结果。
     */
    private List<? super T> list;

    public GenericLowerBoundExample(List<? super T> list) {
        this.list = list;
    }

    public void addData(T data) {
        list.add(data);
    }

    public static void main(String[] args) {
        // 创建泛型类对象，使用Number类型作为下界
        List<Number> numberList = new ArrayList<>();
        GenericLowerBoundExample<Number> numberExample = new GenericLowerBoundExample<>(numberList);
        numberExample.addData(10);  // 添加整数
        numberExample.addData(3.14);  // 添加双精度
//        numberExample.addData("2");

        // 创建泛型类对象，使用Integer类型作为下界
        List<Integer> integerList = new ArrayList<>();
        GenericLowerBoundExample<Integer> integerExample = new GenericLowerBoundExample<>(integerList);
        integerExample.addData(20);  // 添加整数
//        integerExample.addData(1.2);

        System.out.println("Number列表：" + numberList);  // 输出结果：Number列表：[10, 3.14]
        System.out.println("Integer列表：" + integerList);  // 输出结果：Integer列表：[20]
        //通过使用泛型下界，我们限制了类型参数必须是指定的下界类型或其子类，从而确保在使用泛型类时，只能传递符合约束条件的类型参数。这使得我们可以安全地操作具有不同类型下界的泛型类，并进行相应的数据处理
    }
}
