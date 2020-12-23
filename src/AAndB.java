/**
 * 题目描述
 * 假设你们社团要竞选社长，有两名候选人分别是A和B，社团每名同学必须并且只能投一票，最终得票多的人为社长.
 * 输入描述:
 * 一行，字符序列，包含A或B，输入以字符0结束。
 * 输入
 * ABBABBAAB0
 * 输出
 * B
 */

import java.util.Scanner;
public class AAndB {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            //
            char[] ch = str.toCharArray();
            int a = 0;
            int b = 0;
            for(int i=0;i<ch.length-1;i++){
                if(ch[i] == 'A'){
                    a++;
                }
                if(ch[i] == 'B'){
                    b++;
                }
            }
            if(a>b){
                System.out.print('A');
            }else if(a<b){
                System.out.print('B');
            }else{
                System.out.print('E');
            }

        }
    }

