public class ch12_10 {
	public static void main(String[] args) {
		char[] ch = {'明', '志', '科', '技', '大', '學'};
		String str = new String(ch);				// 建立中文內容字串
		System.out.println("str = " + str);
		str = "MINGCHI University of Technology";	// 更改字串內容		
		System.out.println("str = " + str);
	}
}

