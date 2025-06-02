package Part2.Unit23_Collection.Set;
import java.util.*;

public class Set01
{
	public static void main(String args[])
	{
		Set set = new HashSet();
		set.add(new Integer(10));
		set.add("abc");
		set.add(new Double(1.5));
		set.add(new Integer(10));
		set.add("abc");
		
        System.out.println("全部集合元素:");
		System.out.println(set);
	}
}
