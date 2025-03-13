import java.util.*;
public class ex24_4 {
    public static void main(String[] args) {
		char ch;
		var map = new HashMap<String, String>(); 
		map.put("Taipei", "台北");
		map.put("Tokyo", "東京");
		map.put("Singapore", "新加坡");
		map.put("Chicago", "芝加哥");
		map.put("Beijing", "北京");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
			System.out.printf("請輸入查詢鍵 : ");
			String key = scanner.next();
		    
			if (map.containsKey(key))
				System.out.println(map.get(key));
			else
				System.out.println("查無此字");
			System.out.printf("是否繼續(y/n) : ");
			ch = scanner.next().charAt(0);
			if (ch == 'n')
				break;
		}
    }
}

