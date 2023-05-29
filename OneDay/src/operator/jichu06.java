package operator;

public class jichu06 {
    public static void main(String[] args) {
        //运算符
        /*
        算术运算符  + - * / %  ++ --
        赋值运算 =
        关系运算符 < > >= <= == != instanceof
        逻辑运算符 && || !
        位运算符 & | ^ ~ >> << >>>
        条件运算符 ? :
        扩展运算符 += -= *= /+
         */
        //ctrl +d 复制当前行到下一行
        int a = 10;
        int c = 20;
        int b = 20;
        int d = 21;
        System.out.println(a+b);
        System.out.println(a-c);
        System.out.println(a*c);
        System.out.println(a/(double)d);
        System.out.println("===========================");
        //整数类型相加，有long类型 结果就是long类型；其他都是Int类型
        //有double 运算结果就是double
        long e = 1234455343334L;
        int f = 123;
        short g = 33;
        byte h = 9;
        System.out.println(e + f + g + h);
        System.out.println(f + g + h);
        System.out.println(g + h);
        System.out.println("===========================");
        int j = 10;
        int k = 19;
//        System.out.println(j>k);
//        System.out.println(j<k);
//        System.out.println(j==k);
        System.out.println("===========================");
        System.out.println(j%k);//模运算  求余
        System.out.println("===========================");
        int l = 10;
        int o = l++;
        int p = ++l;
        System.out.println(o);
        System.out.println(p);

    }
}
