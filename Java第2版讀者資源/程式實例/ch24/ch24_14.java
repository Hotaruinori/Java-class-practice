import java.util.*;
public class ch24_14 {
    public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(); 
		set.add("北京");
		set.add("香港");
		set.add("台北");
		set.add("北京");							// 筆者故意重複
		System.out.println("HashSet內容     : " + set);
		System.out.println("HashSet元素個數 : " + set.size());
		System.out.println("HashSet是空的   : " + set.isEmpty());
		System.out.println("HashSet包含香港 : " + set.contains("香港"));
		set.remove("香港");							// 刪除元素香港
		System.out.println("刪除元素香港後");
		System.out.println("HashSet包含香港 : " + set.contains("香港"));
		System.out.println("HashSet內容     : " + set);
		set.clear();								// 刪除所有元素
		System.out.println("刪除所有元素後");
		System.out.println("HashSet是空的   : " + set.isEmpty());
		System.out.println("HashSet內容     : " + set);
    }
}

