import java.util.regex.*;
public class ch13_31 {
	public static void main(String[] args) {
		String msg = "CIA Mark told CIA Linda that secret USB had given to CIA Peter.";
		String pattern = "CIA \\w*";					// 正規表達式
		String replace = "C*A **";						// 新字串
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(msg);
		System.out.println(m.replaceFirst(replace));	// 取代第一筆出現字串
		System.out.println(m.replaceAll(replace));		// 取代全部字串
	}	
}
	
