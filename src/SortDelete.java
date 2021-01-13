import java.util.*;
import java.util.stream.Collectors;

public class SortDelete {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int n = sc.nextInt();
                Set<String> set = new LinkedHashSet<>();
                for (int i = 0; i < n; i++) {
                    set.add(Integer.toString(sc.nextInt()));
                }
                String res = set.stream().collect(Collectors.joining(" "));
                System.out.println(res);
            }
        }
    }

