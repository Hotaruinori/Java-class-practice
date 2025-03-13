public class ch20_10 {
	public static void main(String[] args) {
		try {
			String str = "Ming-Chi";
			char c = str.charAt(3);
			System.out.println("c字元是 : " + c);
			c = str.charAt(10);						// 異常發生
			System.out.println("c字元是 : " + c);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("索引超出範圍" + e);
		}
		System.out.println("ch20_10.java程式結束");
	}
}

