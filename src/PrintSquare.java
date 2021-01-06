import java.util.*;

public class PrintSquare {
    public static void main(String [] args)
        {
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                int n = sc.nextInt();
                
                for(int i=0;i<n;i++){
                    System.out.println(String.join("", Collections.nCopies(n,"*"+" ")));
                }
            }
        }
}

