
import java.util.*;

public class List_Sort3
{
	public static void main(String argv[])
	{
		List<Integer> list = new ArrayList<>();
        list.add(new Integer(9));
        list.add(new Integer(5));
        list.add(new Integer(1));
        list.add(new Integer(7));
        list.add(new Integer(11));
        list.add(new Integer(3));
        
        Collections.sort(list);
        //Collections.sort(list,(num1,num2)->num2-num1);   //Lambda
		
        System.out.println("全部集合元素:" +list);
    }
}
