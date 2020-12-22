/**
 * 问题：一年约有3.156×107s，要求输入您的年龄，显示该年龄合多少秒
 */

import java.util.Scanner;
public class PrintOutSeconed {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
            long x = (long)(age*3.156*Math.pow(10,7));
            System.out.println(x);
        }

    /**
     * 题目描述
     * 根据给出的三角形3条边a, b, c（0 < a, b, c < 100,000），计算三角形的周长和面积。
     * 输入
     * 3 3 3
     * 输出
     * circumference=9.00 area=3.90
     */
    static class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a + b > c || a + c > b || b + c > a) {
            if (a - b < c || a - c < b || b - a < c || c - a < b || b - c < a || c - b < a) {
                double sum = a + b + c;
                double p = sum / 2;
                //
                double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("circumference=" + String.format("%.2f", sum) + " area=" + String.format("%.2f", area));
            } else {
                System.out.println("条件不满足");
            }

        } else {
            System.out.println("条件不满足");
        }

    }
}
}




