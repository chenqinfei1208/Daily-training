import java.util.Scanner;
public class Catain9 {
        public static void main(String[] args) {
            int sum=0;
            for(int i=9;i<2020;i++){
                String s=String.valueOf(i);
                if(s.length()!=s.replace("9","").length())
                    sum++;
            }
            System.out.println(sum);
        }
    }


