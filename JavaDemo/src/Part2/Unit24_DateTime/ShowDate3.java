package Part2.Unit24_DateTime;
import java.util.*;

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
                                                                Locale.TAIWAN));
        System.out.println( (now.get(Calendar.MONTH)+1) +"月");
                                                                
        //顯示日數   
        System.out.printf("%d 日%n",now.get(Calendar.DAY_OF_MONTH));
        
        //顯示星期名稱
        System.out.println( now.getDisplayName(Calendar.DAY_OF_WEEK, 
                                                     Calendar.LONG, Locale.TAIWAN));
    }   
}
