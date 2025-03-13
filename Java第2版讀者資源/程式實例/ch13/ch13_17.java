public class ch13_17 {
	public static void main(String[] args) {
		String str1 = "1 cats";
		String str2 = "32 dogs";
		String str3 = "a pigs";
		String pattern = "\\d+\\s+\\w+";		
		System.out.println("1 cats  : " + str1.matches(pattern));
		System.out.println("32 dogs : " + str2.matches(pattern));
		System.out.println("a pigs  : " + str3.matches(pattern));
	}
}

