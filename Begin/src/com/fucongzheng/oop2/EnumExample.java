package com.fucongzheng.oop2;

public class EnumExample {
    /*
    这个示例代码展示了如何在Java中创建和使用枚举类型。我们定义了一个名为Day的枚举类型，其中包含了一周的每一天。每个枚举值都有一个相关联的中文名称。

    在枚举类EnumExample内部，我们还定义了一个构造函数来初始化枚举常量，并提供了一个getChineseName()方法用于获取与枚举值关联的中文名称。

    在主函数中，我们使用Day.MONDAY来表示今天是星期一，并输出结果。然后，我们使用values()方法遍历枚举类型的所有值，并打印出每个枚举常量及其对应的中文名称。
     */
    // 定义一个枚举类型
    enum Day {
        SUNDAY("星期日"),
        MONDAY("星期一"),
        TUESDAY("星期二"),
        WEDNESDAY("星期三"),
        THURSDAY("星期四"),
        FRIDAY("星期五"),
        SATURDAY("星期六");

        private final String chineseName;

        // 枚举构造函数
        Day(String chineseName) {
            this.chineseName = chineseName;
        }

        // 获取中文名称
        public String getChineseName() {
            return chineseName;
        }
    }

    public static void main(String[] args) {
        // 使用枚举常量
        Day today = Day.MONDAY;
        System.out.println("今天是：" + today);  // 输出结果：今天是：MONDAY

        // 遍历枚举值
        for (Day day : Day.values()) {
            System.out.println(day + " - " + day.getChineseName());
        }
    }
}
