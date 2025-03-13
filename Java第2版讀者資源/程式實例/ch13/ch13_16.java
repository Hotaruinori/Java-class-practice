public class ch13_16 {
	public static void main(String[] args) {
		String str1 = "98_ad";
		String str2 = "@!ad9";
		String pattern = "\\w+";		
		System.out.println("98_ad : " + str1.matches(pattern));
		System.out.println("@!ad9 : " + str2.matches(pattern));
	}
}

