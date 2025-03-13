import java.util.*;
public class ch24_2 {
    public static void main(String[] args) {
		var list1 = new ArrayList<String>(); 
		list1.add("北京");
		list1.add("香港");
		list1.add("台北");
		var list2 = new ArrayList<String>(); 
		list2.add("南京");
		list2.add("上海");
		list2.add("台北");
		list1.addAll(list2);				// addAll方法
		System.out.println("list1 : " + list1);
	}
}

