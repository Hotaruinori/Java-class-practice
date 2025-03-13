public class ch20_7 {
	public static void main(String[] args) {
	int[] x = {5, 6, 7, 8, 9};
	int sum = 0;
		for ( int i = 0; i <= x.length; i++ ) { 	// 加法迴圈	
			try {
				sum += x[i];						// 加法總計
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("索引值i超出範圍" + e);
				break;				// 由於索引超出範圍所以直接跳出迴圈
			}
			System.out.printf("索引值 : %d,  加總結果 : %d\n", i, sum);	
		}
	}
}

