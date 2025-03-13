public class ch12_15 {
	public static void main(String[] args) {
		String str = "神鵰俠侶是楊過與小龍女的故事";
		System.out.println("索引2的字元 = " + str.charAt(2));
		System.out.println("索引5新字串 = " + str.substring(5));
		System.out.println("索引5-11新字串 = " + str.substring(5, 11));
		char[] ch = str.toCharArray();		// 將字串物件str轉成字元陣列ch
		System.out.println(ch);				// 列印字元陣列內容
		System.out.println("列印部分字元陣列內容 = " + ch[0] + ch[1] + ch[2] + ch[3]);
	}
}

