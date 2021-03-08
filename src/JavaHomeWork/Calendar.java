package JavaHomeWork;
import java.util.Scanner;

public class Calendar {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int year=sc.nextInt();
            int month=sc.nextInt();
            int day=sc.nextInt();
            TDate td=new TDate(day, month,year);
            td.print();
        }

        static class TDate {
            private int Month = 0;
            private int Day=0;
            private int Year=0;

            public TDate(int day, int month, int year) {
                this.Month = month;
                this.Day = day;
                this.Year = year;
            }

            public void print() {
                System.out.println(Day + "/" + Month + "/" + Year);
            }
        }
    }

