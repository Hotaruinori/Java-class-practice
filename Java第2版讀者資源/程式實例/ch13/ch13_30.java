import java.util.regex.*;
public class ch13_30 {
	public static void main(String[] args) {
		String msg = "Please call my secretary using 0930-919-919 or 0952-001-001";
		String pattern = "\\d{4}(-\\d{3}){2}";		// 正規表達式
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(msg);
		boolean found = false;						// 預設found是false
		while (m.find()) {
			System.out.println(m.group()			// 列出所找到的字串
							   + " 字串找到了起始索引是 " + m.start()
							   + " 終止索引是 " + m.end());
			found = true;							// 找到了所以是true
		}
		if (!found) 								// 如果沒找到
			System.out.println("搜尋失敗");	  
	}	
}
	
