package JavaHomeWork;

public class BigArray {
        public static int FindBigArray(int[] arr){

            if(arr.length == 0 || arr == null){
                return 0;
            }
            int Sum = 0;
            int max = arr[0];
            for(int i=0;i<arr.length;i++){
                if(Sum<=0){
                    Sum = arr[i];

                }else{
                    Sum += arr[i];
                }
                if(Sum>max){
                    max = Sum;
                }
            }
            return max;
        }
        public static void main(String[] args){
            int[] arr = {-1,2,1};
            int x = FindBigArray(arr);
            System.out.println(x);
        }
    }
