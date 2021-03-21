import java.util.Scanner;
public class PrintBrith {

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            //
            String year = s.substring(0, 4);
            String month = s.substring(4, 6);
            String days = s.substring(6, 8);
            System.out.println("year="+year);
            System.out.println("month="+month);
            System.out.println("date="+days);

        }

    }
