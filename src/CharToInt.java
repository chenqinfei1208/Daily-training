import java.io.IOException;
import java.util.Scanner;
public class CharToInt {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String x = sc.next();
            char c = x.charAt(0);
            System.out.println(Integer.valueOf(c));
        }
        //使用Integer.valueOf就可以直接将char类型转为十进制数据表示形式
    }
    //方法二
   class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(System.in.read());
        //使用read()方法读取一个字符，返回值为int
    }
}

