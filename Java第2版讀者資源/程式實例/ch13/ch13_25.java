public class ch13_25 {
	public static void main(String[] args) {
		String str = "Hello! Java! I love Java.";
		String pattern = "Java";		// 正規表達式
		System.out.println(str.replaceAll(pattern, "Python"));
	}
}

