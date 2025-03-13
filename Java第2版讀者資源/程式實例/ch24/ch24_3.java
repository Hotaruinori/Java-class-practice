import java.util.*;
public class ch24_3 {
    public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		list.add("北京");
		list.add("香港");
		list.add("台北");
		System.out.println("list元素數量  : " + list.size());
		System.out.println("list元素內容  : " + list);
		list.add(1,"南京");								// 插入索引1位置
		System.out.println("list元素索引1 : " + list.get(1));	// 列印索引1內容
		System.out.println("插入元素後");
		System.out.println("list元素數量  : " + list.size());
		System.out.println("list元素內容  : " + list);
	}
}

