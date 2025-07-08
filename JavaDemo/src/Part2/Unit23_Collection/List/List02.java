package Part2.Unit23_Collection.List;
import java.util.*;

public class List02 
{
	public static void main(String argv[])
	{
		List list = new LinkedList();
	
		list.add("Lily");
		list.add(new Integer(38));
		list.add(new Boolean(true));
		list.add(new Integer(38));
		System.out.println(list);
		       
		list.set(0,"Nana");
        System.out.println();
        System.out.println("Replace之後全部集合元素:");
        System.out.println(list);
        System.out.println("\n取得子集合元素:");
        System.out.println(list.subList(1,3));
        System.out.println();
               
        System.out.println("以ListIterator物件顯示全部集合元素:");
        ListIterator itor = list.listIterator();
        
        while(itor.hasNext())
        {
            System.out.println(itor.next());
        }    
	}
}
