import java.util.*;
public class ch24_4 {
    public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(); 
		list1.add("北京");
		list1.add("香港");
		list1.add("台北");
		ArrayList<String> list2 = new ArrayList<String>(); 
		list2.add("北京");
		list2.add("上海");
		list2.add("台北");
		list1.removeAll(list2);			// removeAll方法
		System.out.println("list1 : " + list1);
	}
}

