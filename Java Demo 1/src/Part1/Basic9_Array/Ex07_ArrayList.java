
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
        
        //��X�e�����e
        System.out.println(list);
        
        System.out.println();
        //��X�覡�G
        for(Integer element : list) System.out.print(element + "\t");
        
        System.out.println();
	}
}