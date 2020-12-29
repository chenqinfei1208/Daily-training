import java.util.*;
public class Vowel {
    //有五个字母A(a), E(e), I(i), O(o),U(u)称为元音，其他所有字母称为辅音，
//请帮他编写程序判断输入的字母是元音（Vowel）还是辅音（Consonant）。
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                String s=sc.next();
                if(isWhat(s)){
                    System.out.println("Vowel");
                }else{
                    System.out.println("Consonant");
                }
            }
        }
        public static boolean isWhat(String x){
            String a[]={"A","a","E","e","I","i","O","o","U","u"};
            for(int i=0;i<a.length;i++){
                if(x.equals(a[i]))
                    return true;
            }
            return false;
        }
    }



