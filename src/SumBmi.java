/**
 * 题目描述
 *  问题：计算BMI指数（身体质量指数）。
 *  主要用于统计用途，当我们需要比较及分析一个人的体重对于不同高度的人所带来的健康影响
 *  BMI值是一个中立而可靠的指标。
 *  输入
 * 70 170
 * 输出
 * 24.22
 */

import java.util.Scanner;
public class SumBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //
        double weight = sc.nextDouble();
        double high = sc.nextDouble() / 100;
        double BMI = weight / (high * high);
        System.out.println(String.format("%.2f", BMI));
    }
}


