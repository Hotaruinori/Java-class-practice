public class ch6_7 {
	public static void main(String[] args) {
		int sum = 0;						// 總和變數
		int i = 1;							// while迴圈的變數
		do {
			sum += i;						// 計算每個迴圈的總和
			System.out.printf("Loop = %2d,  總和 = %2d%n", i, sum);
			i++;							// 讓迴圈變數加1
		} while ( i <= 10 );
	}
}

