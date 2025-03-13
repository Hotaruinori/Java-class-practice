class Math {
	void addition(long x, int y) {		    	// 2個數字加法
		System.out.println((x + y));
	}
	void addition(int x, int y, int z) {		// 3個數字加法
		System.out.println((x + y + z));
	}
}
public class ch9_8_3 {
	public static void main(String[] args) {
		Math A = new Math();					// Math類別物件
		A.addition(5, 10);						// 第1個int升級為long
		A.addition(5, 10, 15);
	}
}

