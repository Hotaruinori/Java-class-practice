import java.util.Random;
import java.util.*;
public class ex24_2 {
	public static void main(String[] args) {
		var A = new LinkedList<Integer>(); 
		var B = new HashSet<Integer>();
		Random ran = new Random();
		int r;
		for ( int i = 0; i < 10; i++ ) {
			r = ran.nextInt(21);
			A.add(r);					// 產生0-20隨機數
			B.add(r);
		}
		
		System.out.println("使用for對LinkedList物件A的輸出");
		for(int i = 0; i < 10; i++)
			System.out.printf("%d ", A.get(i));
		
		System.out.println("");
		Iterator<Integer> itr = B.iterator();
		System.out.println("使用iterarot對HashSet物件B的輸出");
		while (itr.hasNext())
			System.out.printf("%d ", itr.next());
	}
}

