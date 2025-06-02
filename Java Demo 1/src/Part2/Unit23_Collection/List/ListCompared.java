package Part2.Unit23_Collection.List;
import java.util.*;

public class ListCompared
{
	public static void main(String[] args)
	{       
        List list1 = new ArrayList(100); // 滿了系統會自動再配置100容量
        List list2 = new LinkedList();
        List list3 = new Vector(100,10); // 滿了左邊會100容量，滿了再配置10
   }
}
