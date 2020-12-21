import java.util.Scanner;
public class SplitOfString {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String[] split = sc.nextLine().split(",");
            String[] numer1 = split[0].split("=");
            String a = numer1[1];
            String[] numer2 = split[1].split("=");
            String b = numer2[1];
            System.out.println("a="+b+",b="+a);

        }
    /**
     * next()与nextInt()与nextLine()的区别细讲
     * 他们三个都属于Scanner的内置方法
     * next（）与nextInt()基本相同，nextInt()规定返回值必须为int类型，所以输入必为int
     * next()返回值为字符串类型
     * next()将空格看做分割两个字符串之间的标志
     * nextLine()将空格也看做字符串的一部分
     */


}

