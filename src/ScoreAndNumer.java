import java.util.Scanner;



public class ScoreAndNumer {
        public static void main(String[] args){
                    Scanner scanner = new Scanner(System.in);
                    //使用；或，分隔输入数据
                    String[] data = scanner.nextLine().split("[;,]");
                    //split表示把一个字符串分割成字符串数组
                    int id=Integer.parseInt(data[0]);//将（）内的字符串转换为Int值如.parseInt(String)
                    double score1=Double.parseDouble(data[1]);
                    double score2=Double.parseDouble(data[2]);
                    double score3=Double.parseDouble(data[3]);
                    System.out.println("The each subject score of  No. "+id+" is "+String.format("%.2f",score1)+", "+String.format("%.2f",score2)+", "+String.format("%.2f",score3)+".");
                }

            }

        

