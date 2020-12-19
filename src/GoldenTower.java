import java.util.Scanner;
public class GoldenTower {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            char c = sc.nextLine().charAt(0);//charAt方法：charAt(index)
            //java.lang.String.charAt()方法 返回 指定索引 处的 char值。索引范围 是从0 到length() - 1。
            for(int i=1;i<=5;i++){//控制行
                for(int j=1;j<=5-i;j++){//输出前半部分的空格
                    System.out.print(" ");
                }
                for(int m=1;m<=i*2-1;m++){//输出后半部分，通过i*2-1控制每行内的循环次数
                    if((m+1)%2==0){//(m+1)%2则判断是否为奇数，奇数输出1，偶数输出空格
                        System.out.print(c);
                    }else{
                        System.out.print(" ");
                    }
                }//循环结束后直接换行
                System.out.println();
            }
        }
    }
