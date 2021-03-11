package JavaHomeWork;

import java.util.ArrayList;
import java.util.List;

public class TwoDimensionArray {

        public int[] arrayPrint(int[][] arr, int n) {
            int [] result = new int[n*n];
            int x=0;
            List<Integer> list = new ArrayList<>();
            for(int y=n-1;y>=0;y--){//x=0 y--遍历
                int x2=x;
                int y2=y;
                if(x2!=0&&y2!=0){
                    list.add(arr[x2][y2]);
                }
                if(x2!=0){
                    y2--;
                }
                while (x2<n&&(y2>=0&&y2<n)){
                    list.add(arr[x2][y2]);
                    x2++;
                    y2++;
                }
            }
            int y=0;
            for(int i=1;i<n;i++){//y=0 x++遍历
                int x3=i;
                int y3=y;
                list.add(arr[x3][y3]);
                x3++;
                y3++;
                while (x3<n&&(y3>=0&&y3<n)){
                    list.add(arr[x3][y3]);
                    x3++;
                    y3++;
                }
            }
            for(int i=0;i<list.size();i++){
                result[i]=list.get(i);
            }
            return result;
        }
    }

