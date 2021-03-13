package JavaHomeWork;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteString {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()){
                String s=sc.nextLine();
                String pattern=sc.nextLine();
                //
                StringBuilder sb= new StringBuilder();
                for(int i=0;i<s.length();i++){
                    //
                    String temp=String.valueOf(s.charAt(i));
                    if(!pattern.contains(temp)){
                        sb.append(temp);
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }


