import java.util.*;
public class Stairs {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println(step(scan.nextInt()));
        }
        public static int step(int n){
            if(n==1){
                return 1;
            }
            if(n==2){
                return 2;
            }
            return step(n-1)+step(n-2);
        }
    }

