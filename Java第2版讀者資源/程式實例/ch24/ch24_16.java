import java.util.*;
public class ch24_16 {
    public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>(); 
		set.add("北京");
		set.add("香港");
		set.add("台北");
		set.add("東京");							
		set.add("曼谷");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext())
			System.out.println("LinkedHashSet內容 : " + itr.next());
    }
}

