public class ch13_21 {
	public static void main(String[] args) {
		String str1 = "cd%@_";
		String str2 = "K***l";
		String pattern = ".*";		
		System.out.println("cd%@_ : " + str1.matches(pattern));
		System.out.println("K***l : " + str2.matches(pattern));
	}
}

