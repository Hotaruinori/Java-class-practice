import java.util.regex.*;
public class ch13_27 {
	public static void main(String[] args) {
		String str = "0952-001-001";
		String pattern = "\\d{4}(-\\d{3}){2}";		// 正規表達式
// 方法1
		Pattern p = Pattern.compile(pattern);		// 編譯正規表達式
		Matcher m = p.matcher(str);					// 比對
		System.out.println("方法1 : " + m.matches());
// 方法2
		System.out.println("方法2 : " + Pattern.matches(pattern, str));
	}
}

