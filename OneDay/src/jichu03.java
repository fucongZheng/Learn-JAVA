

public class jichu03 {
    public static void main(String[] args) {
        //进制
        int i =10;
        int i2 =333;
        int i3 = 0x10;

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("------------------------------------------------------------------------------");
        //float 有限的位数 、大约 离散，不要用浮点数进行比较

        //字符,所有的字符本质就是数字
        //编码 Unicode 2个字节 65536
        //Excel 2^16 =65536
        //unicode 编码 \u0061
        char c = 'a';
        char c2 = '中';
        System.out.println((int)c);

        //转义字符 \t 字表符  \n换行
    }
}
