public class ch13_6 {
	public static void main(String[] args) {
		String str1 = "I love Java";
		String str2 = "0952-909-090";
		String str3 = "1111-1111111";
		String pattern = "\\d{4}-\\d{3}-\\d{3}";
		System.out.println("I love Java :是台灣手機號碼" + str1.matches(pattern));
		System.out.println("0952-909-090:是台灣手機號碼" + str2.matches(pattern));
		System.out.println("1111-1111111:是台灣手機號碼" + str3.matches(pattern));
	}
}

