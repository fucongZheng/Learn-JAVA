package com.fucongzheng.arrays;

public class Person implements Comparable<Person> {
    /*
    首先，我们定义了一个名为 Person 的类，它包含了姓名（name）和年龄（age）这两个属性。Person 类实现了 Comparable<Person> 接口，
    并重写了 compareTo() 方法。在本例中，我们根据年龄来定义对象之间的比较规则，即返回两个对象年龄的差值。

    然后，在 ComparableExample 类的 main() 方法中，我们创建了一个 Person 对象数组 persons，并对其使用 Arrays.sort() 方法进行排序。

    最后，我们通过遍历排序后的结果，并使用 System.out.println() 方法打印每个 Person 对象的信息。
     */
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 实现 compareTo() 方法来定义类之间的比较规则
    @Override
    public int compareTo(Person otherPerson) {
        return this.age - otherPerson.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
