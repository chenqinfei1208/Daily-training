import java.util.Scanner;
public class DifferentMutiple {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNext()){
                String line = scanner.nextLine();
                //
                int a = Integer.parseInt(line);
                //
                System.out.println(1 << a );
            }
        }
    }

