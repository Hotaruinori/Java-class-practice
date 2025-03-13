public class ch13_19 {
	public static void main(String[] args) {
		String str1 = "c";
		String str2 = "K";
		String str3 = "1";
		String str4 = "3";
		String pattern = "[A-Z]";		
		System.out.println("c : " + str1.matches(pattern));
		System.out.println("K : " + str2.matches(pattern));
		pattern = "[2-5]";
		System.out.println("1 : " + str3.matches(pattern));
		System.out.println("3 : " + str4.matches(pattern));
	}
}

