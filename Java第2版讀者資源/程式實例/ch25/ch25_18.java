import java.util.*;
public class ch25_18 {
    public static void main(String[] args) {
		Map.Entry<Integer, String> map1 = Map.entry(101, "明志科大");
		Map.Entry<Integer, String> map2 = Map.entry(102, "長庚科大");
// 使用Map.ofEntries()建立Map
		Map<Integer, String> map = Map.ofEntries(map1, map2);
		for (Map.Entry m:map.entrySet())					// 輸出內容
			System.out.printf("%5s : %s\n", m.getKey(), m.getValue());
		
    }
}

