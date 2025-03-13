public class ch13_26 {
	public static void main(String[] args) {
		String str = "Please call my secretary using 0930-919-919 or 0952-001-001";
		String pattern = "\\d{4}(-\\d{3}){2}";		// 正規表達式
		String newstr = "0930-***-***";
		System.out.println(str.replaceAll(pattern, newstr));
	}
}

