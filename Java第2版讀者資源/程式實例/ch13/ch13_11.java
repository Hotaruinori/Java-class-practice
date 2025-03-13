public class ch13_11 {
	public static void main(String[] args) {
		String str1 = "Johnson";
		String str2 = "Johnnason";
		String str3 = "John";
		String pattern = "John((na)?son)";		// 正規表達式
		System.out.println("Johnson   : " + str1.matches(pattern));
		System.out.println("Johnnason : " + str2.matches(pattern));
		System.out.println("John      : " + str3.matches(pattern));
	}
}

