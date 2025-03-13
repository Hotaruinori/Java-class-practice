public class ch12_21 {
	public static void main(String[] args) {
		String str1 = "明志科技大學";
		String str2 = "明志科技大學";
		String str3 = new String("明志科技大學");				// 副本		
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str1 = str2 " + str1.equals(str2));	// 字串內容比較
		System.out.println("str1 = str3 " + str1.equals(str3));	// 字串內容比較
		System.out.println("str2 = str3 " + str2.equals(str3));	// 字串內容比較
	}
}

