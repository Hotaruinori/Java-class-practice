import java.util.*;
public class ex24_6 {
    public static void main(String[] args) {
		var map = new TreeMap<Integer, String>(); 
		map.put(100, "蘋果");
		map.put(30, "香蕉");
		map.put(50, "芒果");
		map.put(20, "西瓜");
		int key1 = map.firstKey();
		int key2 = map.lastKey();
		System.out.println("最便宜水果 : " + map.get(key1) + "\t" + "單價 : " + key1);
		System.out.println("最貴的水果 : " + map.get(key2) + "\t" + "單價 : " + key2);
		System.out.println("遍歷水果表");
		for (Map.Entry m:map.entrySet())
			System.out.printf("%12s : %s\n", m.getValue(), m.getKey());

    }
}

