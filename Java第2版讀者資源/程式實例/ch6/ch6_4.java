public class ch6_4 {
	public static void main(String[] args) {
		int i, j;							// i是外層,j是內層迴圈變數
		for ( i = 1; i <= 9; i++ ) {		// 外層迴圈
			for ( j = 1; j <= 9; j++ )		// 內層迴圈
				System.out.printf("%d*%d=%2d  ", i, j, (i*j));
			System.out.println("");			// 換行輸出
		}
	}
}

