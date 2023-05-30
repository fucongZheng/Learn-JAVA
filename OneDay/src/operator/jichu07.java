package operator;

public class jichu07 {
    public static void main(String[] args) {
        //逻辑运算  与或非
        boolean a = true;
        boolean b = false;

//        System.out.println("a&&b:"+(a&&b));//a&&b:false 全部真为真，有假就是假
//        System.out.println("a||b:"+(a||b));// a||b:true   有真则真
//        System.out.println("!(a&&b):"+!(a&&b));//  !(a&&b):true 取反
        //短路逻辑
//        int c = 5;
//        boolean d = (c < 4) && (c++ < 4);
//        System.out.println(c); //5
//        System.out.println(d); //false

        /*
        位运算
        A = 0011 1100
        B = 0000 1101

        A&B 0000 1100  相同1才是1 其余为0
        A|B 0011 1101  有1则1 其余为0
        A^B 0011 0001  相同未0 不同为1
        ~B  1111 0010  取反
        <<  *2 往左移乘与2
        >>  /2 往右移除与2
        0000 0000 0
        0000 0001 1
        0000 0010 2
        0000 0011 3
        0000 0100 4
        0000 0101 5
        0000 0110 6
        0000 0111 7
        0000 1000 8
        0001 0000 16
         */
        System.out.println(2<<3);
    }
}
