package Part2.Unit23_Collection.Queue;
import java.util.*;

public class Queue1 
{
	public static void main(String argv[])
	{
        Queue queue = new LinkedList();
		
        queue.offer("Lily");
        queue.offer(new Integer(38));
        queue.offer(new Boolean(true));
        queue.offer(new Integer(38));
        System.out.println(queue);              
	}
}
