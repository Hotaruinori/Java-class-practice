public class ch13_23 {
	public static void main(String[] args) {
		String str = "Hello! Java! I love Java.";
		String pattern = "Java";		// 正規表達式
		System.out.println(str.replaceFirst(pattern, "Python"));
		pattern = ".*(Java).*";			// 新的正規表達式
		System.out.println(str.replaceFirst(pattern, "Python"));
	}
}

