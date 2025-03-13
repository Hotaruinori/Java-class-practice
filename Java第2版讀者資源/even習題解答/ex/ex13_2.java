public class ex13_2 {
	public static void main(String[] args) {
		String str1 = "I love Java";
		String str2 = "0952-909-090";
		String str3 = "134-3981-1391";
		String pattern = "\\d{3}-\\d{4}-\\d{4}";
		System.out.println("I love Java :是中國手機號碼" + str1.matches(pattern));
		System.out.println("0952-909-090:是中國手機號碼" + str2.matches(pattern));
		System.out.println("134-3981-1391:是中國手機號碼" + str3.matches(pattern));
	}
}

