
import java.util.Calendar;
import java.util.Locale;

public class ShowDate3 
{
    public static void main(String[] args) 
    {
        Calendar now = Calendar.getInstance();
       
        System.out.println("�{�b�ɨ�:");
        
        //��ܦ褸(AD)�B�褸�e(BC)
        System.out.print( now.getDisplayName(Calendar.ERA, Calendar.LONG, 
                                                               Locale.US ));
        //��ܦ~��                                                       
        System.out.println( now.get(Calendar.YEAR) );
        
        //��ܤ��   
        System.out.println( now.getDisplayName(Calendar.MONTH, Calendar.LONG,
                                                                Locale.US));
        System.out.println( (now.get(Calendar.MONTH)+1) +"��");
                                                                
        //��ܤ��   
        System.out.printf("%d ��%n",now.get(Calendar.DAY_OF_MONTH));
        
        //��ܬP���W��
        System.out.println( now.getDisplayName(Calendar.DAY_OF_WEEK, 
                                                     Calendar.LONG, Locale.TAIWAN));
        //��ܮɶ�   
        System.out.printf("%d:%d:%d\n",now.get(Calendar.HOUR), now.get(Calendar.MINUTE), now.get(Calendar.SECOND));
                                                     
    }   
}


/*
 * �`���ݩ� -
 * ERA: �褸/�褸�e
 * YEAR: �褸�~
 * MONTH: ���
 * DAY_OF_WEEK: �P��
 * DAY_OF_MONTH: ���
 * HOUR: ��
 * MINUTE: ��
 * SECOND: ��
 * �榡�� -
 * LONG: ����W��
 * SHORT: �Y�g�W��
 */
 