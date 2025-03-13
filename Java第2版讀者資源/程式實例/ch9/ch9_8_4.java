class Math {
	void addition(int x, int y) {		    // 2個int數字加法
		System.out.println("int加法 : " + (x + y));
	}
	void addition(long x, long y) {			// 2個long數字加法
		System.out.println("long加法 : " + (x + y));
	}
}
public class ch9_8_4 {
	public static void main(String[] args) {
		Math A = new Math();				// Math類別物件
		A.addition(5, 10);					// 不升級為long
	}
}

