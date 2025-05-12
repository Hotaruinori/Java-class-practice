
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class List01
{
	public static void main(String argv[])
	{       
       List list1 = new LinkedList();
       List list2 = new ArrayList();

       list1.add("Lily");
       list1.add(new Integer(38));
       list1.add(new Boolean(true));
       list1.add(new Integer(38));

       list2.add("Lily");
       list2.add(new Integer(38));
       list2.add(new Boolean(true));
       list2.add(new Integer(38));

       System.out.println("LinkedList: "+list1);
       System.out.println("ArrayList: "+list2);
   }
}
