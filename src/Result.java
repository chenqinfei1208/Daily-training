import java.util.Scanner;
public class Result {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();//读入一整行
            String[] s = input.split(" "); //以空格为届分割字符串，返回字符串数组
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);
            int d = Integer.parseInt(s[3]);
            System.out.println((a+b-c)*d);
        }
    }

