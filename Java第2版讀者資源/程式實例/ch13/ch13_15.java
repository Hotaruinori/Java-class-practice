public class ch13_15 {
	public static void main(String[] args) {
		String str1 = "son";
		String str2 = "sonson";
		String str3 = "sonsonson";
		String str4 = "sonsonsonson";
		String str5 = "sonsonsonsonson";
		String pattern = "(son){3,5}";		// son由3到5次皆可
		System.out.println("son             : " + str1.matches(pattern));
		System.out.println("sonson          : " + str2.matches(pattern));
		System.out.println("sonsonson       : " + str3.matches(pattern));
		System.out.println("sonsonsonson    : " + str4.matches(pattern));
		System.out.println("sonsonsonsonson : " + str5.matches(pattern));
	}
}

