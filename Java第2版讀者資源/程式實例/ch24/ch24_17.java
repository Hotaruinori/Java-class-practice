import java.util.*;
public class ch24_17 {
    public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>(); 
		set.add(8);
		set.add(3);
		set.add(11);
		set.add(1);							
		set.add(6);
		System.out.println("first : " + set.first());	// 取得第一個元素
		System.out.println("last  : " + set.last());	// 取得最後一個元素	
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext())
			System.out.println("TreeSet內容 : " + itr.next());
    }
}

