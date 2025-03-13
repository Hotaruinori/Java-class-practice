import java.util.*;
public class ch24_19 {
    public static void main(String[] args) {
		var map = new HashMap<String, String>(); 
		map.put("Taipei", "台北");
		map.put("Tokyo", "東京");
		map.put("Singapore", "新加坡");

		String str = "Taipei";					// 	搜尋字典內容
		System.out.println("簡易字典查詢");
		System.out.println("Key = Taipei : " + map.get(str));
		System.out.println("遍歷字典");
		for (Map.Entry m:map.entrySet())
			System.out.printf("%12s : %s\n", m.getKey(), m.getValue());
    }
}

