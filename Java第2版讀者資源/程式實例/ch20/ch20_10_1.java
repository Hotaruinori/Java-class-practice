public class ch20_11 {
	public static void main(String[] args) {
		try {
			String str = "Ming-Chi";
			char c = str.charAt(3);
			System.out.println("c字元是 : " + c);
			c = str.charAt(10);						// 異常發生
			System.out.println("c字元是 : " + c);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("字串超出索引" + e);
		}
		System.out.println("ch20_11.java程式結束");
	}
}

