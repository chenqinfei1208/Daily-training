import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Geniuns {
        public static void main(String[] args) throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str="";
            Integer i;
            while((str=br.readLine())!=null) {
                i=Integer.valueOf(str);
                if(i>=140)
                    System.out.println("Genius");

            }
        }
    }



