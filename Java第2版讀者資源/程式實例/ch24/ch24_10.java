import java.util.*;
public class ch24_10 {
    public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		for (int i=10; i<=50; i+=10)
			list.add(i);								// 建立list		
		System.out.println("刪除前 list : " + list);
		System.out.println("刪除第一筆元素   : " + list.removeFirst());
		System.out.println("刪除最後一筆元素 : " + list.removeLast());
		System.out.println("刪除後 list : " + list);
    }
}

