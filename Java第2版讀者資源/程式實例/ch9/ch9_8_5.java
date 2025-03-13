class Math {
	void addition(long x, int y) {		    // long+int數字加法
		System.out.println("int加法 : " + (x + y));
	}
	void addition(int x, long y) {			// int+long數字加法
		System.out.println("long加法 : " + (x + y));
	}
}
public class ch9_8_5 {
	public static void main(String[] args) {
		Math A = new Math();				// Math類別物件
		A.addition(5, 10);					// 產生ambiguous
	}
}

