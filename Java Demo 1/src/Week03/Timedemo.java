package Week03;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Timedemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("現在日期:" + date);

        //自1970年1月1日 00:00:00AM以來到 date被建立時經過的毫秒數
        System.out.println("毫秒數:" + date.getTime());

        //目前系統時間至自1970年1月1日 00:00:00AM所經過的時間
        System.out.println(System.currentTimeMillis());

        // 使用今天的日期
        LocalDate today = LocalDate.now();
        System.out.println("今天的日期: " + today);
        
        // 使用指定的年月日
        LocalDate specificDate = LocalDate.of(2024, 8, 18);
        System.out.println("指定的日期: " + specificDate);

        //取得分別的年月日
        int year = specificDate.getYear();
        int month = specificDate.getMonthValue();
        int day = specificDate.getDayOfMonth();
        
        System.out.println("年: " + year);
        System.out.println("月: " + month);
        System.out.println("日: " + day);

        //日期時間的加減操作
        LocalDateTime now = LocalDateTime.now();
        // 加一天
        LocalDateTime tomorrow = now.plusDays(1);
        System.out.println("明天的日期和時間: " + tomorrow);
        // 減一小時
        LocalDateTime lastHour = now.minusHours(1);
        System.out.println("一小時前的日期和時間: " + lastHour);

        //比較日期時間
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 8, 18, 14, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(2024, 8, 19, 14, 30);
        
        if (dateTime1.isBefore(dateTime2)) {
        System.out.println(dateTime1 + " 在 " + dateTime2 + " 之前");
        } else if (dateTime1.isAfter(dateTime2)) {
        System.out.println(dateTime1 + " 在 " + dateTime2 + " 之後");
        } else {
        System.out.println(dateTime1 + " 和 " + dateTime2 + " 是同一時間");
        }

        // 日期時間格式化和解析
        // 格式化日期和時間
        LocalDate date2 = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = date2.format(formatter);
        System.out.println(formattedDate);




        
    }
}
