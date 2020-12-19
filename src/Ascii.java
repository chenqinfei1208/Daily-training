public class Ascii {
        public static void main(String[] args){
            //本题的关键思想是使用数组存储这些ASCII码，然后利用内置的printf或者cout等方法输出即可，
            //c语言中char的取值范围是-127至127，该范围正好可以用于存放上面的数组。
            int[] arr = new int[]{73,32,99,97,110,32,100,111,32,105,116,33};//整型
            for(int i=0;i<arr.length;i++){
                System.out.print((char)arr[i]);//强制转换为字符类型
            }
        }
    }

