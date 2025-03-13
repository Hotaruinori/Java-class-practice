public class ch13_8 {
	public static void main(String[] args) {
		String str1 = "I love Java";
		String str2 = "0952-909-090";
		String str3 = "(111)-1111111";
		String pattern = "\\d{4}(-\\d{3}){2}";		// 正規表達式以小括號處理分組
		System.out.println("I love Java   : 是台北市區號碼" + str1.matches(pattern));
		System.out.println("0952-909-090  : 是台北市區號碼" + str2.matches(pattern));
		System.out.println("(111)-1111111 : 是台北市區號碼" + str3.matches(pattern));
	}
}

