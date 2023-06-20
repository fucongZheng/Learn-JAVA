package com.fucongzheng.oop2;

public class MyGenericInterfaceImpl<T> implements MyGenericInterface<T> {
    // 实现泛型接口
    @Override
    public T processData(T input) {
        return input;
    }
}
