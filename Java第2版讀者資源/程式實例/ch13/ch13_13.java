public class ch13_13 {
	public static void main(String[] args) {
		String str1 = "Johnson";
		String str2 = "Johnnason";
		String str3 = "Johnnananason";
		String pattern = "John((na)*son)";		// na由0到多皆可
		System.out.println("Johnson       : " + str1.matches(pattern));
		System.out.println("Johnnason     : " + str2.matches(pattern));
		System.out.println("Johnnananason : " + str3.matches(pattern));
	}
}

