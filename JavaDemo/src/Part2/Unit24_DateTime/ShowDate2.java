package Part2.Unit24_DateTime;
import java.text.*;
import java.util.Date;
import java.util.Locale;

public class ShowDate2
{
    public static void main(String[] args) 
    {
        DateFormat df1,df2;
        System.out.println("使用default格式");
        df1 = DateFormat.getInstance();
        
        System.out.println(df1.format(new Date()));
        System.out.println();

        System.out.println("使用自訂格式");
        String fmt = "y-M-d  E  HH:mm:ss  D";
        df2 = new SimpleDateFormat(fmt, Locale.TAIWAN);
        //df2 = new SimpleDateFormat(fmt, Locale.US);

        System.out.println(df2.format(new Date())); 
    }
}


/*
 * y:西元年
 * Y:西元年
 * w:week in year
 * W:week in month
 * E:星期
 * M:月份
 * MMM:月份的英文縮寫
 * MMMM:月份的英文
 * d:day in month
 * D:day in year
 * h:12小時制
 * H:24小時制
 * m:分
 * s:秒
 * a:AM/PM
 *
 * 可以指定位數 如 yyyy-MM-dd
 */
