public class ch12_8 {
	public static void main(String[] args) {
		char[] ch1 = {'明', '志', '科', '技', '大', '學'};
		String str1 = new String();				// 建立空字串
		String str2 = new String(ch1);			// 建立中文內容字串
		String str3 = new String(str2);			// 建立str2字串副本
		str1 = str2;							// 相同參照
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("str3 = " + str3);
		System.out.println("str1 = str2 " + (str1 == str2));	// 參照比較
		System.out.println("str3 = str2 " + (str3 == str2));	// 副本比較	
	}
}

