import java.util.*;
public class ex25_2 {
    public static void main(String[] args) {
		Map.Entry<String, String> map1 = Map.entry("星期日", "Sunday");
		Map.Entry<String, String> map2 = Map.entry("星期一", "Monday");
		Map.Entry<String, String> map3 = Map.entry("星期二", "Tuesday");
		Map.Entry<String, String> map4 = Map.entry("星期三", "Wednesday");
		Map.Entry<String, String> map5 = Map.entry("星期四", "Thursday");
		Map.Entry<String, String> map6 = Map.entry("星期五", "Friday");
		Map.Entry<String, String> map7 = Map.entry("星期六", "Satursday");
		
// 使用Map.ofEntries()建立Map
		Map<String, String> map = Map.ofEntries(map1, map2, map3, map4, map5, map6, map7);
		for (Map.Entry m:map.entrySet())					// 輸出內容
			System.out.printf("%s : %s\n", m.getKey(), m.getValue());
		
    }
}

