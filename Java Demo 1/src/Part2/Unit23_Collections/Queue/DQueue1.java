
import java.util.*;

public class DQueue1 
{
	public static void main(String argv[])
	{
        Deque<String> deque1 = new ArrayDeque<>();
		
        deque1.offer("Lily");
        deque1.offer("Lulu");
        deque1.offer("Nana");
        deque1.offer("Jojo");
        deque1.offer("Diana");
        System.out.println(deque1);
        
        Deque<String> deque2 = new ArrayDeque<>();
        deque2.push("Lily");
        deque2.push("Lulu");
        deque2.push("Nana");
        deque2.push("Jojo");
        deque2.push("Diana");
        System.out.println(deque2);

    }
}
