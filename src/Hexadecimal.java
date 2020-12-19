public class Hexadecimal {
        public static void main(String[] args){
            //public static int parseInt(String s, int radix)
            //s是要转换的数字的字符串形式
            //radix是其原始进制
            int num = Integer.parseInt("ABCDEF", 16);
            System.out.printf("%15d",num);
        }
    }

