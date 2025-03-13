import java.util.*;
public class ch24_21 {
    public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(); 
		map.put(1001, "台北");
		map.put(1003, "東京");
		map.put(1009, "新加坡");
		map.put(1005, "芝加哥");

		System.out.println("第一個元素鍵值   : " + map.firstKey());
		System.out.println("最後一個元素鍵值 : " + map.lastKey());
		System.out.println("遍歷字典");
		for (Map.Entry m:map.entrySet())
			System.out.printf("%12s : %s\n", m.getKey(), m.getValue());
		System.out.println("取得子TreeMap");
		System.out.println("鍵值在1003-1006之間 : " + map.subMap(1003,1006));
		System.out.println("取得子TreeMap");
		System.out.println("鍵值大於1003        : " + map.tailMap(1003));
    }
}

