
import java.util.*;

public class Set04
{
	public static void main(String[] args)
	{
		Set set = new HashSet();
		set.add("Lily");
		set.add("Nana");
		set.add("Lulu");
        set.add(null);   //將null加入元素中
        System.out.println("全部集合元素:");
		System.out.println(set);
		System.out.println();
		
        //以Iterator依序取出集合中的所有元素
        System.out.println("全部集合元素:");
		Iterator itor = set.iterator();
		while(itor.hasNext())
		{
			System.out.println(itor.next());
	    }
	    	
        System.out.println();
	    for(Object o: set)
	    {
            System.out.println(o); 
        }  
	}
}
