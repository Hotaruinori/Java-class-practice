public class ch12_9 {
	public static void main(String[] args) {
		String str1 = "明志科技大學";
		String str2 = "明志科技大學";
		String str3 = new String("明志科技大學");				// 副本		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str1 = str2 " + (str1 == str2));	// 參照比較
		System.out.println("str1 = str3 " + (str1 == str3));	// 參照比較
		System.out.println("str2 = str3 " + (str2 == str3));	// 參照比較
	}
}

