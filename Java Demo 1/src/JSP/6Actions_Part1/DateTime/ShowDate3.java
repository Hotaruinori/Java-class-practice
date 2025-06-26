
import java.util.Calendar;
import java.util.Locale;

public class ShowDate3 
{
    public static void main(String[] args) 
    {
        Calendar now = Calendar.getInstance();
       
        System.out.println("現在時刻:");
        
        //顯示西元(AD)、西元前(BC)
        System.out.print( now.getDisplayName(Calendar.ERA, Calendar.LONG, 
                                                               Locale.US ));
        //顯示年份                                                       
        System.out.println( now.get(Calendar.YEAR) );
        
        //顯示月份   
        System.out.println( now.getDisplayName(Calendar.MONTH, Calendar.LONG,
                                                                Locale.US));
        System.out.println( (now.get(Calendar.MONTH)+1) +"月");
                                                                
        //顯示日數   
        System.out.printf("%d 日%n",now.get(Calendar.DAY_OF_MONTH));
        
        //顯示星期名稱
        System.out.println( now.getDisplayName(Calendar.DAY_OF_WEEK, 
                                                     Calendar.LONG, Locale.TAIWAN));
        //顯示時間   
        System.out.printf("%d:%d:%d\n",now.get(Calendar.HOUR), now.get(Calendar.MINUTE), now.get(Calendar.SECOND));
                                                     
    }   
}


/*
 * 常用屬性 -
 * ERA: 西元/西元前
 * YEAR: 西元年
 * MONTH: 月份
 * DAY_OF_WEEK: 星期
 * DAY_OF_MONTH: 日數
 * HOUR: 時
 * MINUTE: 分
 * SECOND: 秒
 * 格式類 -
 * LONG: 完整名稱
 * SHORT: 縮寫名稱
 */
 