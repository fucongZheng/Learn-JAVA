package com.fucongzheng.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    /*
    当涉及到 Java 中的 Stream 流时，以下是一些常见的知识点，通过代码讲解它们可以帮助你更好地理解和使用 Java Stream 流：

    创建 Stream 流：

    从集合创建流：List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); Stream<Integer> stream = numbers.stream();
    使用 Stream.of() 创建流：Stream<String> stream = Stream.of("Apple", "Banana", "Orange");
    使用 Arrays.stream() 创建流：int[] array = {1, 2, 3, 4, 5}; IntStream stream = Arrays.stream(array);
    过滤元素：

    使用 filter() 方法过滤元素：stream.filter(x -> x > 3)
    使用 distinct() 方法去重元素：stream.distinct()
    使用 limit() 方法限制元素数量：stream.limit(5)
    使用 skip() 方法跳过元素：stream.skip(3)
    转换元素：

    使用 map() 方法转换元素：stream.map(x -> x * 2)
    使用 flatMap() 方法展平嵌套流：stream.flatMap(list -> list.stream())
    使用 collect() 方法收集元素到集合中：List<Integer> collectedList = stream.collect(Collectors.toList())
    使用 toArray() 方法将元素转换为数组：Integer[] array = stream.toArray(Integer[]::new)
    排序元素：

    使用 sorted() 方法对元素排序：stream.sorted()
    自定义排序规则：stream.sorted((a, b) -> a.compareTo(b))
    聚合操作：

    使用 reduce() 方法进行归约操作：stream.reduce(0, (a, b) -> a + b)
    使用 count() 方法计算元素数量：stream.count()
    使用 max() 和 min() 方法查找最大和最小元素：stream.max(Comparator.naturalOrder())、stream.min(Comparator.naturalOrder())
    使用 findFirst() 和 findAny() 方法查找第一个或任意一个元素：stream.findFirst()、stream.findAny()
    终止操作：

    使用 forEach() 方法遍历元素：stream.forEach(System.out::println)
    使用 anyMatch()、allMatch() 和 noneMatch() 方法进行条件判断：stream.anyMatch(x -> x > 3)、stream.allMatch(x -> x > 0)、stream.noneMatch(x -> x < 0)
    这些是 Java Stream 流的基本知识点，你可以使用这些知识点来进行数据的流式处理。通过编写和运行涉及上述操作的代码示例，你可以更好地理解和掌握 Java Stream 流的用法和特性
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 过滤操作：保留偶数
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // 转换操作：将每个元素乘以2
        List<Integer> multipliedNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Multiplied Numbers: " + multipliedNumbers);

        // 排序操作：按照降序排序
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);

        // 终止操作：计算所有元素的和
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // 判断操作：是否存在大于10的元素
        boolean anyGreaterThanTen = numbers.stream()
                .anyMatch(n -> n > 10);
        System.out.println("Any greater than ten: " + anyGreaterThanTen);
    }
}
