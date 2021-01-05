import java.util.Arrays;
import java.util.Scanner;

public class ScoreOfTest {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float num = 0;
            while (sc.hasNext()){
                //得到字符数组
                String st=sc.nextLine();
                String[] str=st.split(" ");
                //创建整数组
                int[] score=new int[str.length];
                //放进数组
                for(int i=0;i<str.length;i++) {
                    score[i]=Integer.parseInt(str[i]);}
                //先排序，再截取，不用截取，遍历的时候不找他们就行了
                Arrays.sort(score);
                for(int i=1;i<score.length-1;i++) {
                    num+=score[i];}
                System.out.printf("%.2f",num/(score.length-2));
            }
        }
    }

