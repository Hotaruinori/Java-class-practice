public class ch13_10 {
	public static void main(String[] args) {
		String str1 = "02-23339999";
		String str2 = "(02)-23339999";
		String str3 = "(111)-1111111";
// 在正規表達式以括號與不含括號處理區域號碼
		String pattern = "\\(\\d{2}\\)-\\d{8}|\\d{2}-\\d{8}";		
		System.out.println("02-23339999   : 是台北市區號碼" + str1.matches(pattern));
		System.out.println("(02)-23339999 : 是台北市區號碼" + str2.matches(pattern));
		System.out.println("(111)-1111111 : 是台北市區號碼" + str3.matches(pattern));
	}
}

