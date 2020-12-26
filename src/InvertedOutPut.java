import java.util.Scanner;
public class InvertedOutPut {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            String str = String.valueOf(number);
            for(int i=0;i<str.length();i++){
                System.out.print(str.charAt(str.length()-i-1));
                //java.lang.String.charAt()返回指定索引处的char值，索引范围是0--length-1
                //若有异常抛出IndexOutOfBoundsException
            }

        }
    }
    //String.valueOf()和toString()方法大致相同，toString()意为返回该对象的字符串表示，
    // 若为null则报错，抛出异常java.lang.NullPointerException
    //String.valueOf()与其类似，唯一区别是先判断是否为null,若不为null则等同于toString
    //若为null则返回null的字符串表示
