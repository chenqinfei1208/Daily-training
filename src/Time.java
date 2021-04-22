import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            // 根据时间戳获取时间
            long nowTime = 1379313866505l;
            String date = sdf.format(new Date(nowTime));
            System.out.println(System.currentTimeMillis());
            // 根据时间获取时间戳
            String dateString = "2013-09-23 08:50:11";
            Date date1 = sdf.parse(dateString);
            System.out.println(date1.getTime());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
