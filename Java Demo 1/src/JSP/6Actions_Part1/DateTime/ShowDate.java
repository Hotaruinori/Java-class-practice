
import java.util.*;

public class ShowDate 
{
    public static void main(String[] args) 
    {
        Date today = new Date(); //�{�b���~���ɤ���
                
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDay());
        System.out.println(today.getDate());
        System.out.println(today.getHours());
        System.out.println(today.getMinutes());
        System.out.println(today.getSeconds());
        System.out.println(today.getTime());
        System.out.println();
        
    }
}
