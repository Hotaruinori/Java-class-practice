public class ch13_18 {
	public static void main(String[] args) {
		String str1 = "cat";
		String str2 = "hat";
		String str3 = "flat";
		String str4 = "at";
		String str5 = " at";
		String pattern = ".at";		
		System.out.println("cat  : " + str1.matches(pattern));
		System.out.println("hat  : " + str2.matches(pattern));
		System.out.println("flat : " + str3.matches(pattern));
		System.out.println("at   : " + str4.matches(pattern));
		System.out.println(" at  : " + str5.matches(pattern));
	}
}

