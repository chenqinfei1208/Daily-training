package JavaHomeWork;

import java.util.Scanner;

public class TranslateSentences {

        public static void main(String arg[]){
            Scanner input=new Scanner(System.in);
            String  sentence=input.nextLine();
            String word[]=sentence.split("\\s+");
            int len=word.length;
            StringBuffer strBuf=new StringBuffer(word[len-1]);
            for(int i=len-2;i>=0;i--){
                strBuf.append(" "+word[i]);
            }
            System.out.println(strBuf);
        }
    }


