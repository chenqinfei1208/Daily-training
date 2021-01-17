import java.util.*;
public class PrintfFamily {
        public static void main(String [] args)
        {
            Scanner sc=new Scanner(System.in);
            while(sc.hasNextInt())
            {
                int n=sc.nextInt();
                int count=0;
                for(int i=0;i<n;i++)
                {
                    int a=sc.nextInt();
                    int b=sc.nextInt();
                    int c=sc.nextInt();
                    int avg=(a+b+c)/3;
                    if(avg<60)
                    {
                        count++;
                    }
                }
                if(n!=0)
                {
                    System.out.println(count);
                }
            }
        }

    }
