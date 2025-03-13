public class ch6_3 {
	public static void main(String[] args) {
		int sum = 0;						// 總和變數
		for ( int i = 1; i <= 10; i++ ) {	// 迴圈內宣告索引變數
			sum += i;						// 計算每個迴圈的總和
			System.out.printf("Loop = %2d,  總和 = %2d%n", i, sum);
		}
	}
}

