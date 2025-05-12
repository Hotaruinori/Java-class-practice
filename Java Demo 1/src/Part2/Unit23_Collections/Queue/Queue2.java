
import java.util.*;

public class Queue2 
{
	public static void main(String argv[])
	{
        Queue<String> queue = new LinkedList<>();
		
        queue.offer("Lily");
        queue.offer("Lulu");
        queue.offer("Nana");
        queue.offer("Jojo");
        queue.offer("Diana");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        
	}
}
