import java.util.*;
public class ch24_18 {
    public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>(); 
		map.put(101, "明志科大");
		map.put(102, "台灣科大");
		map.put(103, "台北科大");

		System.out.println("HashMap內容     : " + map);
		System.out.println("HashMap元素個數 : " + map.size());
		System.out.println("HashMap是空的   : " + map.isEmpty());
		System.out.println("HashMap包含101  : " + map.containsKey(101));
		map.remove(103);							// 刪除鍵值103
		System.out.println("刪除元素key=103後");
		System.out.println("HashMap含key103 : " + map.containsKey(103));
		System.out.println("HashMap內容     : " + map);
		map.clear();								// 刪除所有元素
		System.out.println("刪除所有元素後");
		System.out.println("HashMap是空的   : " + map.isEmpty());
		System.out.println("HashMap內容     : " + map);
    }
}

