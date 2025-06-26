
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ShowDate2
{
    public static void main(String[] args) 
    {
        DateFormat df1,df2;
        System.out.println("�ϥ�default�榡");
        df1 = DateFormat.getInstance();
        
        System.out.println(df1.format(new Date()));
        System.out.println();

        System.out.println("�ϥΦۭq�榡");
        String fmt = "y-M-d  E  HH:mm:ss  D";
        df2 = new SimpleDateFormat(fmt, Locale.TAIWAN);
        //df2 = new SimpleDateFormat(fmt, Locale.US);

        System.out.println(df2.format(new Date())); 
    }
}


/*
 * y:�褸�~
 * Y:�褸�~
 * w:week in year
 * W:week in month
 * E:�P��
 * M:���
 * MMM:������^���Y�g
 * MMMM:������^��
 * d:day in month
 * D:day in year
 * h:12�p�ɨ�
 * H:24�p�ɨ�
 * m:��
 * s:��
 * a:AM/PM
 *
 * �i�H���w��� �p yyyy-MM-dd
 */