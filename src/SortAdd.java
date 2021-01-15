import java.util.*;
public class SortAdd {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                //把合并后的数组都放到第一个数组里
                int[] arr1 = new int[n+m];
                int[] arr2 = new int[m];
                for (int i = 0; i < n; i++) {
                    arr1[i] = sc.nextInt();
                }
                for (int i = 0; i < m; i++) {
                    arr2[i] = sc.nextInt();
                }
                mergeSort(arr1,arr2,n-1,m-1);
                StringBuilder res = new StringBuilder();
                for (int i = 0; i < arr1.length; i++) {
                    res.append(arr1[i]);
                    if (i!=arr1.length-1)res.append(" ");
                }
                System.out.println(res.toString());
            }
        }
        //归并排序，合并数组1和数组2
        public static void mergeSort(int[] arr1,int[] arr2,int a,int b){
            if (arr2 == null || arr2.length == 0){
                return;
            }
            int tail = arr1.length-1;
            while(a>=0 && b >=0){
                if (arr1[a]>arr2[b]){
                    arr1[tail--] = arr1[a--];
                }else{
                    arr1[tail--] = arr2[b--];
                }
            }
            while(a>=0){
                arr1[tail--] = arr1[a--];
            }
            while(b>=0){
                arr1[tail--] = arr2[b--];
            }
        }
    }


