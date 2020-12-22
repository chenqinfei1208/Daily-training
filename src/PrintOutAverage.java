/**
 *  题目描述
 * 依次输入一个学生的3科成绩，在屏幕上输出该学生的总成绩以及平均成绩。
 * 输入描述:
 * 一行，3科成绩，成绩之间用一个空格隔开。
 * 输出描述:
 * 一行，总成绩和平均成绩（小数点后保留两位），用一个空格隔开。
 */

import java.util.Scanner;
public class PrintOutAverage {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String[] str = sc.nextLine().split(" ");
            //
            double[] b = new double[str.length];
            for(int i = 0;i<str.length;i++){
                //
                b[i] = Double.parseDouble(str[i]);
            }
            double sum = b[0]+b[1]+b[2];
            double average = sum/3;
            //
            System.out.println(String.format("%.2f",sum)+" "+String.format("%.2f",average));

        }
    }
