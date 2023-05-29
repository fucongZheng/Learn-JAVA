package base;

public class jichu04 {
    public static void main(String[] args) {
        //类型转换
        //低到高
        //byte short char int long float double
        //运算时先转换成同一个类型在进行运算，转换时避免内存溢出
        //byte、short、char这三者之间不会相互转换，他们三者在计算时首先都会转换为 int 类型
        //强制转换  (int)a
        //高到低 强制转换，低到高自动转换

        /*
        不能对布尔值进行转换
        不能把对象类型转换为不相干的类型
        强制转换的时候注意内存溢出、精度问题
         */
        System.out.println((int)27.5);

        char c ='a';
        int b = c+1;
        System.out.println(b);
        System.out.println((char)b);
        System.out.println("-------------------------");

        //JDK新特性 数字大的时候可以用下划线
        int a = 10_0000_0000;
    }
}
