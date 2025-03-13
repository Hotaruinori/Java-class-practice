public class ch12_11 {
	public static void main(String[] args) {
		char[] ch1 = {'明', '志', '科', '技', '大', '學'};
		char[] ch2 = {'M', 'I', 'N', 'G', '-', 'C', 'H', 'I'};
		String str1 = new String(ch1);			// 建立中文內容字串
		String str2 = new String(ch2);			// 建立英文內容字串
		String str3 = new String();				// 建立空字串
		System.out.println("str1字串內容 = " + str1);
		System.out.println("str1字串長度 = " + str1.length());
		System.out.println("str1是空字串 = " + str1.isEmpty());
		System.out.println("str2字串內容 = " + str2);
		System.out.println("str2字串長度 = " + str2.length());
		System.out.println("str2是空字串 = " + str2.isEmpty());
		System.out.println("str3字串內容 = " + str3);
		System.out.println("str3字串長度 = " + str3.length());
		System.out.println("str3是空字串 = " + str3.isEmpty());
	}
}

