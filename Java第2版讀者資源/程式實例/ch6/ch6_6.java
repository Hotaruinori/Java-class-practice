public class ch6_6 {
	public static void main(String[] args) {
		int i, j;							// i是外層,j是內層迴圈變數
		i = j = 1;
		while ( i <= 9 ) {		            // 外層迴圈
			while ( j <= 9 ) {				// 內層迴圈
				System.out.printf("%d*%d=%2d  ", i, j, (i*j));
				j++;						// 讓內層迴圈變數加1			
			}
			i++;							// 讓外層迴圈變數加1
			j = 1;							// 復原內層迴圈變數為1
			System.out.println("");			// 換行輸出
		}
	}
}

