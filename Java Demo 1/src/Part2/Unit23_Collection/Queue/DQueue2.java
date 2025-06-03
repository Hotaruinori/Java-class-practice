package Part2.Unit23_Collection.Queue;
import java.util.*;

public class DQueue2 
{
	public static void main(String argv[])
	{
        Deque<String> deque = new ArrayDeque<>();
		
        deque.offer("Lily");
        deque.offer("Lulu");
        deque.offer("Nana");
        deque.offer("Jojo");
        deque.offer("Diana");
        System.out.println(deque);
        
        deque.offerFirst("1111");
        deque.offerLast("2222");
        deque.offer("2222");
        System.out.println(deque);
        
        deque.poll();
        System.out.println(deque);
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);
    }
}
