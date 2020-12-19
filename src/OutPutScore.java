import java.util.*;
public class OutPutScore {
        public static void main(String[] agrs){
            Scanner in=new Scanner(System.in);
            //首先，Scanner是一个扫描器
            // 它扫描数据都是去内存中一块缓冲区中进行扫描并读入数据的
            // 而我们在控制台中输入的数据也都是被先存入缓冲区中等待扫描器的扫描读取
            // 这个扫描器在扫描过程中判断停止的依据就是“空白符”，空格啊，回车啊
            int a=in.nextInt();
            //nextInt()方法在扫描到空白符的时候会将前面的数据读取走但会丢下空白符“\r”在缓冲区中
            // nextLine()方法在扫描的时候会将扫描到的空白符一同清理掉。
            int b=in.nextInt();
            int c=in.nextInt();
            System.out.println("score1="+a+",score2="+b+",score3="+c);
        }
    }

