/**
 * 题目描述
 * 期中考试开始了，大家都想取得好成绩，争夺前五名。从键盘输入n个学生成绩（不超过40个），输出每组排在前五高的成绩。
 * 示例1
 * 输入
 * 6
 * 99 45 78 67 72 88
 * 输出
 * 99 88 78 72 67
 */

import java.util.Scanner;
public class TopFive {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int str[] = new int[41];
            //
            for(int a =0;a<n;a++){
                str[a]= sc.nextInt();

            }
            //
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n-i;j++){
                    if(str[j] < str[j+1]){
                        int tem = str[j];
                        str[j] = str[j+1];
                        str[j+1] = tem;

                    }
                }

            }
            System.out.print(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]);
        }
    }

