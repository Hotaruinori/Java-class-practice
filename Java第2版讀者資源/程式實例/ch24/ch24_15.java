import java.util.*;
public class ch24_15 {
    public static void main(String[] args) {
		var set = new HashSet<String>(); 
		set.add("北京");
		set.add("香港");
		set.add("台北");
		set.add("東京");							
		set.add("曼谷");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext())
			System.out.println("HashSet內容 : " + itr.next());
    }
}

