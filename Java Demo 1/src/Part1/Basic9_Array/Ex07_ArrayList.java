
import java.util.*;

public class Ex07_ArrayList
{
	public static void main(String[] args)
	{
        ArrayList<Integer> list = new ArrayList<>(5);
        //Vector<Integer>  list = new Vector<Integer>(5,2);
	    list.add(10);
        list.add(12);
        list.add(14);
        list.add(16);
        list.add(18);
        list.add(20);
        list.add(22);
        list.add(24);
        
        //輸出容器內容
        System.out.println(list);
        
        System.out.println();
        //輸出方式二
        for(Integer element : list) System.out.print(element + "\t");
        
        System.out.println();
	}
}