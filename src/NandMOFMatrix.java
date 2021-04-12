
import java.util.Scanner;
public class NandMOFMatrix {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[][] num = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        num[i][j] = sc.nextInt();
                    }
                }
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(num[x - 1][y - 1]);
            }
        }
    }

