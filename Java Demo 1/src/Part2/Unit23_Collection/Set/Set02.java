package Part2.Unit23_Collection.Set;
import java.util.*;

public class Set02
{
	public static void main(String argv[])
	{
		Set set = new TreeSet();
		set.add(new Integer(9));
		set.add(new Integer(5));
		set.add(new Integer(1));
		set.add(new Integer(7));
		set.add(new Integer(5));
		set.add(new Integer(3));
		
        System.out.println("全部集合元素:");
		System.out.println(set);
	}
}
