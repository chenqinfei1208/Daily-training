package JavaHomeWork;

import java.util.Arrays;

public class Translation {
        public static void main(String[] args) {
            String str = "QWer";
            System.out.println(toLowerCase(str));

        }
        private static String toLowerCase(String str) {
            char[] a = str.toCharArray();
            for (int i = 0; i < a.length; i++) {
                if (a[i] >= 'A' && a[i] <= 'Z') {
                    a[i] += 32;
                }
            }
            String ss= Arrays.toString(a);
            return ss;
        }

    }


