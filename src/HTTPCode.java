import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HTTPCode {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Map<Integer,String> map = new HashMap<>(16);
            map.put(200,"OK");
            map.put(202,"Accepted");
            map.put(400,"Bad Request");
            map.put(403,"Forbidden");
            map.put(404,"Not Found");
            map.put(500,"Internal Server Error");
            map.put(502,"Bad Gateway");
            while (sc.hasNext()) {
                int state = sc.nextInt();
                System.out.println(map.get(state));
            }
        }
    }


