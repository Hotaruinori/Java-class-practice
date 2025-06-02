
import java.util.*;

public class Map03
{
	public static void main(String[] args)
	{
        Hashtable<String,String> ht = new Hashtable<>();
        //HashMap<String,String> ht = new HashMap<>();
        ht.put("ONE","Lily");
		ht.put("TWO","Lulu");
		ht.put("THREE","Nana");
		ht.put("FOUR","Jojo");
		ht.put("FIVE","Anna");
		
        //以Enumeration值將集合中所有元素內容取出。僅適用Hashtable
        System.out.println("以Enumeration值將集合中所有元素內容取出");
        
        Enumeration e = ht.elements();    
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        } 
 
        System.out.println();
        
		for(Enumeration ee = ht.elements();ee.hasMoreElements();)
		{
			System.out.println(ee.nextElement());
	    }	    
	}
}
