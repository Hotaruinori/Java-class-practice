public class ch20_19 {
	public static void myMethod(int x1, int x2) throws ArithmeticException {
		System.out.println("數字除法結果是 : " + (x1 / x2));
	}
	public static void main(String[] args) {
		int[][] x = {{10, 2}, {10, 0}, {10, 5}};	// 二維陣列儲存資料
		for ( int i = 0; i < x.length; i++ ) {		// 迴圈處理測試資料
			try {
				myMethod(x[i][0], x[i][1]);			// 呼叫方法處理測試資料
			}
			catch(ArithmeticException e) {			// 捕捉異常
				System.out.println("除數為0的異常" + e);
			}
		}
	}
}

