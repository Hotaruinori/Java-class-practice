public class ch15_1 {
	public static void main(String[] args) {
		String msg1 = "DeepStone";				// 定義物件msg1
		int hd1 = msg1.hashCode();				// 計算哈希碼
		System.out.println("DeepStone的hashCode : " + hd1);
		String msg2 = msg1;						// 定義物件msg2
		int hd2 = msg2.hashCode();				// 計算哈希碼
		System.out.println("DeepStone的hashCode : " + hd2);
		String msg3 = "明志科大";				// 定義物件msg3
		int hd3 = msg3.hashCode();				// 計算哈希碼
		System.out.println("明志科大的hashCode : " + hd3);
		String msg4 = new String("明志科大");	// 定義物件msg4
		int hd4 = msg4.hashCode();				// 計算哈希碼
		System.out.println("明志科大的hashCode : " + hd4);	
	}
}

