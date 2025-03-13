public class ex15_2 {
	public static void main(String[] args) {
		String msg1 = "Jiin-Kwei Hung";								// 定義String物件msg1
		int hd1 = msg1.hashCode();									// String類別哈希碼
		System.out.println("String類別Jiin-Kwei Hung的hashCode : " + hd1);
		StringBuilder msg2 = new StringBuilder(msg1);				// 定義StringBuilder物件msg2
		int hd2 = msg2.hashCode();									// StringBuilder類別哈希碼
		System.out.println("Object類別Jiin-Kwei Hung的hashCode : " + hd2);
		String msg3 = "洪錦魁";										// 定義String物件msg3
		int hd3 = msg3.hashCode();									// String類別哈希碼
		System.out.println("String類洪錦魁的hashCode  : " + hd3);
		StringBuilder msg4 = new StringBuilder(msg3);				// 定義StringBuilder物件msg4
		int hd4 = msg4.hashCode();									// StringBuilder類別哈希碼
		System.out.println("Object類別洪錦魁的hashCode  : " + hd4);	
	}
}

